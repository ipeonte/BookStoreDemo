package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CustomerBook;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.CustomerBookRepo;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerBookService;

@Service
public class CustomerBookServiceImpl implements CustomerBookService {

	@Autowired
	CustomerBookRepo repo;

	@Autowired
	CustomerRepo custRepo;

	@Autowired
	BookRepo bookRepo;

	@Override
	public void addCustomerBook(Integer customerId, Integer bookId) {
		repo.save(new CustomerBook(custRepo.findById(customerId).get(), bookRepo.findById(bookId).get()));
	}

	@Override
	public void removeCustomerBook(Integer customerId, Integer bookId) {
		repo.deleteByCustomerIdAndBookId(customerId, bookId);

	}

}
