package com.p6.hibernateP6InheritanceAnnotationMapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.p6.hibernateP6InheritanceAnnotationMapping.model.Batter_per_hierarchy;
import com.p6.hibernateP6InheritanceAnnotationMapping.model.Bowler_per_hierarchy;
import com.p6.hibernateP6InheritanceAnnotationMapping.model.Cricketer_per_hierarchy;


public class CricketerPerHierarchyDao {
	
	public static int add(Cricketer_per_hierarchy cricketer) {
		Session session = null;
		int id  = 0;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Transaction tx = session.beginTransaction();
			id = (Integer) session.save(cricketer);
			tx.commit();
			System.out.println("Record Added Successfully");
			session.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			session.close();
		}
		return id;
	}
	
	public static int addCricketer(int id,String name) {
		Cricketer_per_hierarchy cricketer = new Cricketer_per_hierarchy(id,name);
		return add(cricketer);
	}
	
	public static int addBowler(int id,String name,String bestFigure) {
		Bowler_per_hierarchy bowler = new Bowler_per_hierarchy(id,name,bestFigure);
		return add(bowler);
	}
	
	public static int addBatter(int id,String name,String bestScore) {
		Batter_per_hierarchy batter = new Batter_per_hierarchy(id, name, bestScore);
		return add(batter);
	}
	
	public static void showCricketer(int id,String ctype) {
		Session session = null;
		try {
			Configuration con = new Configuration().configure();
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf = con.buildSessionFactory(reg);
			session = sf.openSession();
			Object obj = null;
			if(ctype.equals("Bowler")) {
				obj = session.load(Bowler_per_hierarchy.class, new Integer(id));
				Bowler_per_hierarchy bowler = (Bowler_per_hierarchy) obj ;
				System.out.println("Cricketer Id \t\t:"+bowler.getId()
					+"\nCricketer Name \t\t:"+bowler.getName()
					+"\nCricketer Best Figure \t:"+bowler.getBestFigure());
			}
			else if(ctype.equals("Batter")) {
				obj = session.load(Batter_per_hierarchy.class, new Integer(id));
				Batter_per_hierarchy batter = (Batter_per_hierarchy) obj ;
				System.out.println("Cricketer Id \t\t:"+batter.getId()
					+"\nCricketer Name \t\t:"+batter.getName()
					+"\nCricketer Best Figure \t:"+batter.getBestScore());
			}
			else if(ctype.equals("Staff")) {
				obj = session.load(Cricketer_per_hierarchy.class, new Integer(id));
				Cricketer_per_hierarchy cricketer = (Cricketer_per_hierarchy) obj ;
				System.out.println("Cricketer Id \t\t:"+cricketer.getId()
					+"\nCricketer Name \t\t:"+cricketer.getName());
			}
			
			session.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
}
