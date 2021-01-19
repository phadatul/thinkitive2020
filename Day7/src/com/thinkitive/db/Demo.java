package com.thinkitive.db;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) {
		

		try {
			Class c = Class.forName("com.thinkitive.Employee");
			Method m[]=c.getDeclaredMethods();
			
			
			
			for(Method x:m) {
				System.out.println(x.getName());
			}

			Field f[] = c.getDeclaredFields();
			for (Field x : f) {
				System.out.println(x.getName());
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
