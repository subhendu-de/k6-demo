package com.k6demo.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Employee {

	@Id
	private String id;

	private String emp_name;

	private String hobby;

}
