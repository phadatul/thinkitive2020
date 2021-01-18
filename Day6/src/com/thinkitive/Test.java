package com.thinkitive;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {

		Address a1 = new Address(411028, "Pune");
		Address a2 = new Address(400002, "Mumbai");

		Employee e1 = new Employee(18, "ABCD", 99, a1);
		Employee e2 = new Employee(23, "XYZ", 89, a2);

		Employee e3 = new Employee(13, "MNO", 66, a2);
		Employee e4 = new Employee(18, "ABC", 11, a1);

		List<Employee> list = new LinkedList<Employee>();
		// Set<Employee> list = new TreeSet<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		EmpSalaryComparator sal = new EmpSalaryComparator();
		EmpNameComparator name = new EmpNameComparator();
		Collections.sort(list);

		ListIterator<Employee> empitr = list.listIterator();

		// next().hasNext(),remove()
		while (empitr.hasNext()) {
			System.out.println(empitr.next());
		}

		System.out.println("IN REVERSE");

		while (empitr.hasPrevious()) {
			System.out.println(empitr.previous());
		}

	}

}
