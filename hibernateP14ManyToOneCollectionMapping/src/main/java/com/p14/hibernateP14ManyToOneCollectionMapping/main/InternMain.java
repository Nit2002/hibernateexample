package com.p14.hibernateP14ManyToOneCollectionMapping.main;

import com.p14.hibernateP14ManyToOneCollectionMapping.dao.InternDao;
import com.p14.hibernateP14ManyToOneCollectionMapping.model.Address;

public class InternMain {
	public static void main(String[] args) {
		Address address = new Address(1,300022,"Maharashtra","Mumbai");
		InternDao.addIntern(2, 23, "Manish", "M", address);
		InternDao.addIntern(1, 23, "Ganesh", "M", address);
		InternDao.viewIntern(2);
	}
	
}
