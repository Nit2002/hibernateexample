package com.hibernateP28Jpa.main;


import java.util.ArrayList;
import java.util.List;

import com.hibernateP28Jpa.dao.StudentDao;

public class StudentMain {

	public static void main(String[] args) {
	
		//StudentDao.viewStudent(2);				StudentDao.close();
		//StudentDao.viewStudentHql(2);			StudentDao.close();
		//StudentDao.viewStudentHcql1();		StudentDao.close();
		StudentDao.viewStudentHcql2();		StudentDao.close(); 
		//StudentDao.viewStudentNameQuery(2);	StudentDao.close();
		//StudentDao.viewStudentNativeQuery();	StudentDao.close(); 
		
		/*List<String> laptop = new ArrayList<String>();
		laptop.add("Hp");
		laptop.add("Dell");
		StudentDao.addStudent(6,25,"Ganesh","M",laptop);*/
	}

}
