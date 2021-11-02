package com.empmgmnt.app.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.empmgmnt.app.model.Employee;
import com.empmgmnt.app.service.EmployeeService;
import com.empmgmnt.app.service.EmployeeServiceImpl;

public class AppUi {

	Scanner scanner;
	
	EmployeeService service;
	
	public AppUi() {
		scanner = new Scanner(System.in);
		service=new EmployeeServiceImpl();
	}
	
	public void addEmployee() {
		
		
		
		System.out.println("Enter employee details");
		
		System.out.print("ID : ");
		int employeeId=scanner.nextInt();
		
		System.out.print("Name : ");
		String employeeName = scanner.next() + scanner.nextLine();
		
		System.out.print("BIRTH DATE [yyyy-mm-dd] : ");
		String dobString = scanner.next() + scanner.nextLine();
		LocalDate dob = LocalDate.parse(dobString);
		
		System.out.print("Email : ");
		String email=scanner.next() + scanner.nextLine();
		
		Employee employee= new Employee(employeeId, employeeName, dob, email);
		
		service.addEmployee(employee);
		
		System.out.println();
		
		
	}
	
	public void searchEmployee() {
		
		System.out.println("Enter employee details");
		
		System.out.print("ID : ");
		int employeeId=scanner.nextInt();
		
		Employee emp = service.searchEmployeeById(employeeId);
		
		System.out.println(emp);
		System.out.println();
		
		
	}
	
	
}
