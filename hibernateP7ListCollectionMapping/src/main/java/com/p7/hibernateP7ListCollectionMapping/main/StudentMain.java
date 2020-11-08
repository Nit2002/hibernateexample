package com.p7.hibernateP7ListCollectionMapping.main;

import java.util.ArrayList;
import java.util.List;

import com.p7.hibernateP7ListCollectionMapping.dao.StudentDao;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> laptop = new ArrayList<String>();
		laptop.add("Hp");
		laptop.add("Dell");
		
		StudentDao.addStudent(2,25,"Ganesh","M",laptop);
		StudentDao.viewStudent(2);
	}

}
