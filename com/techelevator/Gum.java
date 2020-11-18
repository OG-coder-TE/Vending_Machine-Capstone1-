package com.techelevator;

public class Gum extends Item {


	//Constructors
	public Gum(String slot, String name, double price, String type) {
		
		super(slot, name, price, type);
		
	}
	
	//Methods
	@Override
	public void getMessage() {
		System.out.println("Chew Chew, Yum!");
		System.out.println();
	}

	
}
