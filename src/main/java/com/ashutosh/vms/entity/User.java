package com.ashutosh.vms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int user_id;
	private String user_name;
	private boolean user_super_permission;
	private String user_password;
	private String super_user_code = "1X2B3Y";
	
	public User() {
		
	}
	
	
	public String getsuperUserCode() {
		return this.super_user_code;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public boolean isUser_super_permission() {
		return user_super_permission;
	}

	public void setUser_super_permission(boolean user_super_permission) {
		this.user_super_permission = user_super_permission;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getUser_id() {
		return user_id;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_super_permission="
				+ user_super_permission + ", user_password=" + user_password + "]";
	}

}
