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
	
	

	public static void createInventory() throws FileNotFoundException  {
		String path = "vendingmachine.csv";
		File inputFile = new File(path);	
	    
	    
	  try (Scanner fileScanner = new Scanner(inputFile)) {
	
	while(fileScanner.hasNextLine()) {
		String line = fileScanner.nextLine();
				String[] info = line.split("\\|");
		

		Product product = new Product(info);
		inventoryMap.put(info[0], product);
		

	
	  }
	
	  }
	
	}
	
	
	
	
	
	
	
	
	
}