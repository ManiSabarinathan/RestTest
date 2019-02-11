package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {

	public List<Employee> get();
	
	public Employee get(int id);
	
	public void save(Employee e);
	
	public void delete(int id);
}
