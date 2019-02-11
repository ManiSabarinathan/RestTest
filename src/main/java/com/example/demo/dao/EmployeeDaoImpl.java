package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Employee> get() {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee");
		List<Employee> empList = query.getResultList();
		return empList;
	}

	@Override
	public Employee get(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Employee.class, id);		
	}

	@Override
	public void save(Employee e) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(e);	
	}

	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee ee = session.get(Employee.class, id);
		session.delete(ee);
		
	}

}
