package com.ashutosh.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashutosh.vms.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
