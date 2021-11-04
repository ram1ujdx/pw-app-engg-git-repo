package com.empmgmnt.app.dao;

import java.util.List;

import com.empmgmnt.app.model.Employee;

public interface EmployeeDao {

	public Employee saveEmployee(Employee employee) throws Exception;
	
	public Employee getEmployeeById(int employeeId) throws Exception;
	
	
	public boolean deleteEmployeeById(int employeeId) throws Exception;
	
	
	public Employee updateEmployee(Employee employee) throws Exception;
	
	
	public List<Employee> getAllEmployees() throws Exception;
	
	
	
}
