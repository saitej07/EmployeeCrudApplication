package com.saiteja.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.saiteja.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	public Employee findByName(String name);
	
	//public List<Employee> findByCity(String city);

}
