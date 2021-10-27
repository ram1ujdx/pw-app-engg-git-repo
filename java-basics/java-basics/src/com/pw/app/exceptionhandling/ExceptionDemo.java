package com.pw.app.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {

		int x = 5;

		System.out.println("Division Started");
		for (int i = 0; i < 5; i++) {
			try {
				int r = x / i;
				System.out.println(r);
				System.out.println("Division Successful by " + i);
			} catch (ArithmeticException e) {
				System.err.println("Division Unuccessful by " + i);
			}
		}

		System.out.println("Operation Completed..");
		System.out.println("Bye..");

	}

}
