package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity 
@DiscriminatorValue (value = "Batter")
public class Batter_per_hierarchy extends Cricketer_per_hierarchy {
	@Column (name = "BestScore")
	private String bestScore;
	
	public Batter_per_hierarchy() {}

	public Batter_per_hierarchy(int id, String name, String bestScore) {
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
