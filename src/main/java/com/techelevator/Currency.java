package com.techelevator;

import java.io.IOException;

public class Currency {

	
	//Instance Variables
	protected double currentBalance = 0.00;

	
	//Constructor
	
	
	//Methods
	
	public void giveChange() throws IOException {
		
		int change = (int)(currentBalance * 100);
		
		int quarters = ((int)change/25);
	    change = change % 25;
	    
	    int dimes = ((int)change/10);
	    change = change % 10;
	    
	    int nickels = ((int)change/5);
	    change = change % 5;
	    
	    Audit lineInAudit = new Audit("GIVE CHANGE: ", currentBalance, 0.00);
	    
	    currentBalance = 0;
	    
	    System.out.println("Quarters: " + quarters + ", Dimes: " + dimes + ", Nickels: " + nickels);
	    
	}
	
	
	
	
	
}
