package com.pw.app.exceptionhandling;

public class MainApp {

	public static void main(String[] args) {
		
		AgeManipulation obj=new AgeManipulation();
		
		try {
			obj.inputAge(-100);
		} catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
