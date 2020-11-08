package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "batter_per_subclass_annotation" )
@PrimaryKeyJoinColumn(name="ID") 

public class Batter_per_subclass extends Cricketer_per_subclass {
	
	@Column (name = "BestScore")
	private String bestScore;
	
	public Batter_per_subclass() {}

	public Batter_per_subclass(int id, String name, String bestScore) {
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
