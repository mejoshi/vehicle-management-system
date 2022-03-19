package com.ashutosh.vms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashutosh.vms.entity.Customer;

public interface CustomerService {
		List<Customer> getAllCustomers();
		void saveCustomer(Customer customer);
		Customer getCustomerById(Long id);
		void deleteCustomerById(Long id);
	
}
