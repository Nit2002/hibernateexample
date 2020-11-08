package com.hibernateP16AnnotationManyToManyCollectionMapping.main;

import java.util.ArrayList;
import java.util.List;

import com.hibernateP16AnnotationManyToManyCollectionMapping.dao.StudentDao;
import com.hibernateP16AnnotationManyToManyCollectionMapping.model.Laptop;

public class StudentMain {

	public static void main(String[] args) {
		
		Laptop laptop1 = new Laptop("hp","Gaming",30000.0);
		Laptop laptop2 = new Laptop("Dell","Home",25000.0);
		List<Laptop> laptopList = new ArrayList<Laptop>();
		laptopList.add(laptop1);
		laptopList.add(laptop2);
		StudentDao.addStudent(5,23,"Ganesh","M",laptopList);
		StudentDao.showStudent(5);
	}

}
