package com.thinkitive;

public class Demo {
	public static void main(String[] args) {
		//Employee e = new Employee(1, "ABCD", 99);

		Employee temp = new Employee();

		//e.doSerialize();
		//System.out.println(e);
		
		temp=temp.doDeserialize();
		System.out.println(temp);
	}

}
