package com.pw.app;

public class Student {

	private int studentId;
	
	public Student(int studentId) {
		this.studentId=studentId;
	}
	
	public void setStudentId(int studentId) {
		
		this.studentId=studentId;
	}
	
	public void showStudentId() {
		System.out.println(studentId);
	}
	
	
	
	public static void main(String[] args) {
		
		CSStudent myStudent=new CSStudent(1005);
		
	//	myStudent.setStudentId(1001);
		
		myStudent.show();
		
		
	}
	
}
