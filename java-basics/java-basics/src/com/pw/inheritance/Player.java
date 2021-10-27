package com.pw.inheritance;

public abstract class Player {

	protected int serialNo;
	protected String name;
	protected int age;
	
	public Player() {
	}

	public Player(int serialNo, String name, int age) {
		this.serialNo = serialNo;
		this.name = name;
		this.age = age;
	}
	
	
	public abstract void showPlayerDetails();

	@Override
	public String toString() {
		return "Player [serialNo=" + serialNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
