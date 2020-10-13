package com.example.demo.dto;

/**
 * The dto class for the book database table.
 * 
 */
public class BaseBookDto {

	private Integer id;

	private String author;

	private String title;

	public BaseBookDto() {
	}

	public BaseBookDto(int id, String author, String title) {
		this.id = id;
		this.author = author;
		this.title = title;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}