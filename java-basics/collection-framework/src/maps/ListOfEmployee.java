package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListOfEmployee {

	public static void main(String[] args) {
		
		Map<Integer, Employee> employees=new TreeMap<>();
		
		Employee e1=new Employee(10011,"Tushar",56000);
		Employee e2=new Employee(1005,"Gaurav",75000);
		Employee e3=new Employee(104,"Rohit",85000);
		Employee e4=new Employee(1002,"Manish",66000);
		
		employees.put(e1.getEmployeeId(), e1);
		employees.put(e2.getEmployeeId(), e2);
		employees.put(e3.getEmployeeId(), e3);
		employees.put(e4.getEmployeeId(), e4);
		
//		int id = 1000;
//		
//		Employee e=employees.get(id);
//		
//		System.out.println(e);
		
		for(int id:employees.keySet()) {
			System.out.println(employees.get(id));
		}
		

	}

}
