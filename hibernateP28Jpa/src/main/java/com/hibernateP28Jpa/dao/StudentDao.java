package com.hibernateP28Jpa.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.hibernateP28Jpa.model.Student;

public class StudentDao {
	private static EntityManagerFactory factory = null ;
	private static EntityManager manager = null ;
	
	private static void connectToDB() {
		try {
			if( factory == null ) {
				factory = Persistence.createEntityManagerFactory("unit1");
			}
			manager = factory.createEntityManager();
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			manager.close();
		}
		catch(Exception e ) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void viewStudent(int id) {
		try {
			if( (manager == null) ||  !(manager.isOpen()) ) {
				connectToDB();	
			}
			Object obj = manager.find(Student.class, new Integer (id ) );
			Student student = (Student ) obj;
			System.out.println("student Info"
					+"\nId \t\t:"+student.getId()
					+"\nName \t\t:"+student.getName()
					+"\nAge \t\t:"+student.getAge()
					+"\nGender \t\t:"+student.getGender());
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void viewStudentHql(int id) {
		try {
			connectToDB();
			Query query = manager.createQuery("FROM Student WHERE id= :id");
			query.setParameter("id",id);
			List<Student> list = query.getResultList();
			Iterator<Student> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Student student = (Student) iterator.next();
				System.out.println("Student Info\t:"+student.getId()+"\t\t\t:"+student.getName()+"\t\t\t:"+student.getAge());
			}
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	
	public static void viewStudentHcql1() {
		try {
			connectToDB();
			CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
			CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery(Object.class);
			Root<Student> root = criteriaQuery.from(Student.class);
			criteriaQuery.select(root.get("name"));
			List<Object> list =  manager.createQuery(criteriaQuery).getResultList();
			Iterator<Object> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Object student = (Object) iterator.next();
				System.out.println("Student Info\t:"+student);
			}
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	
	public static void viewStudentHcql2() {
		try {
			connectToDB();
			CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
			CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
			Root<Student> root = criteriaQuery.from(Student.class);
			criteriaQuery.multiselect(root.get("id"),root.get("name"),root.get("age"));
			List<Object[]> list =  manager.createQuery(criteriaQuery).getResultList();
			Iterator<Object[]> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Object[] student = (Object[]) iterator.next();
				System.out.println("Student Info\t:"+student[0]+"\t\t\t:"+student[1]+"\t\t\t:"+student[2]);
			}
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	
	public static void viewStudentNameQuery(int id) {
		try {
			connectToDB();
			Query query = manager.createNamedQuery("findStudentById");    
            query.setParameter("id",id);
			List<Student> list =  query.getResultList();
			Iterator<Student> iterator = list.iterator();
			while ( iterator.hasNext() ) {
				Student student =  (Student)iterator.next();
				System.out.println("Student Info\t\t:"+student.getId()+"\t\t:"+student.getName()+"\t\t:"+student.getAge());
			}
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	
	public static void viewStudentNativeQuery() {
		try {
			connectToDB();
			Query sqlQuery = manager.createNativeQuery("Select * FROM Student_list" , Student.class);   
			List<Student> list = sqlQuery.getResultList();
			for ( Object obj : list ) {
				Student student = (Student)  obj;
				System.out.println("Student Info\t\t:"+student.getId()+"\t\t:"+student.getName()+"\t\t:"+student.getAge());
			}
			System.out.println("Successfully !!!!");
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}

	public static void addStudent(int id, int age, String name, String gender, List<String> laptops) {
		try {
			connectToDB();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Student student = new Student( id,  age,  name,  gender,  laptops);
			manager.persist(student);
			tx.commit();
			System.out.println("Record Added Successfully");
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}