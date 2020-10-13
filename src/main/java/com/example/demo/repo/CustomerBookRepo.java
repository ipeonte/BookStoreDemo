package com.example.demo.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CustomerBook;

@Repository
public interface CustomerBookRepo extends CrudRepository<CustomerBook, Integer> {

	@Transactional
	void deleteByCustomerIdAndBookId(Integer customerId, Integer bookId);
}
