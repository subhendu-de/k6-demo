package com.k6demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.k6demo.model.Employee;

@Repository
public interface K6DemoRepository extends CrudRepository<Employee, Integer> {


}
