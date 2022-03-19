package com.ashutosh.vms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashutosh.vms.entity.Services;
import com.ashutosh.vms.service.ServicesService;

public class ServicesImplementation implements ServicesService{


	
	@Override
	public List<Services> getAllServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveServices(Services services) {
		
		
	}

	@Override
	public Services getServicesById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteServicesById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
