package com.saiteja.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saiteja.entity.Employee;
import com.saiteja.repository.EmployeeRepo;
import com.saiteja.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@RequestMapping("/")
	public String emp()
	{
		return "Hello";
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
		
	}
	
	@PostMapping("/saveEmp")
	public Employee saveEmployees(@RequestBody Employee employee)
	{
		return employeeService.saveEmployees(employee);
	}
	
	@GetMapping("/getEmp/{id}")
	public Optional<Employee> getEmployeeId(@PathVariable int id)
	{
		return employeeService.getEmployeeId(id);
	}
	
	@GetMapping("/getEmp/{name}")
	public Employee getEmployeeByName(@PathVariable String name)
	{
		return employeeService.getEmployeeByName(name);
	}
	
//	@GetMapping("/getEmp/{city}")
//	public ResponseEntity<List<Employee>> getEmployeeByCityName(@PathVariable String city)
//	{
//		List<Employee> employee = employeeRepo.findByCity(city);
//		
//		return new ResponseEntity<List<Employee>>(employee,HttpStatus.CREATED);
//	}
	

}	

