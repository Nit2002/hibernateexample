package com.p5.hibernateP5ComponentAnnotationMapping;

import com.p5.hibernateP5ComponentAnnotationMapping.dao.CustomerDao;

public class CustomerMain {

	public static void main(String[] args) {
		
		int id = CustomerDao.addCustomer("Manish","Pune","Maharashtra",400125);
		CustomerDao.showCustomer(id);

	}

}