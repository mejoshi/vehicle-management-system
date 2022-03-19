package com.ashutosh.vms.service;

import java.util.List;

import com.ashutosh.vms.entity.User;

public interface UserService {
	List<User> getAllUsers();
	void saveUser(User services);
	User getUserById(Long id);
	void deleteUserById(Long id);
}
