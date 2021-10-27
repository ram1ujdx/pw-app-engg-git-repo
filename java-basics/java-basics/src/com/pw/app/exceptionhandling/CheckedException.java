package com.pw.app.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.security.auth.login.FailedLoginException;





public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader=null;
		Scanner scanner=null;
		
		
			reader=new FileReader("my.txt");
			scanner=new Scanner(reader);
			
			String text=scanner.nextLine();
			
			System.out.println(text);
			
			
		
		
	
		
		
		
		
	}
	
	
}
