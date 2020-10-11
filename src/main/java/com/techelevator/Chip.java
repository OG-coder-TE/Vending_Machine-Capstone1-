package com.techelevator;

public class Chip extends Item {

	public Chip (String slot, String name, double price, String type, int count) {
			
		super(slot, name, price, type, count);
			
	}
	
	@Override
	public void getMessage() {
		System.out.println("Crunch Crunch, Yum!");
		
	}
	
}
