package com.p4.hibernateP4InheritanceMapping;

import com.p4.hibernateP4InheritanceMapping.dao.CricketerDao;

public class CricketerMain {

	public static void main(String[] args) {
		int id = 0;
		
		id = CricketerDao.addCricketer(1,"Ravi Shatri"); 
		CricketerDao.showCricketer(id, "Staff");
		
		id = CricketerDao.addBatter(2,"Dhoni","201");
		CricketerDao.showCricketer(id, "Batter");
		
		id = CricketerDao.addBowler(3,"Kumale","10");
		CricketerDao.showCricketer(id, "Bowler");
	}

}
