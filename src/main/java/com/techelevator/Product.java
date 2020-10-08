package com.techelevator;

public abstract class Product {

	//Instance Variables
	private String name;
	private double price;
	private int amountRemaining = 5;
	private String slotLocation;
	
	
	//Constructor
	public Product(String name, double price, int amountRemaining, String slotLocation) {
		 this.name = name;
		 this.price = price;
		 this.amountRemaining = amountRemaining;
		 this.slotLocation = slotLocation;
		
	}

	
	
	
	
	
	
	
	
	
//Getters
	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public int getAmountRemaining() {
		return amountRemaining;
	}


	public String getSlotLocation() {
		return slotLocation;
	}
	
	
}
