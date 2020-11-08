package com.hibernateP24hibernateNamedQueryAnnotation.dao;

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

import com.hibernateP24hibernateNamedQueryAnnotation.model.Employee;

public class EmployeeDao {
	
	private static Session session = null;
	
	public static void conn() {
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		session = sf.openSession();
	}	
	
	public static void nameQuery(String columnName) {
		try {
			conn();
			Query query = session.getNamedQuery("findEmployeeByName");    
            query.setParameter("name",columnName);
			List<Employee> list = query.list();
			Iterator<Employee> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Employee employee =  (Employee)iterator.next();
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
	
	
}
