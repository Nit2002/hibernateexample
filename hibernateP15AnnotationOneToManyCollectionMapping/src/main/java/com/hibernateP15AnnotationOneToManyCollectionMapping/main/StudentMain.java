package com.hibernateP15AnnotationOneToManyCollectionMapping.main;

import java.util.ArrayList;
import java.util.List;

import com.hibernateP15AnnotationOneToManyCollectionMapping.dao.StudentDao;
import com.hibernateP15AnnotationOneToManyCollectionMapping.model.Laptop;

public class StudentMain {

	public static void main(String[] args) {
		
		Laptop laptop1 = new Laptop("hp","Gaming",30000.0);
		Laptop laptop2 = new Laptop("Dell","Home",25000.0);
		List<Laptop> laptopList = new ArrayList<Laptop>();
		laptopList.add(laptop1);
		laptopList.add(laptop2);
		StudentDao.addStudent(7,23,"Raju","M",laptopList);
		StudentDao.showStudent(7);
	}

}
