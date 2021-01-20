package com.thinkitive.db;

public class Demo {
	public static void main(String[] args) {

		MyDatabaseOperations ops = new MyDatabaseOperations();

		ops.deleteEmp(9);
		ops.updateEmp(3, "MNO");
		ops.displayEmp();
	}

}
