package com.thinkitive;

public class EmployeeFactory {
	
	public Employee getInstance() {
		System.out.println("fctory method of other class");
		return new Employee();
	}

}
