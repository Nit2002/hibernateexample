package com.p13.hibernateP13OneToOneCollectionMapping.main;

import com.p13.hibernateP13OneToOneCollectionMapping.dao.InternDao;
import com.p13.hibernateP13OneToOneCollectionMapping.model.Address;

public class InternMain {
	public static void main(String[] args) {
		Address address = new Address(300047,"Maharashtra","Mumbai");
		InternDao.addIntern(3, 23, "sachin", "M", address);
		InternDao.viewIntern(3);
	}
}
