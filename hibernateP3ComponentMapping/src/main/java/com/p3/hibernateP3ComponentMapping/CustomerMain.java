package com.p3.hibernateP3ComponentMapping;

import com.p3.hibernateP3ComponentMapping.dao.CustomerDao;

public class CustomerMain {

	public static void main(String[] args) {
		
		int id = CustomerDao.addCustomer("Ganesh","Pune","Maharashtra",400125);
		CustomerDao.showCustomer(id);
		

	}

}
