package maps;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> numsMap=new HashMap<>();
		
		numsMap.put(1, "One");
		numsMap.put(2, "Two");
		numsMap.put(3, "Three");
//		numsMap.put(2, "Eredu");
		
		
//		String numString = numsMap.get(2);
//		
//		System.out.println(numString);
		
		for(int key:numsMap.keySet()) {
			System.out.println(key+" - "+numsMap.get(key));
		}
		
//		// hello
//		h - 1
//		e - 1
//		l - 2
//		o - 1
//		
//		Map<String, Integer> charMap = new HashMap<>();
//		
//		containsKey()
//		
//		1. loop the chars
//		
//		2. if char is not present 
//			put that char in the Map with value 1
//			
//			else
//				get the current value for that char and increment it by 1
//				put it back in the Map
//		3. Display the key and values		
//		
				
				
		
		
		

	}

}
