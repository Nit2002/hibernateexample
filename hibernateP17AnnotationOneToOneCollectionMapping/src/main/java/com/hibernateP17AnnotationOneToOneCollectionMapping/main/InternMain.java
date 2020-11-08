package com.hibernateP17AnnotationOneToOneCollectionMapping.main;

import com.hibernateP17AnnotationOneToOneCollectionMapping.dao.InternDao;
import com.hibernateP17AnnotationOneToOneCollectionMapping.model.Address;

public class InternMain {
	public static void main(String[] args) {
		Address address = new Address(300047,"Maharashtra","Mumbai");
		InternDao.addIntern(5, 23, "sachin", "M", address);
		InternDao.viewIntern(5);
	}
}
