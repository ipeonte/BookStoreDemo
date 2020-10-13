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
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	// bi-directional many-to-one association to CustomerBook
	@OneToMany(mappedBy = "customer")
	private List<CustomerBook> customerBooks;

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	public Customer(Integer id, String name) {
		this(name);
		this.id = id;
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

	public List<CustomerBook> getCustomerBooks() {
		return this.customerBooks;
	}

	public void setCustomerBooks(List<CustomerBook> customerBooks) {
		this.customerBooks = customerBooks;
	}

	public CustomerBook addCustomerBook(CustomerBook customerBook) {
		getCustomerBooks().add(customerBook);
		customerBook.setCustomer(this);

		return customerBook;
	}

	public CustomerBook removeCustomerBook(CustomerBook customerBook) {
		getCustomerBooks().remove(customerBook);
		customerBook.setCustomer(null);

		return customerBook;
	}

}