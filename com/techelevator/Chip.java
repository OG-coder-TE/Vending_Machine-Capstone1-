package com.techelevator;

public class Chip extends Item {
	
	
	//Constructor
	public Chip(String slot, String name, double price, String type) {
		
		super(slot, name, price, type);
		
	}

	@Override
	public void getMessage() {
		System.out.println("Crunch Crunch, Yum!");
		System.out.println();
		
	}

}
