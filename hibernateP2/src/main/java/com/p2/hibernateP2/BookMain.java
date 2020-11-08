package com.p2.hibernateP2;

import com.p2.hibernateP2.dao.BookDao;

public class BookMain {

	public static void main(String[] args) {
		
		BookDao.addBook(2,"OOP Concepts");
		BookDao.showBook(1);
	}

}
