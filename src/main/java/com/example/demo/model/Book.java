package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the book database table.
 * 
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String author;

	private String title;

	// bi-directional many-to-one association to CustomerBook
	@OneToMany(mappedBy = "book")
	private List<CustomerBook> customerBooks;

	public Book() {
	}

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public Book(Integer id, String author, String title) {
		this(author, title);
		this.id = id;
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

	public List<CustomerBook> getCustomerBooks() {
		return this.customerBooks;
	}

	public void setCustomerBooks(List<CustomerBook> customerBooks) {
		this.customerBooks = customerBooks;
	}

	public CustomerBook addCustomerBook(CustomerBook customerBook) {
		getCustomerBooks().add(customerBook);
		customerBook.setBook(this);

		return customerBook;
	}

	public CustomerBook removeCustomerBook(CustomerBook customerBook) {
		getCustomerBooks().remove(customerBook);
		customerBook.setBook(null);

		return customerBook;
	}

}