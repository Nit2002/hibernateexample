package com.hibernateP15AnnotationOneToManyCollectionMapping.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernateP15AnnotationOneToManyCollectionMapping.model.Laptop;
import com.hibernateP15AnnotationOneToManyCollectionMapping.model.Student;

public class StudentDao {
	public static void addStudent(int id, int age, String name, String gender, List<Laptop> laptops) {
		Session session = null;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Student student = new Student(id, age, name, gender, laptops);
			session.save(student);
			tx.commit();
			session.flush();
			System.out.println("Recored Added Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
	public static void showStudent(int id) {
		Session session = null;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Object obj = session.load(Student.class,new Integer(id));
			Student student = (Student) obj;
			System.out.println("student Info"
					+"\nId \t\t:"+student.getId()
					+"\nName \t\t:"+student.getName()
					+"\nAge \t\t:"+student.getAge()
					+"\nGender \t\t:"+student.getGender()
					+"\nLaptops \t:"+  (student.getLaptops().toString().replace("["," ")).replace("]"," ")   );
			
			session.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
}
