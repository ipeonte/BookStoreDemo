package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {

	Iterable<Book> findAllByOrderByTitle();
}
