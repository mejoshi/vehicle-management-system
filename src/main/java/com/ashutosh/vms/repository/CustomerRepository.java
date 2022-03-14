package com.ashutosh.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashutosh.vms.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
		
}
