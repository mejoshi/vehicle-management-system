package com.ashutosh.vms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Status implements Serializable{
	
	@Id
	@GeneratedValue
	int status_id;
	

	int vehicle_id;
	String vehicle_status;
	
	@MapsId
	@OneToOne
	@PrimaryKeyJoinColumn(name = "vehicle_id", referencedColumnName = "vehicle_id")
	Vehicle vehicle;
	
	public int getStatus_id() {
		return status_id;
	}
	
	public String getVehicle_status() {
		return vehicle_status;
	}
	public void setVehicle_status(String vehicle_status) {
		this.vehicle_status = vehicle_status;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	
	public void setVehicle_id() {
		 this.vehicle_id = vehicle_id;
	}
	
}
