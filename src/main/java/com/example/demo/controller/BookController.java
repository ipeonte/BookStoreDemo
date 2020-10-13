package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BaseBookDto;
import com.example.demo.dto.ExtBookDto;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(path = "", method = RequestMethod.POST)
	public BaseBookDto createBook(@RequestBody BaseBookDto book) {
		return bookService.createBook(book);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public BaseBookDto updateBook(@PathVariable Integer id, @RequestBody BaseBookDto book) {
		return bookService.updateBook(id, book);
	}

	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<ExtBookDto> listBooks() {
		return bookService.listBooks();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
}
