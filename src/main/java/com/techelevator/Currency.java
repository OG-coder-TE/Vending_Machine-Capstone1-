package com.techelevator;

public class Currency {

	//instance variables
	public int inputMoney;
	public double quarter;
	public double nickel;
	public double dime;
	public int totalInputMoney;
	public double change;
	
	
	//Constructor
	public Currency(int inputMoney, double quarter, double nickel, double dime, int totalInputMoney, double change) {
		this.inputMoney = inputMoney;
		this.quarter = 0;
		this.nickel = 0;
		this.dime = 0;
		this.totalInputMoney = totalInputMoney;
		this.change = change;
	}
	public Currency(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	


	//Methods
	public int feedMoney(int inputMoney) {		
		
		totalInputMoney = 0;
		
		if (inputMoney != 1 && inputMoney != 2 && inputMoney != 5 && inputMoney != 10) {
			
			return 0;

		} totalInputMoney += inputMoney; 
		return totalInputMoney;
	}
	
	
	
	public void changeOut(int change) {
		while(change >= 0.25) {
			quarter += 1;
			change -= 0.25;
		}
			
		while(change >= 0.10) {
			dime += 1;
			change -= 0.10;
		}
		
		while(change >= 0.05) {
			nickel += 1;
			change -= 0.5;
		}
		}
	

	
		
	
	public int getInputMoney() {
		return inputMoney;
	}

	public int getTotalInputMoney() {
		return totalInputMoney;
	}

	public double getQuarter() {
		return quarter;
	}

	public double getNickel() {
		return nickel;
	}

	public double getDime() {
		return dime;
	}
		
	
}
