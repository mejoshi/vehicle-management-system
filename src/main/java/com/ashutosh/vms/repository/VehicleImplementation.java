package com.ashutosh.vms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashutosh.vms.entity.Vehicle;
import com.ashutosh.vms.service.VehicleService;

@Service
public class VehicleImplementation implements VehicleService{

	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public List<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

	@Override
	public void saveVehicle(Vehicle vehicle) {
			vehicleRepository.save(vehicle);
		
	}

	@Override
	public Vehicle getVehicleById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVehicleById(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
