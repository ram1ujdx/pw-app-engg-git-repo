package com.pw.inheritance;

public class CricketApp {

	public static void main(String[] args) {
		
		Player player=new Batter(18,"Virat Kohli",32, 37, 120.2, 183);
		
		
		player.showPlayerDetails();
		
		
		PlayerTask task = new PlayerTask() {
			
			public void play() {
				System.out.println("Hi.. I am Playing..");
			}
		};
		
		task=new PlayerTask() {
			
			@Override
			public void play() {
				System.out.println("Hi.. I am Ready to Bat");
			}
		};

		task.play();
		
		

	}

}
