package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {
		
		Set items = new HashSet();
		
		items.add(5);
		
		
		
		items.add("Hello");
		items.add("Hello");
		
		items.add(true);
		
		items.add(true);
		
		items.add(2.5);
		
		
		for(Object item:items) {
			System.out.println(item);
		}
		
		

	}

}
