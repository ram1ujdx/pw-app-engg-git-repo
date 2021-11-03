package com.empmgmnt.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.empmgmnt.app.model.Employee;

class EmployeeDaoImplTest {
	
	EmployeeDao dao;
	Employee emp;
	
	@BeforeEach
	public void initEachTest() {
		dao=new EmployeeDaoImpl();
		emp=new Employee(1000, "Mahesh", LocalDate.of(1995, 5, 10), "mahesh@yahoo.com");
		 dao.saveEmployee(emp);
	}
	
	@AfterEach
	public void afterEachTest() {
		dao.deleteEmployeeById(emp.getEmployeeId());
	}

	@Test
	void testSaveEmployee() {
		
		Employee emp=new Employee(1111, "Hitesh", LocalDate.of(1995, 5, 10), "hitesh@yahoo.com");
		assertEquals(emp, dao.saveEmployee(emp));
		
	}

	@Test
	void testGetEmployeeById() {
		
	}

	@Test
	void testDeleteEmployeeById() {
		
		assertTrue(dao.deleteEmployeeById(emp.getEmployeeId()));
		
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetAllEmployees() {
		
	}

}
