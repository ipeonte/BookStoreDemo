package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BaseBookDto;
import com.example.demo.dto.ExtBookDto;

public interface BookService {

	BaseBookDto createBook(BaseBookDto book);

	BaseBookDto updateBook(Integer id, BaseBookDto book);

	List<ExtBookDto> listBooks();

	void deleteBook(Integer id);
}
