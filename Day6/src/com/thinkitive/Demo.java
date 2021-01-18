package com.thinkitive;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "ABCD", 99);
		Employee e2 = new Employee(2, "XYZ", 89);

		Employee e3 = new Employee(3, "MNO", 66);
		Employee e4 = new Employee(1, "ABCD", 99);

		l.add(e2);
		l.add(e4);
		l.add(e3);
		l.add(e1);

		System.out.println(l);

	}

}
