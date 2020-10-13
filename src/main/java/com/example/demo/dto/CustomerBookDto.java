package com.example.demo.dto;

/**
 * The dto class for the customer_book database table.
 * 
 */
public class CustomerBookDto {
	private Integer id;

	private Integer bookId;

	private Integer customerId;

	public CustomerBookDto() {
	}

	public CustomerBookDto(Integer bookId, Integer customerId) {
		this.bookId = bookId;
		this.customerId = customerId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
}