package com.ashutosh.vms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashutosh.vms.entity.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long>{

}
