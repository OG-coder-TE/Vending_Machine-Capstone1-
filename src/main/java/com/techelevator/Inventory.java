package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory { 
	
	int count = 5;

	public Map<String, Object> createInventory() throws FileNotFoundException {
	    Map<String, Object> inventoryMap = new HashMap<>();
	    String path = "vendingmachine.csv";
		File inputFile = new File(path);
	    
	  try (Scanner myScanner = new Scanner(inputFile)) {
	
	while(myScanner.hasNextLine()) {
		String line = myScanner.nextLine();
		//Splitting up each line of the input file
		String[] productDetails = line.split("\\|");
		
		//Display the location, item name, and item price to user
		String productForDisplay = productDetails[0] + " " + productDetails[1] + " " + productDetails[2];
				
		System.out.println(productForDisplay);
		//method to make map of inventory of products - create map first, then fill it up
		
	if(productDetails[3].equals("Chip")) {
		
		Chip chipObject = new Chip(productDetails[0], productDetails[2], count);
								
		inventoryMap.put(productDetails[0], chipObject);

		}
	
	if(productDetails[3].equals("Candy")) {
		Candy candyObject = new Candy(productDetails[0], productDetails[2], count);

		inventoryMap.put(productDetails[0], candyObject);
		}
	
	if(productDetails[3].equals("Drink")) {
		Drink drinkObject = new Drink(productDetails[0], productDetails[2], count);
	
		inventoryMap.put(productDetails[0], drinkObject);
		}
		
	if(productDetails[3].equals("Gum")) {
	   Gum gumObject = new Gum(productDetails[0], productDetails[2], count);
	
		inventoryMap.put(productDetails[0], gumObject);
	}
		}
								
		return inventoryMap;
	}
	
}
}