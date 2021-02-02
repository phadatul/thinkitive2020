package com.thinkitive;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empid;
	private String name;
	private int salary;
	@Autowired
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}


}
