package com.techelevator;

public class Gum extends Item {

	public Gum (String slot, String name, double price, String type, int count) {
		
		super(slot, name, price, type, count);
			
	}
	
	@Override
	public void getMessage() {
		
		System.out.println("Chew Chew, Yum!");
		
	}
	
}
