package com.p6.hibernateP6InheritanceAnnotationMapping;

import com.p6.hibernateP6InheritanceAnnotationMapping.dao.CricketerPerConcreteDao;
import com.p6.hibernateP6InheritanceAnnotationMapping.dao.CricketerPerHierarchyDao;
import com.p6.hibernateP6InheritanceAnnotationMapping.dao.CricketerPerSubclassDao;

public class CricketerMain {

	public static void main(String[] args) {
		int id = 0;
		// table per hierarchy
		/*
		 * id = CricketerPerHierarchyDao.addCricketer(1,"Ravi Shatri");
		 * CricketerPerHierarchyDao.showCricketer(id, "Staff");
		 * 
		 * id = CricketerPerHierarchyDao.addBatter(2,"Dhoni","201");
		 * CricketerPerHierarchyDao.showCricketer(id, "Batter");
		 * 
		 * id = CricketerPerHierarchyDao.addBowler(3,"Kumale","10");
		 * CricketerPerHierarchyDao.showCricketer(id, "Bowler");
		 */
		
		// table per subclass
		/*
		 * id = CricketerPerSubclassDao.addCricketer(1,"Ravi Shatri");
		 * CricketerPerSubclassDao.showCricketer(id, "Staff");
		 * 
		 * id = CricketerPerSubclassDao.addBatter(2,"Dhoni","201");
		 * CricketerPerSubclassDao.showCricketer(id, "Batter");
		 * 
		 * id = CricketerPerSubclassDao.addBowler(3,"Kumale","10");
		 * CricketerPerSubclassDao.showCricketer(id, "Bowler");
		 */
		
		// table per concrete class
		id = CricketerPerConcreteDao.addCricketer(1,"Ravi Shatri"); 
		CricketerPerConcreteDao.showCricketer(id, "Staff");
		
		id = CricketerPerConcreteDao.addBatter(2,"Dhoni","201");
		CricketerPerConcreteDao.showCricketer(id, "Batter");
		
		id = CricketerPerConcreteDao.addBowler(3,"Kumale","10");
		CricketerPerConcreteDao.showCricketer(id, "Bowler");
	}

}
