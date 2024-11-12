package com.employee.employee_directory.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.employee_directory.modal.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOImp implements EmployeeDAO{
	
	
	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Employee> get(){
		Session currSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currSession.createQuery("from Employee", Employee.class);
		
		List<Employee> list= query.getResultList();
		
		return list;
	}
		
	
	@Override
	 public Employee get(int id) {
	  Session currSession = entityManager.unwrap(Session.class);
	  Employee emp = currSession.get(Employee.class, id);
	  return emp;
	 }
	
	@Override
	public void save(Employee employee) {
		Session currSession = entityManager.unwrap(Session.class);
		
		currSession.persist(employee);
	}
	
	
	public void delete(int id) {
		Session currSession = entityManager.unwrap(Session.class);
		Employee emp = currSession.get(Employee.class, id);
		currSession.remove(emp);
	}
		
	
}
