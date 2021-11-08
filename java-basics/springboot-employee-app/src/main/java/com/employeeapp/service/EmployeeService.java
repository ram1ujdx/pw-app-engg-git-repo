package com.employeeapp.service;

import com.employeeapp.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee) throws Exception;
	
	
	public Employee searchEmployeeById(int employeeId) throws Exception;
	
}
