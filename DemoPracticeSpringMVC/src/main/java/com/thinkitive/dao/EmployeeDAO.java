package com.thinkitive.dao;

import java.util.List;

import com.thinkitive.model.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee e);

	public void deleteEmployee(Employee e);

	public void updateEmployee(Employee e);

	public void getEmployee(int empid);

	public List<Employee> getAll();

}
