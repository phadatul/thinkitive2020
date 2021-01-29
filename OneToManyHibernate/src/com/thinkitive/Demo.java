package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Address a1 = new Address(999, "Mumbai");
		Address a2 = new Address(555, "Nasik");
		Address a3 = new Address(222, "New York");
	
		List<Address> l = new ArrayList<Address>();

		l.add(a2);
		l.add(a1);
	
		l.add(a3);
		Employee e1 = new Employee(12, "Rajesh", 69000, l);

		session.save(e1);

		t.commit();
		session.close();
		factory.close();
	}

}
