package com.employee.employee_directory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee_directory.dao.EmployeeDAO;
import com.employee.employee_directory.modal.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
//	create methods
	
	@Transactional
	@Override
	public List<Employee> get(){
		return employeeDAO.get();
	}
	
	
	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDAO.get(id);
	}
	
	@Transactional
	@Override
	public void save(Employee emp) {
		employeeDAO.save(emp);
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		employeeDAO.delete(id);
	}
	
}
