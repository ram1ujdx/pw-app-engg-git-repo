package com.pw.app.exceptionhandling;

public class AgeManipulation {

	
	public void inputAge(int age) throws InvalidAgeException {
		
		if(age<=0 || age>150) {
			throw new InvalidAgeException("Invalid Age - "+age);
		}
		System.out.println("Age Noted..");
		
	}
	
}
