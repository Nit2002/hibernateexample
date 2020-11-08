package com.firstproject.HibernateP1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.firstproject.HibernateP1.model.Employee;

public class EmployeeDao {
	
	private static Session session = null;
	
	public static void conn() {
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		session = sf.openSession();
	}
	
	public static void addEmployee(int id,String name,long sal) {
		try {
			conn();
			Transaction t = session.beginTransaction();
			Employee employee = new Employee(id,name,sal);
			session.save(employee);
			t.commit();
			session.flush();
			System.out.println("Record Added Successfully !!!!");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
		}
	}
	
	public static void updateEmployee(int id,String name,long sal) {
		try {
			conn();
			Transaction t = session.beginTransaction();
			Object obj = session.load(Employee.class,new Integer(id));
			Employee employee = (Employee) obj;
			employee.setName(name);
			employee.setSal(sal);
			session.update(employee);
			//Employee employee = new Employee(id,name,sal);
			//session.update(employee);
			t.commit();
			session.flush();
			System.out.println("Record Update Successfully !!!!");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
		}
	}
	
	public static void deleteEmployee(int id) {
		try {
			conn();
			Transaction t = session.beginTransaction();
			Object obj = session.load(Employee.class,new Integer(id));
			session.delete(obj);
			t.commit();
			session.flush();
			System.out.println("Record Delete Successfully !!!!");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
		}
	}
}
