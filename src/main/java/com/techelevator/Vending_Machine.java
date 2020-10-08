package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vending_Machine {	
	
	static Scanner input = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		File inputFile = new File("vendingmachine.csv");

		System.out.println("(1) Display Vending Machine Item");
		System.out.println("(2) Select Product");
		System.out.println("(3) Exit");
		
		String userInput = input.nextLine();	//Option
		
		if(userInput.equals("1")) {
			
			try(Scanner fileScanner = new Scanner(inputFile)) {
				while(fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					
					
					String[] productDetails = line.split("\\|");
					String locationName = productDetails[0] + " " + productDetails[1];
					System.out.println(locationName + "getterfromotherClass");
				}
				
				
			} catch(FileNotFoundException e) {
				System.out.println("There is NO such file.");
				
			}
			
		} if(userInput.equals("2")) {
			System.out.println("(1) Feed Money");
			System.out.println("(2) Select Product");
			System.out.println("(3) Finish Transaction");
			
			String submenuSelection = input.nextLine();
			
			if(submenuSelection.equals("1")) {
				
				System.out.println("How much money will you feed me?");
				String moneyFeed = input.nextLine();
				int intMoneyFeed =  Integer.parseInt(moneyFeed);		
				
				Currency enterMoney = new Currency(intMoneyFeed, 0, 0, 0, 0);
				
				enterMoney.feedMoney(intMoneyFeed);
				
				System.out.println("Your total is: " + enterMoney.feedMoney(intMoneyFeed));
				System.out.println("Cha-Ching - Yum!");
				
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
		
		
		
		
	}

}
