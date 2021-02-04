package com.thinkitive.dao;

import com.thinkitive.model.Employee;

public class Demo {
	public static void main(String[] args) {
		MyDataAccessObject o=new MyDataAccessObject();
		
		o.addEmp(new Employee(17, "MNOP", 12345));
	}

}
