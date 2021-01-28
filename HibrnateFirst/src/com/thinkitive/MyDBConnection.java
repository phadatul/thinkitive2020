package com.thinkitive;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDBConnection {

	public void insertEmployee() {
		Employee e = new Employee(12, "MNO", 77600);
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();

		session.save(e);


		tx.commit();

		session.close();
		factory.close();

	}

}
