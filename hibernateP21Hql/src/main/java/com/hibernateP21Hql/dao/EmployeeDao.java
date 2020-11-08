package com.hibernateP21Hql.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernateP21Hql.model.Employee;

public class EmployeeDao {
	
	private static Session session = null;
	
	public static void conn() {
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		session = sf.openSession();
	}
	
	public static void viewEmployee() {
		try {
			conn();
			Query query = session.createQuery("FROM Employee");
			List<Employee> list = query.list();
			Iterator<Employee> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Employee employee = (Employee) iterator.next();
				System.out.println("Employee Info\nName\t\t:"+employee.getId()+"\nName\t\t:"+employee.getName()+"\nSalary\t\t:"+employee.getSal());
			}
			session.flush();
			System.out.println("Successfully !!!!");
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
			Query query = session.createQuery("UPDATE Employee SET name = :name, sal = :sal WHERE id = :id");
			query.setParameter("name",name);
			query.setParameter("id",id);
			query.setParameter("sal",sal);
			int status = query.executeUpdate();
			t.commit();
			session.flush();
			System.out.println("Record Update Successfully !!!!\tStatus :"+status);
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
			Query query = session.createQuery("DELETE FROM Employee WHERE id = :id");
			query.setParameter("id",id);
			int status = query.executeUpdate();
			t.commit();
			session.flush();
			System.out.println("Record Delete Successfully !!!!\tStatus :"+status);
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
		}
	}
	
	public static void pegination(int first,int max) {
		try {
			conn();
			Query query = session.createQuery("FROM Employee");
			query.setFirstResult(first);
			query.setMaxResults(max);
			List<Employee> list = query.list();
			Iterator<Employee> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Employee employee = (Employee) iterator.next();
				System.out.println("Employee Info\nName\t\t:"+employee.getId()+"\nName\t\t:"+employee.getName()+"\nSalary\t\t:"+employee.getSal());
			}
			session.flush();
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
		}
	}
	
	public static void groupFunction(String q, String functionName) {
		try {
			conn();
			Query query = session.createQuery(q);
			List<Long> list = query.list();
			Iterator<Long> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Long employee =  iterator.next();
				System.out.println("Fuction Name : "+functionName+"\nSal\t\t:"+employee);
			}
			session.flush();
			System.out.println("Successfully !!!!");
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
