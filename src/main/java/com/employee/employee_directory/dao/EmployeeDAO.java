package com.employee.employee_directory.dao;

import java.util.List;

import com.employee.employee_directory.modal.Employee;

public interface EmployeeDAO {

// Define all the method variables you need
// Get list of all Employees
// Get employee by Id
// save an employee
// Delete an employee by id
	
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}
