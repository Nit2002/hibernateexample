package com.p4.hibernateP4InheritanceMapping.model;

public class Batter extends Cricketer {
	private String bestScore;
	
	public Batter() {}

	public Batter(int id, String name, String bestScore) {
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
