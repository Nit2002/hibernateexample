package com.hibernateP22Hcql.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernateP22Hcql.model.Employee;

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
			Criteria criteria = session.createCriteria(Employee.class);
			List<Employee> list = criteria.list();
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
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.setFirstResult(first);
			criteria.setMaxResults(max);
			List<Employee> list = criteria.list();
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
	
	public static void restrictions(Criterion criterion, String restricationName) {
		try {
			conn();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(criterion);
			List<Employee> list = criteria.list();
			Iterator<Employee> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Employee employee =  (Employee)iterator.next();
				System.out.println("Fuction Name : "+restricationName+"\nEmployee Info\nName\t\t:"+employee.getId()+"\nName\t\t:"+employee.getName()+"\nSalary\t\t:"+employee.getSal());
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
	
	public static void order(Order order, String orderName) {
		try {
			conn();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.addOrder(order);
			List<Employee> list = criteria.list();
			Iterator<Employee> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Employee employee =  (Employee)iterator.next();
				System.out.println("Fuction Name : "+orderName+"\nEmployee Info\nName\t\t:"+employee.getId()+"\nName\t\t:"+employee.getName()+"\nSalary\t\t:"+employee.getSal());
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
	
	public static void projection(String columnName) {
		try {
			conn();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.setProjection(Projections.property(columnName));
			List<String> list = criteria.list();
			Iterator<String> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				String employee =  (String)iterator.next();
				System.out.println("\t:"+employee);
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
