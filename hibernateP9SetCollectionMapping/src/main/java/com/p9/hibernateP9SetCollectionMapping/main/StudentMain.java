package com.p9.hibernateP9SetCollectionMapping.main;

import java.util.HashSet;
import java.util.Set;

import com.p9.hibernateP9SetCollectionMapping.dao.StudentDao;



public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> laptop = new HashSet<String>();
		laptop.add("Hp");
		laptop.add("Dell");
		
		StudentDao.addStudent(2,25,"Ganesh","M",laptop);
		StudentDao.viewStudent(2);
	}
}
