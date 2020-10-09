package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class Chip extends Product{
	
	
	
	public Chip(String name, String price, int count) {
		super(name, price, count);
	
	}
	 

	@Override
	public void productWithdraw(int count) {
		count--;
		
	}


	@Override
	public void dispenseMessage() {
		
		System.out.println("Crunch Crunch, Yum!");
		
	
		
	}


	
}


/// if(productForDisplay.contains("A1") || productForDisplay.contains("A1")...{
///Chip chipspurchase = new chip("", "", 0)
///chipspurchase.methodtodispense()