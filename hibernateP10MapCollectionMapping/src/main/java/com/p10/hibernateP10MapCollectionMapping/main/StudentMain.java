package com.p10.hibernateP10MapCollectionMapping.main;

import java.util.HashMap;
import java.util.Map;

import com.p10.hibernateP10MapCollectionMapping.dao.StudentDao;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> laptop = new HashMap<String,String>();
		laptop.put("Gaming","Hp");
		laptop.put("Home","Dell");
		
		StudentDao.addStudent(3,25,"Ganesh","M",laptop);
		StudentDao.viewStudent(3);
	}

}
