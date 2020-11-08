package com.p4.hibernateP4InheritanceMapping.model;

public class Bowler extends Cricketer {
	private String bestFigure;
	
	public Bowler() {}

	public Bowler(int id, String name, String bestFigure) {
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
