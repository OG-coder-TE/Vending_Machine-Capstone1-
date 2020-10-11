package com.techelevator;

public class Item {
	
	//Instance Variables
	private String name;
	private double price;
	private String slot;
	private String type;
	private int count;
	
	protected Item(String slot, String name, double price, String type, int count) {
		this.slot = slot;
		this.name = name;
		this.price = price;
		this.type = type;
		this.count = count;
		
	}
	
	public void getMessage() {
		
	}
	
	
	//Getters
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getSlot() {
		return slot;
	}
	public String getType() {
		return type;
	}
	public int getCount() {
		return count;
	}
	
	
	
}
