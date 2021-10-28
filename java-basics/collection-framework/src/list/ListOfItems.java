package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfItems {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("Rahul","Kumar","Tushar");
		
		for(String item:items) {
			System.out.println(item.toUpperCase());
		}

		
	}

}
