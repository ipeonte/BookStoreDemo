package com.example.demo.dto;

import java.util.List;

/**
 * The dto class for the book database table.
 * 
 */
public class ExtBookDto extends BaseBookDto {

	private List<BaseCustomerDto> customers;

	public ExtBookDto() {
	}

	public ExtBookDto(int id, String author, String title) {
		super(id, author, title);
	}

	public List<BaseCustomerDto> getCustomers() {
		return customers;
	}

	public void setCustomers(List<BaseCustomerDto> customers) {
		this.customers = customers;
	}
}