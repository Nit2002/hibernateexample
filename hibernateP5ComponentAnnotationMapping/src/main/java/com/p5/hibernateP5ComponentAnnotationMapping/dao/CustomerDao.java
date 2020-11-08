package com.p5.hibernateP5ComponentAnnotationMapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.p5.hibernateP5ComponentAnnotationMapping.model.Address;
import com.p5.hibernateP5ComponentAnnotationMapping.model.Customer;

public class CustomerDao {

	public static int addCustomer(String name,String city, String state, int pincode) {
		Session session = null;
		int id = 0;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Address address = new Address(city,state,pincode);
			Customer customer = new Customer(name,address);
			id = (Integer) session.save(customer);
			tx.commit();
			System.out.println("Record Added Successfully");
			session.flush();
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return id;
	}
	
	public static void showCustomer(int id) {
		Session session = null;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Object obj = session.load(Customer.class,new Integer(id));
			Customer customer = (Customer) obj ; 
			System.out.println("Customer Info"
					+"\nCustomer Name \t:"+customer.getName()
					+"\nAddress\nCity \t\t:"+customer.getAddress().getCity()
					+"\nState \t\t:"+customer.getAddress().getState()
					+"\nPincode \t:"+customer.getAddress().getPincode());
			session.flush();
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
}
