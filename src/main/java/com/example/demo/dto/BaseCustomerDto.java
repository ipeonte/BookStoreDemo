package com.example.demo.dto;

/**
 * The dto class for the customer database table.
 * 
 */

public class BaseCustomerDto {

	private Integer id;

	private String name;

	public BaseCustomerDto() {
	};

	public BaseCustomerDto(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}