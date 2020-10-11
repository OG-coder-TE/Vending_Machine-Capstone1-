package com.techelevator;

public class Candy extends Item {

	
	public Candy(String slot, String name, double price, String type) {
		
		super(slot, name, price, type);
		
	}
	@Override
	public void getMessage() {
		System.out.println("Munch Munch, Yum!");
		System.out.println();
		
	}
}
