package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BaseCustomerDto;
import com.example.demo.dto.ExtCustomerDto;
import com.example.demo.service.CustomerBookService;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService custService;

	@Autowired
	CustomerBookService custBookService;

	@RequestMapping(path = "", method = RequestMethod.POST)
	public BaseCustomerDto createCustomer(@RequestBody BaseCustomerDto customer) {
		return custService.createCustomer(customer);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public BaseCustomerDto updateCustomer(@PathVariable Integer id, @RequestBody BaseCustomerDto customer) {
		return custService.updateCustomer(id, customer);
	}

	@RequestMapping(path = "/{cust_id}/books/{book_id}", method = RequestMethod.POST)
	public void addCustomerBook(@PathVariable("cust_id") Integer customerId, @PathVariable("book_id") Integer bookId) {
		custBookService.addCustomerBook(customerId, bookId);
	}

	@RequestMapping(path = "/{cust_id}/books/{book_id}", method = RequestMethod.DELETE)
	public void removeCustomerBook(@PathVariable("cust_id") Integer customerId,
			@PathVariable("book_id") Integer bookId) {
		custBookService.removeCustomerBook(customerId, bookId);
	}

	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<ExtCustomerDto> listCustomers() {
		return custService.listCustomers();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable Integer id) {
		custService.deleteCustomer(id);
	}
}
