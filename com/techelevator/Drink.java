package com.techelevator;

public class Drink extends Item {
	
	//Constructor
	public Drink(String slot, String name, double price, String type) {
		
		super(slot, name, price, type);
	}

	//Method
	@Override
	public void getMessage() {
		System.out.println("Glug Glug, Yum!");
		System.out.println();
	}
	
	
}
