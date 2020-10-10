package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory { 
	
	//Instance Variables
	private Map<String, Integer> inventoryMap;
	
	
	
	int count = 5;
	
	public Map<String, Integer> createDisplayInventory() throws FileNotFoundException {
		
		Map<String, Integer> display = new HashMap<>();
	 String path = "vendingmachine.csv";
		File inputFile = new File(path);
		
		
		String pathDisplay = "vendingmachine.csv";
		File input = new File(path);

	try(Scanner fileScanner = new Scanner(inputFile)) {
		while(fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			
			
			String[] productDetails = line.split("\\|");
			String locationName = "\n" + productDetails[0] + " " +  "\n" + productDetails[1];
			display.put(locationName, count);
		} 
		return display;
	}
	
	}

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
		
		Product chipObject = new Product (productDetails[0], productDetails[2], count);
								
		inventoryMap.put(productDetails[0], chipObject);

		}
	
	if(productDetails[3].equals("Candy")) {
		Product candyObject = new Product(productDetails[0], productDetails[2], count);

		inventoryMap.put(productDetails[0], candyObject);
		}
	
	if(productDetails[3].equals("Drink")) {
		Product drinkObject = new Product (productDetails[0], productDetails[2], count);
	
		inventoryMap.put(productDetails[0], drinkObject);
		}
		
	if(productDetails[3].equals("Gum")) {
	   Product gumObject = new Product (productDetails[0], productDetails[2], count);
	
		inventoryMap.put(productDetails[0], gumObject);
	}
		}
								
		return inventoryMap;
	}
	
}
	public void dispenseAuditReport() {
		
		
		
	}
	
	
	
	
	
	
	
}