package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity 
@DiscriminatorValue( value = "Bowler")
public class Bowler_per_hierarchy extends Cricketer_per_hierarchy {
	@Column (name = "BestFigure")
	private String bestFigure;
	
	public Bowler_per_hierarchy() {}

	public Bowler_per_hierarchy(int id, String name, String bestFigure) {
		super(id, name);
		this.bestFigure = bestFigure;
	}

	public String getBestFigure() {
		return bestFigure;
	}

	public void setBestFigure(String bestFigure) {
		this.bestFigure = bestFigure;
	}

	@Override
	public String toString() {
		return "Bowler [bestFigure=" + bestFigure + "]";
	}

}
