package com.thinkitive;

import java.util.List;

public class Employee {
	private int empid;
	private String name;
	private int salary;
	private List<String> skills;
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Called default constructor");
	}

	public static Employee getEmployee() {
		System.out.println("Called static  factory method");
		return new Employee();
	}

	public Employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
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

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	
	@Override
	public String toString() {
		return " [empid=" + empid + ", name=" + name + ", salary=" + salary + ", skills=" + skills
				+ ", address=" + address + "]";
	}

	public void hello() {
		System.out.println("hello world");
	}

}
