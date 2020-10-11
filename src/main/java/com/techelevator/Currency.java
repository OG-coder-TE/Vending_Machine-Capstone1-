package com.techelevator;

public class Currency {

	//instance variables
	private final int QUARTER = 25;
	private final int DIME = 10;
	private final int NICKEL = 5;
	private int dollars;
	private double change;
	public int getDollars() {
		return dollars;
	}


	public double getChange() {
		return change;
	}


	public double getBalance() {
		return balance;
	}


	public double getFedMoney() {
		return fedMoney;
	}

	private double balance = 0.00;
	private double fedMoney;
	
	
	
	//Constructors
	public Currency() {
		
	}
	
	
	//Methods
	public void formatChange() {
		
		dollars = (int) balance;
		
		change = (double) (balance - dollars);
		
		
	}
	
	public String createChange() {
		
		int quarterAmount = dollars * 4;
		int dimeAmount = 0;
		int nickelAmount = 0;
		
		double changeAsDouble = change * 100.00;			// change value is decimal, multiplying to make it whole numbers
		
		int cents = (int) Math.round(changeAsDouble);		//rounds the change to make whole change
		
		
		quarterAmount += cents / QUARTER;					//The number of quarters
		
		int remainingDimesAndNickels = cents % QUARTER;		//How many dimes and nickels are remaining
		
		dimeAmount += remainingDimesAndNickels / DIME;
		
		int remainingNickels = remainingDimesAndNickels % DIME;
		
		nickelAmount += remainingNickels / NICKEL;
		
		return cents + " You receive " + quarterAmount + " quarter(s), " + dimeAmount + " dime(s), and " + nickelAmount + " nickels in change.";
		
	}
	
	public double feedMoney(double moneyFed) {
		
		balance += moneyFed;
		
		fedMoney = moneyFed;
		
		return moneyFed;
		//System.out.println(moneyFed + " " + getBalance());
		
	}
	
	//Getters
	
}
