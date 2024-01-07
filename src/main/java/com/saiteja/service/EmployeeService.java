package com.saiteja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.saiteja.entity.Employee;
import com.saiteja.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

	public Employee saveEmployees(@RequestBody Employee employee) {
		
		return employeeRepo.save(employee);
	}

	public Employee getEmployeeByName(String name) {
		
		return employeeRepo.findByName(name);
	}

	public Optional<Employee> getEmployeeId(int id) {
		
		return employeeRepo.findById(id);
	}

	

//	public ResponseEntity<Employee> getEmployeeByCityName(String city) {
//		
//		return employeeRepo.findByCity(city);
//	}
	

	
}
