package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "batter_per_concrete_class_annotation")
@AttributeOverrides ({
	@AttributeOverride( name = "id" , column = @Column (name = "Id") ),
	@AttributeOverride( name = "name" , column = @Column (name = "Name" ))
})
public class Batter_per_concrete_class extends Cricketer_per_concrete_class {
	@Column (name = "BestScore")
	private String bestScore;
	
	public Batter_per_concrete_class() {}

	public Batter_per_concrete_class(int id, String name, String bestScore) {
		super(id, name);
		this.bestScore = bestScore;
	}

	public String getBestScore() {
		return bestScore;
	}

	public void setBestScore(String bestScore) {
		this.bestScore = bestScore;
	}

	@Override
	public String toString() {
		return "Batter [bestScore=" + bestScore + "]";
	}
	
}
