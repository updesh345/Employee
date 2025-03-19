package com.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) 
	{
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t  = s.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEid(111); e1.setEdept("HR"); e1.setEsalary(20000.00);
		s.save(e1);
		t.commit();
		s.close();
	}

} 