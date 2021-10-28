package com.pw.app.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.security.auth.login.FailedLoginException;

public class CheckedException {

	public static void main(String[] args) {
		FileReader reader = null;
		Scanner scanner = null;

		try {
			reader = new FileReader("my.txt");

			scanner = new Scanner(reader);

			String text = scanner.nextLine();

			System.out.println(text);

		} 
		catch (FileNotFoundException e) {
			
		}
		
		catch (IOException e) {
			
		}
		catch (Exception e) {
			
		}

	}

}
