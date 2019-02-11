package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public List<Employee> get();
	
	public Employee get(int id);
	
	public void save(Employee e);
	
	public void delete(int id);
}
