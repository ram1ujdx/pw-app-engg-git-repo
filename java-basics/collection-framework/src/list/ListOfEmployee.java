package list;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployee {

	public static void main(String[] args) {
		
		List<Employee> employeeList=new ArrayList<>();
		
		Employee e1=new Employee(1001,"Tushar",56000);
		Employee e2=new Employee(1005,"Gaurav",75000);
		Employee e3=new Employee(1004,"Rohit",85000);
		Employee e4=new Employee(1002,"Manish",66000);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		int id = 1004;
		
		Employee e=null;
		
		for(Employee emp:employeeList) {
			if(emp.getEmployeeId()==id) {
				e=emp;
				break;
			}
			
		}
		
		System.out.println(e);
		

	}

}
