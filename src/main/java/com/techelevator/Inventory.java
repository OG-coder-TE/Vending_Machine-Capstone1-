package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory { 
	public static Map <String, Product> inventoryMap = new TreeMap<String, Product>();
	public static File log = new File("vendingmachine.csv");
	public static void main(String[] args) {
		
		createInventory();
		Display main = new Display(Product, log);
		main.run();
	}
	
	
	

	public static void createInventory() throws FileNotFoundException  {
		String path = "vendingmachine.csv";
		File inputFile = new File(path);	
	    
	    
	  try (Scanner fileScanner = new Scanner(inputFile)) {
	
	while(fileScanner.hasNextLine()) {
		String line = fileScanner.nextLine();
		//Splitting up each line of the input file
		String[] info = line.split("\\|");
		
		//Display the location, item name, and item price to user
		Product product = new Product(info);
		inventoryMap.put(info[0], product);
		
		//method to make map of inventory of products - create map first, then fill it up
	
	  }
	
	  }
	
	}
	
	
	
	
	
	
	
	
	
}