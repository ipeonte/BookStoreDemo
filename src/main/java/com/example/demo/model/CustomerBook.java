package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the customer_book database table.
 * 
 */
@Entity
@Table(name = "customer_book")
public class CustomerBook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// bi-directional many-to-one association to Book
	@ManyToOne
	private Book book;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	private Customer customer;

	public CustomerBook() {
	}

	public CustomerBook(Customer customer, Book book) {
		this.customer = customer;
		this.book = book;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}