package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BaseBookDto;
import com.example.demo.dto.BaseCustomerDto;
import com.example.demo.dto.ExtCustomerDto;
import com.example.demo.model.Book;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerBook;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public BaseCustomerDto createCustomer(BaseCustomerDto customer) {
		return getCustomerInstance(customerRepo.save(new Customer(customer.getName())));
	}

	@Override
	public BaseCustomerDto updateCustomer(Integer id, BaseCustomerDto customer) {
		return getCustomerInstance(customerRepo.save(new Customer(id, customer.getName())));
	}

	private BaseCustomerDto getCustomerInstance(Customer customer) {
		return new BaseCustomerDto(customer.getId(), customer.getName());
	}

	@Override
	public List<ExtCustomerDto> listCustomers() {
		List<ExtCustomerDto> result = new ArrayList<>();

		for (Customer c : customerRepo.findAllByOrderByName()) {
			ExtCustomerDto customer = new ExtCustomerDto(c.getId(), c.getName());

			List<CustomerBook> list = c.getCustomerBooks();
			if (list != null) {
				List<BaseBookDto> books = new ArrayList<>();

				for (CustomerBook custBook : list) {
					Book book = custBook.getBook();
					books.add(new BaseBookDto(book.getId(), book.getAuthor(), book.getTitle()));
				}

				customer.setBooks(books);
			}

			result.add(customer);
		}

		return result;
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerRepo.deleteById(id);
	}
}
