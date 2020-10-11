package com.techelevator;

public class Candy extends Item {

	public Candy (String slot, String name, double price, String type, int count) {
		
		super(slot, name, price, type, count);
			
	}
	
	@Override
	public void getMessage() {
		
		System.out.println("Munch Munch, Yum!");
		
	}
	
	
}
