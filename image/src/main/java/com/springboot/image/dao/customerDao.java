package com.springboot.image.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.image.entities.Customer;
@Repository
public interface customerDao extends JpaRepository<Customer,String> {
	
}
