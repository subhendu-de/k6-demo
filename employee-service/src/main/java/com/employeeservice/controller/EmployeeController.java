package com.employeeservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeservice.model.Employee;
import com.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService service;

	@GetMapping("/all")
	public List<Employee> getAllEmployee() {

		logger.info("AllEmp");
		Iterable<Employee> emp = service.findAll();
		List<Employee> empList = new ArrayList();

		for (Employee e : emp) {
			empList.add(e);
		}
		return empList;
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {

		logger.info("AllEmp By id");
		logger.info("MSG", id);
		Employee emp = service.findById(id);
		logger.info(emp.toString());
		System.out.println("Emp,,," + emp);
		return emp;

	}
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee e) {
		logger.info("Save Employee..");
		return service.save(e);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.delete(id);
	}

}
