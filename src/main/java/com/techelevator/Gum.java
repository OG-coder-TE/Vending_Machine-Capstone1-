package com.techelevator;

public class Gum extends Product {

	public Gum(String name, String price, int count) {
		super(name, price, count);
		
	}
	
	public void toCount(int count) {
		count--;
	}

	@Override
	public void dispenseMessage() {
		System.out.println("Chew Chew, Yum!");
		
	}
	public void notDispenseMessage() {
		System.out.println("We are out of it, sorry, choose another product, please!");

}
}