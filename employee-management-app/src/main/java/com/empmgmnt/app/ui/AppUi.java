package com.empmgmnt.app.ui;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.empmgmnt.app.model.Employee;
import com.empmgmnt.app.service.EmployeeService;
import com.empmgmnt.app.service.EmployeeServiceImpl;

@Component
@Scope("singleton")
@Lazy
public class AppUi {

	private Scanner scanner=new Scanner(System.in);
	
	@Autowired
	private EmployeeService service;
	

	public AppUi() {
		System.out.println("App UI Object Created..");
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
		
		try {
			service.addEmployee(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		
	}
	
	public void searchEmployee() {
		
		System.out.println("Enter employee details");
		
		System.out.print("ID : ");
		int employeeId=scanner.nextInt();
		
		Employee emp;
		try {
			emp = service.searchEmployeeById(employeeId);
			System.out.println(emp);
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
