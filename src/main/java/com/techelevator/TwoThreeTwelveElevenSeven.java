package com.techelevator;

public class TwoThreeTwelveElevenSeven {
	
	protected String nonpoint;
	
	
	public void puckOffNoPoint(String nonpoint) {
		if(nonpoint.equals("2")) {
			twoPuckOffMessage();
		}
		
		else if(nonpoint.equals("3")) {
			threePuckOffMessage();
			
		}
		else if(nonpoint.equals("12")) {
			twelvePuckOffMessage();
		}
		else if(nonpoint.equals("11")) {
			elevenPuckOffMessage();
			
		}
		else if(nonpoint.equals("7")) {
			sevenPuckOffMessage();
	}

}
	
	
	public void twoPuckOffMessage() {
	System.out.println("2! Aces! Twice in the rice! Take the line, pay the don't! Double the bubble!");
	}
	
	public void threePuckOffMessage() {
	System.out.println("3! Ace-deuce! A buck and a duck! Take the line, pay the don't! Single the field!");
}
	public void twelvePuckOffMessage() {
		System.out.println("12! Boxcars! All the spots and all the dots! Take the line, bar the don't! Double the field!");
	}
	
	public void elevenPuckOffMessage() {
		System.out.println("Yo! 11! Yo! Take the don't, pay the line, field roll");
	}
	
	public void sevenPuckOffMessage() {
		System.out.println("Seven winner! Take the don't, pay the line! Save the odds and pay behind!");
	}
	
}