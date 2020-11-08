package com.p2.hibernateP2.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.p2.hibernateP2.model.Book;


public class BookDao {
	private static Session session = null;
	
	public static void conn() {
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		session = sf.openSession();
	}
	
	public static void addBook(int code,String name) {
		try {
			conn();
			Transaction t = session.beginTransaction();
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String date = format.format(cal.getTime());
			Book employee = new Book(code,name,date);
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
	
	public static void showBook(int code) {
		try {
			conn();
			Object obj = session.load(Book.class,new Integer(code));
			Book book = (Book) obj;
			session.flush();
			System.out.println("Book Code \t\t:"+book.getCode()+
					"\nBook Name \t\t:"+book.getName()+"\nPublication \t\t:"+book.getPublication());
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
