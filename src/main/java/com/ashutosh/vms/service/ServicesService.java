package com.ashutosh.vms.service;

import java.util.List;

import com.ashutosh.vms.entity.Customer;
import com.ashutosh.vms.entity.Services;

public interface ServicesService {
	List<Services> getAllServices();
	void saveServices(Services services);
	Services getServicesById(long id);
	void deleteServicesById(long id);
}
