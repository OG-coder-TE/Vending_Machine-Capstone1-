package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {
	
	public ArrayList<String> displayMachineItems() throws FileNotFoundException {
		
		ArrayList<String> machineItems = new ArrayList();
		String path = "vendingmachine.csv";
		File inputFile = new File(path);
		
		Scanner fileScanner = new Scanner(inputFile);
			while(fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			String[] info = line.split("\\|");
			String slot = info[0];
			String name = info[1];
			String price = info[2];
			machineItems.add(slot);
			machineItems.add(name);
			machineItems.add(price);
			}
		return machineItems;
	} 
	
	public Map<String, Object> createInventory() throws FileNotFoundException {
	
		Map<String,Object> inventoryMap = new TreeMap<String, Object>();
	
		String path = "vendingmachine.csv";
		File inputFile = new File(path);
		
		try (Scanner fileScanner = new Scanner(inputFile)) {
			
			Chip chipObject = new Chip("", "", 0.0, "", 0);
			Candy candyObject = new Candy("", "", 0.0, "", 0);
			Drink drinkObject = new Drink("", "", 0.0, "", 0);
			Gum gumObject = new Gum("", "", 0.0, "", 0);
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] info = line.split("\\|");
				
				String slot = info[0];
				String name = info[1];
				Double price = Double.parseDouble(info[2]);
				String type = info[3];
				int count = 0;
				
				
				if(info[3].equals("Chip")) {
					
						chipObject = new Chip(slot, name, price, type, count);
												
						inventoryMap.put(info[0], chipObject);

						}
					
					if(info[3].equals("Candy")) {
						
						candyObject = new Candy(slot, name, price, type, count);
				
						inventoryMap.put(info[0], candyObject);
						}
					
					if(info[3].equals("Drink")) {
						
						drinkObject = new Drink(slot, name, price, type, count);
					
						inventoryMap.put(info[0], drinkObject);
						}
						
					if(info[3].equals("Gum")) {
						
					    gumObject = new Gum(slot, name, price, type, count);
					
						inventoryMap.put(info[0], gumObject);
						}
			}
		} return inventoryMap;
	
	} 
}
//	public static Map <String, Product> inventoryMap = new TreeMap<String, Product>();
//	
//	public static File log = new File("log.txt");
//	public static void main(String[] arg) throws FileNotFoundException {
//		
//		createInventory();
//		MainMenu main = new MainMenu(inventoryMap, log);
//	
//	}
// 
//	public static void createInventory() throws FileNotFoundException  {
//		String path = "vendingmachine.csv";
//		File inputFile = new File(path);	
//	    
//	    
//	  try (Scanner fileScanner = new Scanner(inputFile)) {
//	
//	while(fileScanner.hasNextLine()) {
//		String line = fileScanner.nextLine();
//				String[] info = line.split("\\|");
//		
//
//		Product product = new Product(info);
//		inventoryMap.put(info[0], product);
//		
//	  }
//	
//	  }
//	
//	}
	
	
	
	
	
	
	
	
	
