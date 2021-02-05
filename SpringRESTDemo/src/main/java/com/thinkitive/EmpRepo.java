package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

public class EmpRepo {
	List<Employee> list = new ArrayList<Employee>();

	public void insert(Employee e) {
		list.add(e);
	}

	public void delete(Employee e) {
		list.remove(e);
	}

	public void update(Employee e) {
		list.set(list.indexOf(e), e);
	}

	public List<Employee> getAll() {
		return list;
	}

	public Employee getEmployee(Integer empid) {
		Employee temp = null;
		for (Employee e : list) {
			if (e.getEmpid() == empid)
				temp = e;
		}
		return temp;
	}

}
