package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("anyname.xml");

		
		Employee e = context.getBean("emp",Employee.class);
		
		
		Address a=context.getBean(Address.class);
		System.out.println(e);
		
		
		

	}

}
