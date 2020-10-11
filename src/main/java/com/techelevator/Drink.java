package com.techelevator;

public class Drink extends Item {
	
	public Drink (String slot, String name, double price, String type, int count) {
		
		super(slot, name, price, type, count);
			
	}
	
	@Override
	public void getMessage() {
		
		System.out.println("Glug Glug, Yum!");
		
	}
	
}
