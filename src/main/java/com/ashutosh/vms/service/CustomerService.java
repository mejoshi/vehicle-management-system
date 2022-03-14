package com.ashutosh.vms.service;

import java.util.List;

import com.ashutosh.vms.entity.Customer;

public interface CustomerService {
		List<Customer> getAllCustomers();
		void saveCustomer(Customer customer);
		Customer getCustomerById(long id);
		void deleteCustomerById(long id);
	
}
