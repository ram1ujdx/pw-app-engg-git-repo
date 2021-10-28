package set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> items=new TreeSet<>();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter a string - (enter x to terminate)");
		String str = scanner.nextLine();
		if(str.equalsIgnoreCase("x")) {
			break;
		}
		items.add(str);
	}
		
		
		
		for(String item:items) {
			System.out.println(item);
		}
		

	}

}
