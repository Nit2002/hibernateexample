package com.hibernateP26Caching.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernateP26Caching.model.Student;

public class StudentDao {
	private static SessionFactory sf = null ;
	private static Session session = null ;
	
	private static void connectToDB() {
		try {
			if( sf == null ) {
				Configuration con = new Configuration().configure();
				ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
				sf = con.buildSessionFactory(reg);
			}
			session = sf.openSession();
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			session.close();
		}
		catch(Exception e ) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void viewStudent(int id) {
		try {
			if( (session == null) ||  !(session.isOpen()) ) {
				connectToDB();	
			}
			Object obj = session.load(Student.class, new Integer (id ) );
			Student student = (Student ) obj;
			System.out.println("student Info"
					+"\nId \t\t:"+student.getId()
					+"\nName \t\t:"+student.getName()
					+"\nAge \t\t:"+student.getAge()
					+"\nGender \t\t:"+student.getGender());
			session.flush();
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void viewStudentHql(int id) {
		try {
			connectToDB();
			Query query = session.createQuery("FROM Student WHERE id= :id");
			query.setParameter("id",id);
			query.setCacheable(true);
			List<Student> list = query.list();
			Iterator<Student> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Student student = (Student) iterator.next();
				System.out.println("Student Info\t:"+student.getId()+"\t\t\t:"+student.getName()+"\t\t\t:"+student.getAge());
			}
			session.flush();
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void viewStudentHcql(int id) {
		try {
			connectToDB();
			Criteria criteria = session.createCriteria(Student.class);
			criteria.add(Restrictions.eq("id",id));
			criteria.setCacheable(true);
			List<Student> list = criteria.list();
			Iterator<Student> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Student student = (Student) iterator.next();
				System.out.println("Student Info\t\t:"+student.getId()+"\t\t:"+student.getName()+"\t\t:"+student.getAge());
			}
			session.flush();
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void viewStudentNameQuery(int id) {
		try {
			connectToDB();
			Query query = session.getNamedQuery("findStudentById");    
            query.setParameter("id",id);
            query.setCacheable(true);
			List<Student> list = query.list();
			Iterator<Student> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Student student =  (Student)iterator.next();
				System.out.println("Student Info\t\t:"+student.getId()+"\t\t:"+student.getName()+"\t\t:"+student.getAge());
			}
			session.flush();
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
}