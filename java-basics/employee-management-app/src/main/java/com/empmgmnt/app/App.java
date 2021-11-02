package com.empmgmnt.app;

import java.awt.Dialog.ModalExclusionType;
import java.util.Scanner;

import com.empmgmnt.app.ui.AppUi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	AppUi uiObj=new AppUi();
    	Scanner scanner =new Scanner(System.in);
    	
    	while(true) {
    		
    		System.out.println("Enter an Option \n 1 - Add Employee \n 2 - Search Employee \n 0 - Exit");
    		
    		int option= scanner.nextInt();
    		System.out.println();
    		
    		switch (option) {
			case 1:
				uiObj.addEmployee();
				break;
			case 2:
				uiObj.searchEmployee();
				break;
				
			case 0:
				System.exit(1);
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}
    		
    		System.out.println("\n");
    		
    		
    		
    	}
    	
    	
    }
}