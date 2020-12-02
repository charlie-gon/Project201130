
//201201
//MapExample3와 연결

package com.yedam.collection;

public class Employee {
	
	//field
	private int employeeId;
	private String lastName;
	private String email;
	private int salary;
	
	//constructor
	public Employee(int employeeId, String lastName, String email, int salary) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}

	//method
	public int getEmployeeId() {
		return employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getSalary() {
		return salary;
	}
	
	
	
	

}
