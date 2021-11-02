package com.empmgmnt.app.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private int employeeId;
	
	private String employeeName;
	
	private LocalDate dob;
	
	private String email;


}
