package com.employee.employee_directory.service;

import java.util.List;

import com.employee.employee_directory.modal.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}
