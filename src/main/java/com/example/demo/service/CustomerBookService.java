package com.example.demo.service;

public interface CustomerBookService {

	void addCustomerBook(Integer customerId, Integer bookId);

	void removeCustomerBook(Integer customerId, Integer bookId);
}
