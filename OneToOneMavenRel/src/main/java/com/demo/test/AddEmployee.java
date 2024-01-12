package com.demo.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class AddEmployee {

	public static void main(String[] args) {
		EmpAddress e1add = new EmpAddress(1,"Mumbai","MH");
		Employee e1 = new Employee(1,"Abhijeet",35000,e1add);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(e1add);
		s1.save(e1);
		tr.commit();
		s1.close();
		System.out.println("Data Inserted Successfully 😊");
	}
}
