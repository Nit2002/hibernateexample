package com.p10.hibernateP10OneToManyCollectionMapping.main;

import java.util.ArrayList;
import java.util.List;

import com.p10.hibernateP10OneToManyCollectionMapping.dao.StudentDao;
import com.p10.hibernateP10OneToManyCollectionMapping.model.Laptop;

public class StudentMain {

	public static void main(String[] args) {
		
		Laptop laptop1 = new Laptop("hp","Gaming",30000.0);
		Laptop laptop2 = new Laptop("Dell","Home",25000.0);
		List<Laptop> laptopList = new ArrayList<Laptop>();
		laptopList.add(laptop1);
		laptopList.add(laptop2);
		StudentDao.addStudent(3,23,"manish","M",laptopList);
		StudentDao.showStudent(3);
	}

}
