package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Product {
	
	private String name;
	private String price;
	private int money;
	
	public Product (String name, String price, int money) {
		this.name = name;
		this.price = price;
		this.money = money;
	}
	String path = "vendingmachine.csv";
	File inputFile = new File(path);
	String locationsName = "";
	int priceOriginal = 0;
	
	public String dispense() throws FileNotFoundException {
		
		
		try(Scanner fileScanner = new Scanner(inputFile)){
			if(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				
				
				String[] productDetails = line.split("\\|");
				String locationName = "\n" + productDetails[0] + " " +  "\n" + productDetails[1];
		} return locationsName;
		
		} 
	}
	
	
	public int price() throws FileNotFoundException {
		try(Scanner Scanner = new Scanner(inputFile)) {
			if(Scanner.hasNextLine()) {
				String line = Scanner.nextLine();
				
				
				String[] productDetails = line.split("\\|");
				String priceString = productDetails[3];
				int price = Integer.parseInt(priceString);
		}
		return priceOriginal;
		
	}
	
	}
	
	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public int getMoney() {
		return money;
	}
	
	
	
	
	
	
	
}