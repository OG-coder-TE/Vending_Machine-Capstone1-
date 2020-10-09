package com.techelevator;

public class Currency {

	//instance variables
	private int inputMoney;
	private double quarter;
	private double nickel;
	private double dime;
	private int totalInputMoney;
	
	
	//Constructor
	public Currency(int inputMoney, double quarter, double nickel, double dime, int totalInputMoney) {
		this.inputMoney = inputMoney;
		this.quarter = 0.25;
		this.nickel = 0.05;
		this.dime = 0.10;
		this.totalInputMoney = totalInputMoney;
	}
	


	//Methods
	public int feedMoney(int inputMoney) {		
		
		totalInputMoney = 0;
		
		if (inputMoney != 1 && inputMoney != 2 && inputMoney != 5 && inputMoney != 10) {
			
			return 0;

		} totalInputMoney += inputMoney; 
		return totalInputMoney;
	}
	
	
	
	//Getters
	
		
	
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
