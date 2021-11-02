package com.empmgmnt.app.dao;

import java.util.List;

import com.empmgmnt.app.model.Employee;

public interface EmployeeDao {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	
	public boolean deleteEmployeeById(int employeeId);
	
	
	public Employee updateEmployee(Employee employee);
	
	
	public List<Employee> getAllEmployees();
	
	
	
}
