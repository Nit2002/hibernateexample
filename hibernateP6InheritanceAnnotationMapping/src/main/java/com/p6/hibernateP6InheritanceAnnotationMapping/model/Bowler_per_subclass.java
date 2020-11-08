package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "bowler_per_subclass_annotation")
@PrimaryKeyJoinColumn(name = "Id")
public class Bowler_per_subclass extends Cricketer_per_subclass {
	
	@Column (name = "BestFigure")
	private String bestFigure;
	
	public Bowler_per_subclass() {}

	public Bowler_per_subclass(int id, String name, String bestFigure) {
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
