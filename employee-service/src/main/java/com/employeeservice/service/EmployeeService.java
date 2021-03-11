package com.employeeservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeservice.model.Employee;
import com.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	@Autowired
	private EmployeeRepository repository;

	public Iterable<Employee> findAll() {
		logger.info("Find All Employee");
		Iterable<Employee> emp = repository.findAll();
		return emp;
	}

	public Employee findById(int id) {
		logger.info("Find EMployee by Id");
		
		Optional<Employee> emp = repository.findById(id);

		return emp.get();
	}
	
	public Employee save(Employee e) {
		logger.info("Save Employee");
		Employee emp = repository.save(e);
		return emp;
		
	}
	
	public void delete(int id) {
		logger.info("Delete Employee..");
		repository.deleteById(id);
	}

}
