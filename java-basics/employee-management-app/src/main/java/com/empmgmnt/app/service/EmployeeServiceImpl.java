package com.empmgmnt.app.service;

import com.empmgmnt.app.dao.EmployeeDao;
import com.empmgmnt.app.dao.EmployeeDaoImpl;
import com.empmgmnt.app.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return dao.saveEmployee(employee);
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		
		return dao.getEmployeeById(employeeId);
	}

}
