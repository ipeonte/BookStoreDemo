package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BaseBookDto;
import com.example.demo.dto.BaseCustomerDto;
import com.example.demo.dto.ExtBookDto;
import com.example.demo.model.Book;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerBook;
import com.example.demo.repo.BookRepo;
import com.example.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo bookRepo;

	@Override
	public BaseBookDto createBook(BaseBookDto book) {
		return getBookInstance(bookRepo.save(new Book(book.getAuthor(), book.getTitle())));
	}

	@Override
	public BaseBookDto updateBook(Integer id, BaseBookDto book) {
		return getBookInstance(bookRepo.save(new Book(id, book.getAuthor(), book.getTitle())));
	}

	private BaseBookDto getBookInstance(Book book) {
		return new BaseBookDto(book.getId(), book.getAuthor(), book.getTitle());
	}

	@Override
	public List<ExtBookDto> listBooks() {
		List<ExtBookDto> result = new ArrayList<>();

		for (Book b : bookRepo.findAllByOrderByTitle()) {
			ExtBookDto book = new ExtBookDto(b.getId(), b.getAuthor(), b.getTitle());

			List<CustomerBook> list = b.getCustomerBooks();
			if (list != null) {
				List<BaseCustomerDto> customers = new ArrayList<>();

				for (CustomerBook custBook : list) {
					Customer customer = custBook.getCustomer();
					customers.add(new BaseCustomerDto(customer.getId(), customer.getName()));
				}

				book.setCustomers(customers);
			}

			result.add(book);
		}

		return result;
	}

	@Override
	public void deleteBook(Integer id) {
		bookRepo.deleteById(id);
	}
}
