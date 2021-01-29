package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyClass {

	public List getEmployees() {
		List l = null;
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		l = session.createQuery("From Address").list();
		System.out.println(l);

		t.commit();
		session.close();
		factory.close();
		return l;
	}

}
