package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Product extends Vending_Machine {
	
	

	//Instance Variables
	private Map<String, String> selectProductMap = new HashMap<>();
	
	//Constructor
	public Product(Map<String, String> selectProductMap) {
		this.selectProductMap = selectProductMap;
		
	}
	
	//Method
	public void callMap() {
		
		
	}
	
	
//Getters
	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public int getAmountRemaining() {
		return amountRemaining;
	}


	public String getSlotLocation() {
		return slotLocation;
	}
	
	
}
//A1|Potato Crisps|3.05|Chip
//A2|Stackers|1.45|Chip
//A3|Grain Waves|2.75|Chip
//A4|Cloud Popcorn|3.65|Chip
//B1|Moonpie|1.80|Candy
//B2|Cowtales|1.50|Candy
//B3|Wonka Bar|1.50|Candy
//B4|Crunchie|1.75|Candy
//C1|Cola|1.25|Drink
//C2|Dr. Salt|1.50|Drink
//C3|Mountain Melter|1.50|Drink
//C4|Heavy|1.50|Drink
//D1|U-Chews|0.85|Gum
//D2|Little League Chew|0.95|Gum
//D3|Chiclets|0.75|Gum
//D4|Triplemint|0.75|Gum