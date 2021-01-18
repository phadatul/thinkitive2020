package com.thinkitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee(18, "ABCD", 99);
		Employee e2 = new Employee(23, "XYZ", 89);

		Employee e3 = new Employee(13, "MNO", 66);
		Employee e4 = new Employee(18, "ABC", 11);

		List<Employee> list = new ArrayList<Employee>();
		// Set<Employee> list = new TreeSet<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		EmpSalaryComparator sal = new EmpSalaryComparator();
		EmpNameComparator name=new EmpNameComparator();
		Collections.sort(list, name);
		System.out.println(list);

	}

}
