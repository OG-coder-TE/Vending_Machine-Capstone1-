package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Vending_Machine  {	
	
	static Scanner input = new Scanner(System.in);

	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		File inputFile = new File("vendingmachine.csv");
		boolean returnToMainMenu = true;
		
		while(returnToMainMenu) {

		System.out.println("(1) Display Vending Machine Item");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		int count = 5;
		String userInput = input.nextLine();	//Option
		//Listing all of the items **Need to add quantity remaining
		if(userInput.equals("1")) {
			
			try(Scanner fileScanner = new Scanner(inputFile)) {
				while(fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					
					
					String[] productDetails = line.split("\\|");
					String locationName = productDetails[0] + " " + productDetails[1];
					System.out.println(locationName + "Something here for count");
				} 
				returnToMainMenu = true;
			}
				
			
	   	} if(userInput.equals("2")) {
			
			boolean returnSubmenu = false;
			
			int addMoney = 0;
			//SubMenu Options
			while(!returnSubmenu) {
				System.out.println("(1) Feed Money");
				System.out.println("(2) Select Product");
				System.out.println("(3) Finish Transaction");
			
				String submenuSelection = input.nextLine();
			
				//Feeding the Machine Section
				if(submenuSelection.equals("1")) {
				
					System.out.println("How much money will you feed me?");
					String moneyFeed = input.nextLine();
					int intMoneyFeed =  Integer.parseInt(moneyFeed);		
				
					Currency enterMoney = new Currency(intMoneyFeed, 0, 0, 0, 0);
					
					
					enterMoney.feedMoney(intMoneyFeed);
					
					addMoney += enterMoney.feedMoney(intMoneyFeed);
				
					System.out.println("Your total is: " + addMoney);
					System.out.println("Cha-Ching - Yum!");
				
					returnSubmenu = false;
				
				}
				
				if(submenuSelection.equals("2")) {
					
				}
					
					try(Scanner fileScanner = new Scanner(inputFile)) {
						
						Map<String, Object> inventoryMap = new HashMap<>();
						Chip chipObject = new Chip("", "", count);
						Candy candyObject = new Candy("", "", count);
						Drink drinkObject = new Drink("", "", count);
						Gum gumObject = new Gum("", "", count);
						
						while(fileScanner.hasNextLine()) {
							String line = fileScanner.nextLine();
							
							//Splitting up each line of the input file
							String[] productDetails = line.split("\\|");
							
							//Display the location, item name, and item price to user
							String productForDisplay = productDetails[0] + " " + productDetails[1] + " " + productDetails[2];
									
							System.out.println(productForDisplay);
							//method to make map of inventory of products - create map first, then fill it up
							
							
							
							if(productDetails[3].equals("Chip")) {
							
								chipObject = new Chip(productDetails[0], productDetails[2], count);
														
								inventoryMap.put(productDetails[0], chipObject);

								}
							
							if(productDetails[3].equals("Candy")) {
								candyObject = new Candy(productDetails[0], productDetails[2], count);
						
								inventoryMap.put(productDetails[0], candyObject);
								}
							
							if(productDetails[3].equals("Drink")) {
								drinkObject = new Drink(productDetails[0], productDetails[2], count);
							
								inventoryMap.put(productDetails[0], drinkObject);
								}
								
							if(productDetails[3].equals("Gum")) {
							    gumObject = new Gum(productDetails[0], productDetails[2], count);
							
								inventoryMap.put(productDetails[0], gumObject);
								}
														
					
						} 
					
						System.out.println("What would you like? (Input Number + Letter)");
						//User input for selection
						String productSelection = input.nextLine();
						
						if(inventoryMap.containsKey(productSelection)) {
							
							}
						  if(productSelection.equals("A1") || productSelection.equals("A2") || productSelection.equals("A3") || productSelection.equals("A4")) {
								count--;
								if(count <= 0) {
								chipObject.notDispenseMessage();
							} chipObject.dispenseMessage();
							
						  if(productSelection.equals("B1") || productSelection.equals("B2") || productSelection.equals("B3") || productSelection.equals("B4")) {
							  count--;
								if(count <= 0) {
								candyObject.notDispenseMessage();
							} candyObject.dispenseMessage();
							} 
							if(productSelection.equals("C1") || productSelection.equals("C2") || productSelection.equals("C3") || productSelection.equals("C4")) {
								drinkObject.productWithdraw(count);
								drinkObject.dispenseMessage();
							}
							if(productSelection.equals("D1") || productSelection.equals("D2") || productSelection.equals("D3") || productSelection.equals("D4")) {
								gumObject.productWithdraw(count);
								gumObject.dispenseMessage();
							
					     	}
						
					
					
			}
				
			
		}
		}

	   	}
		}
	}}

		
//		A1|Potato Crisps|3.05|Chip
//		A2|Stackers|1.45|Chip
//		A3|Grain Waves|2.75|Chip
//		A4|Cloud Popcorn|3.65|Chip
//		B1|Moonpie|1.80|Candy
//		B2|Cowtales|1.50|Candy
//		B3|Wonka Bar|1.50|Candy
//		B4|Crunchie|1.75|Candy
//		C1|Cola|1.25|Drink
//		C2|Dr. Salt|1.50|Drink
//		C3|Mountain Melter|1.50|Drink
//		C4|Heavy|1.50|Drink
//		D1|U-Chews|0.85|Gum
//		D2|Little League Chew|0.95|Gum
//		D3|Chiclets|0.75|Gum
//		D4|Triplemint|0.75|Gum
		
		
		
		

