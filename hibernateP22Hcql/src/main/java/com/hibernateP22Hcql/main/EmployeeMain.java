package com.hibernateP22Hcql.main;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hibernateP22Hcql.dao.EmployeeDao;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//EmployeeDao.viewEmployee();
		//EmployeeDao.pegination(8,5);
		//EmployeeDao.restrictions(Restrictions.gt("sal",20000l),"Greter Then");
		//EmployeeDao.restrictions(Restrictions.lt("sal",20000l),"Less Then");
		//EmployeeDao.restrictions(Restrictions.ge("sal",20000l),"Greter Then or equal");
		//EmployeeDao.restrictions(Restrictions.le("sal",20000l),"Less Then or equal");
		//EmployeeDao.restrictions(Restrictions.ne("sal",20000l),"Not equal");
		//EmployeeDao.restrictions(Restrictions.eq("sal",20000l),"equal");
		//EmployeeDao.restrictions(Restrictions.between("sal",20000l,25000l),"between");
		//EmployeeDao.restrictions(Restrictions.like("name","%a%"),"like");
		//EmployeeDao.order(Order.asc("sal"),"AES");
		//EmployeeDao.order(Order.desc("sal"),"DESC");
		EmployeeDao.projection("name");

	}

}
