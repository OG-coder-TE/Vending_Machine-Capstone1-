package com.techelevator;

public class Currency {

	//instance variables
	public int inputMoney;
	public int quarter;
	public int nickel;
	public int dime;
	public int totalInputMoney;
	public int change;
	
	
	//Constructor
	public Currency(int inputMoney, int quarter, int nickel, int dime, int totalInputMoney, int change) {
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
		while(change >= 25) {
			quarter += 1;
			change -= 25;
		}
			
		while(change >= 10) {
			dime += 1;
			change -= 10;
		}
		
		while(change >= 5) {
			nickel += 1;
			change -= 5;
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
