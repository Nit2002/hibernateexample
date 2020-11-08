package com.hibernateP18AnnotationManyToOneCollectionMapping.main;

import com.hibernateP18AnnotationManyToOneCollectionMapping.dao.InternDao;
import com.hibernateP18AnnotationManyToOneCollectionMapping.model.Address;

public class InternMain {
	public static void main(String[] args) {
		Address address = new Address(2,300022,"Maharashtra","Mumbai");
		InternDao.addIntern(5, 23, "Manish", "M", address);
		InternDao.addIntern(6, 23, "Ganesh", "M", address);
		//InternDao.viewIntern(2);
	}
	
}
