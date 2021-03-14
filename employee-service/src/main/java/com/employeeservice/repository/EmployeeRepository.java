package com.employeeservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employeeservice.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


}
