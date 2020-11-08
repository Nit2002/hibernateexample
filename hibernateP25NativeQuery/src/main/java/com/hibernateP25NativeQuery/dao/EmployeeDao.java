package com.hibernateP25NativeQuery.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class EmployeeDao {
	
	private static Session session = null;
	
	public static void conn() {
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		session = sf.openSession();
	}	
	
	public static void nativeQuery() {
		try {
			conn();
			SQLQuery sqlQuery = session.createSQLQuery("Select name, salary FROM employee");    
            sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			List<Object> list = sqlQuery.list();
			for ( Object obj : list ) {
				Map<Object,Object> employee = (Map<Object,Object>)  obj;
				System.out.println("Employee Info\nName\t\t:"+employee.get("name")+"\nSalary\t\t:"+employee.get("salary"));
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
