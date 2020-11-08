package com.hibernateP17AnnotationOneToOneCollectionMapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernateP17AnnotationOneToOneCollectionMapping.model.Address;
import com.hibernateP17AnnotationOneToOneCollectionMapping.model.Intern;

public class InternDao {
	
	public static void addIntern(int id, int age, String name, String gender, Address address) {
		Session session = null;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Intern intern = new Intern(id,age,name,gender,address);
			address.setIntern(intern);
			session.save(intern);
			tx.commit();
			session.flush();
			System.out.println("Recod Added Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	public static void viewIntern(int id) {
		Session session = null;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Object obj = session.load(Intern.class, new Integer(id));
			Intern intern = (Intern)obj ;
			System.out.println("Information\n"+
			"\n id \t\t:"+intern.getId()+
			"\n name\t\t:"+intern.getName()+
			"\n age\t\t:"+intern.getAge()+
			"\n gender\t\t:"+intern.getGender()+
			"\n Address\t:"+intern.getAddress());
			session.flush();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}
