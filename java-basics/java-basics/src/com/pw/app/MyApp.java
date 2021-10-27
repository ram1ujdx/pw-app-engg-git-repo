package com.pw.app;

public class MyApp {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee(1001,"Rahul Sharma", 56000);
		
		Employee emp2=new Employee(1002, "Priya Dutta", 62000);
		
		Employee.country="USA";
		
		System.out.println(emp);
		
		System.out.println(emp2);
		
		
	}
	
}
