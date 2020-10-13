package com.example.demo.dto;

import java.util.List;

/**
 * The dto class for the customer database table.
 * 
 */
public class ExtCustomerDto extends BaseCustomerDto {

	private List<BaseBookDto> books;

	public ExtCustomerDto() {
	}

	public ExtCustomerDto(int id, String name) {
		super(id, name);
	}

	public List<BaseBookDto> getBooks() {
		return books;
	}

	public void setBooks(List<BaseBookDto> books) {
		this.books = books;
	}
}