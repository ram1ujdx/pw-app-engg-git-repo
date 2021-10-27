package com.pw.inheritance;

public class Batter extends Player {

	private int centuries;
	
	private double strikeRate;
	
	private int totalRuns;
	
	
	public Batter() {
	}


	public Batter(int serialNo, String name, int age, int centuries, double strikeRate, int totalRuns) {
		super(serialNo, name, age);
		this.centuries = centuries;
		this.strikeRate = strikeRate;
		this.totalRuns = totalRuns;
	}

	
	@Override
	public void showPlayerDetails() {
	
		System.out.println(this);
		
	}


	@Override
	public String toString() {
		return "Batter [centuries=" + centuries + ", strikeRate=" + strikeRate + ", totalRuns=" + totalRuns
				+ ", serialNo=" + serialNo + ", name=" + name + ", age=" + age + "]";
	}


	
	
	
}
