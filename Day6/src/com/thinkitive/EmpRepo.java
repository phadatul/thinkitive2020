package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

public class EmpRepo {
	List<Employee> list = new ArrayList<Employee>();

	public void insertEmp(Employee e) {
		list.add(e);
	}

	public List<Employee> getAll() {
		return list;
	}

	public void removeEmp(Employee e) {
		list.remove(e);
	}

	public void updateEmp(Employee old, Employee newemp) {
		list.set(list.indexOf(old), newemp);
	}

	public Employee getEmployee(int empid) {
		Employee e = null;
		for (Employee x : list) {
			if (x.getEmpid() == empid) {
				e = x;
			}
		}
		return e;
	}

}
