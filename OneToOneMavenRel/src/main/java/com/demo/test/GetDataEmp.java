package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.model.*;
public class GetDataEmp {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		Employee emp1=sess.load(Employee.class, 1);
		System.out.println("before");
		System.out.println(emp1);
		sess.close();

	}

}
