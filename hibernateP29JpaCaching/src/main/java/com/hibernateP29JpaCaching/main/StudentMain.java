package com.hibernateP29JpaCaching.main;


import java.util.ArrayList;
import java.util.List;

import com.hibernateP29JpaCaching.dao.StudentDao;

public class StudentMain {

	public static void main(String[] args) {
	
		// caching query
		//StudentDao.viewStudent(2);		
		//StudentDao.viewStudent(2);				StudentDao.close();
		
		// caching hql query
		//StudentDao.viewStudentHql(2);			StudentDao.close();
		//StudentDao.viewStudentHql(2);			StudentDao.close();
		
		// caching hcql query
		StudentDao.viewStudentHcql1();		StudentDao.close();
		StudentDao.viewStudentHcql1();		StudentDao.close();
		
		
		//StudentDao.viewStudentHcql2();		StudentDao.close(); 
		
		
		// caching name query
		//StudentDao.viewStudentNameQuery(2);	StudentDao.close();
		//StudentDao.viewStudentNameQuery(2);	StudentDao.close();
		
		// caching Native query
		//StudentDao.viewStudentNativeQuery();	StudentDao.close(); 
		//StudentDao.viewStudentNativeQuery();	StudentDao.close(); 
		
		/*List<String> laptop = new ArrayList<String>();
		laptop.add("Hp");
		laptop.add("Dell");
		StudentDao.addStudent(6,25,"Ganesh","M",laptop);*/
	}

}
