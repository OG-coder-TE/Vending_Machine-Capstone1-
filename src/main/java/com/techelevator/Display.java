package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Display {
	
	public Map<String, 	Integer> createDisplay() throws FileNotFoundException {
		
	int count = 5;
	 String path = "vendingmachine.csv";
		File inputFile = new File(path);
		
		Map<String, Integer> display = new HashMap<>();
		String pathDisplay = "vendingmachine.csv";
		File input = new File(path);

	try(Scanner fileScanner = new Scanner(inputFile)) {
		while(fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			
			
			String[] productDetails = line.split("\\|");
			String locationName = "\n" + productDetails[0] + " " +  "\n" + productDetails[1];
			display.put(locationName, count);
		} 
	}
	return display;
	}
	
	
	//Methods
	public void getMainMenu(){
		
		System.out.println("(1) Display Vending Machine Item");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
	}
	
	public void getPurchaseMenu() {
		
		System.out.println("(1) Feed Money");
		System.out.println("(2) Select Product");
		System.out.println("(3) Finish Transaction");
		
	}
	
	public void displayInventoryWithRemainingQuantity() {
		
		
				
	}
	
	//Getters
	
	
	
	
	
}
