package com.ashutosh.vms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity
public class Vehicle{

	@Id
	@GeneratedValue
	int vehicle_id;
	String vehicle_number;
	String vehicle_type;
	int vehicle_customer_id;
	String vehicle_desciption;


	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public int getVehicle_customer_id() {
		return vehicle_customer_id;
	}

	public void setVehicle_customer_id(int vehicle_customer_id) {
		this.vehicle_customer_id = vehicle_customer_id;
	}

	public String getVehicle_desciption() {
		return vehicle_desciption;
	}

	public void setVehicle_desciption(String vehicle_desciption) {
		this.vehicle_desciption = vehicle_desciption;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_number=" + vehicle_number + ", vehicle_type="
				+ vehicle_type + ", vehicle_customer_id=" + vehicle_customer_id + ", vehicle_desciption="
				+ vehicle_desciption + "]";
	}

}
