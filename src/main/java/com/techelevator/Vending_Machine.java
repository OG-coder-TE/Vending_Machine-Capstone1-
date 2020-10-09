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
					System.out.println(locationName + "getterfromotherClass");
				} 
				returnToMainMenu = true;
			}
				
			
	   	} if(userInput.equals("2")) {
			
			boolean returnSubmenu = false;
			
			int addMoney = 0;
			//Submenu Options
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
					
					try(Scanner fileScanner = new Scanner(inputFile)) {
						while(fileScanner.hasNextLine()) {
							String line = fileScanner.nextLine();
							
							//Splitting up each line of the input file
							String[] productDetails = line.split("\\|");
							
							//Display the location, item name, and item price to user
							String productForDisplay = productDetails[0] + " " + productDetails[1] + " " + productDetails[2];
							System.out.println(productForDisplay);
								
						}
						
						System.out.println("Whatcha wanna?");
						String productChoice = input.nextLine();
						if(productChoice.contains("A1") || productChoice.contains("A2") || productChoice.contains("A3") || productChoice.contains("A4")) {
							
							Chip chipObject = new Chip(productChoice, "", count);
							chipObject.toCount(count);
							
							chipObject.dispenseMessage();
							
							} 
							
						}
						
					
					}
				}
					
			}
				
			
		}
		}
	}

		
		
		
		
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
		
		
		
		

