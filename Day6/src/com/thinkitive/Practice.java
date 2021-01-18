package com.thinkitive;

public class Practice {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "ABCD", 99);
		Employee e2 = new Employee(2, "XYZ", 89);

		Employee e3 = new Employee(3, "MNO", 66);
		Employee e4 = new Employee(1, "ABC", 11);

		EmpRepo repo = new EmpRepo();

		repo.insertEmp(e1);
		repo.insertEmp(e2);
		repo.insertEmp(e3);
		
		repo.updateEmp(e1, e4);
		
		
		System.out.println(repo.getEmployee(3));
	}
}
