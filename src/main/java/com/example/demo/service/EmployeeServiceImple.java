package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDao.get();		
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);		
	}

	@Transactional
	@Override
	public void save(Employee e) {
		employeeDao.save(e);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDao.delete(id);
		
	} 

}
