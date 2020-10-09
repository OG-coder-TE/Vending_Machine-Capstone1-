package com.techelevator;

public class Drink extends Product {

	public Drink(String name, String price, int count) {
		super(name, price, count);
		
	}
	public void toCount(int count) {
		count--;
	}
	@Override
	public void dispenseMessage() {
		System.out.println("Glug Glug, Yum!");
		
	}
}
