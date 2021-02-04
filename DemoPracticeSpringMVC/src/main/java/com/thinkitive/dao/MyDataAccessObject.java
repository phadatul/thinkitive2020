package com.thinkitive.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thinkitive.model.Employee;

public class MyDataAccessObject {
	public void addEmp(Employee e) {
		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(e);

		tx.commit();
		session.close();
		factory.close();
	}

}
