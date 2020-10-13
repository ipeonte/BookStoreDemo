package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BaseCustomerDto;
import com.example.demo.dto.ExtCustomerDto;

public interface CustomerService {

	BaseCustomerDto createCustomer(BaseCustomerDto customer);

	BaseCustomerDto updateCustomer(Integer id, BaseCustomerDto customer);

	List<ExtCustomerDto> listCustomers();

	void deleteCustomer(Integer id);
}
