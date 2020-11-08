package com.hibernateP26Caching.main;


import com.hibernateP26Caching.dao.StudentDao;

public class StudentMain {

	public static void main(String[] args) {
		// First level caching
		StudentDao.viewStudent(2);
		StudentDao.viewStudent(2);
		StudentDao.close();
		// Second level caching
		StudentDao.viewStudent(2);
		StudentDao.close();
		StudentDao.viewStudent(2);
		StudentDao.close();
		// HQL caching
		StudentDao.viewStudentHql(2);
		StudentDao.close();
		StudentDao.viewStudentHql(2);
		StudentDao.close();
		// HCQL caching
		StudentDao.viewStudentHcql(2);
		StudentDao.close();
		StudentDao.viewStudentHcql(2);
		StudentDao.close(); 
		// name query caching
		StudentDao.viewStudentNameQuery(2);
		StudentDao.close();
		StudentDao.viewStudentNameQuery(2);
		StudentDao.close(); 
		
		
	}

}
