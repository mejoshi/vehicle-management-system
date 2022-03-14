package com.ashutosh.vms.service;

import java.util.List;

import com.ashutosh.vms.entity.Vehicle;

public interface VehicleService {
	List<Vehicle> getAllVehicles();
	void saveVehicle(Vehicle vehicle);
	Vehicle getVehicleById(long id);
	void deleteVehicleById(long id);
}
