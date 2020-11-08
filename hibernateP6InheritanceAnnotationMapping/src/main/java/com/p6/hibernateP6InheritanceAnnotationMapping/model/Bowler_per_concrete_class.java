package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "bowler_per_concrete_class_annotation")
@AttributeOverrides ({
	@AttributeOverride( name = "id" , column = @Column (name = "Id") ),
	@AttributeOverride( name = "name" , column = @Column (name = "Name" ))
})

public class Bowler_per_concrete_class extends Cricketer_per_concrete_class {
	@Column (name = "BestFigure")
	private String bestFigure;
	
	public Bowler_per_concrete_class() {}

	public Bowler_per_concrete_class(int id, String name, String bestFigure) {
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
