package list;

public class Employee {

	private int employeeId;
	
	private String employeeName;
	
	private float salary;
	
	static String country="India";
	
	public Employee() {
	}
	
	

	public Employee(int employeeId, String employeeName, float salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}



	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", country=" + country + "]";
	}



	
	
	
	
	
	
	
	
	
}
