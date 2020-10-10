package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Machine {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Welcome to The Supreme Vending Machine!!!");
		System.out.println();
		
		File inputFile = new File("vendingmachine.csv");
		
		Display display = new Display();
		Currency money = new Currency(0);
		Inventory inventory = new Inventory();
		
		display.getMainMenu() ;
		
		System.out.println("Please, choose what you would like to do!");
		String firstChoice = input.nextLine();
		
		if(firstChoice.equals("1")) {
		
		Map<String, Integer> displayObject = inventory.createDisplayInventory();
		System.out.println(displayObject);

	} else if(firstChoice.contentEquals("2")) {
		
		display.getPurchaseMenu(); 
		System.out.println();
		System.out.println("Great! What's next?");
		String purchaseMenu = input.nextLine();
		
		switch(purchaseMenu) {
		case "1": 
			System.out.println("How much money will you feed me?");
			String moneyFeed = input.nextLine();
			int intMoneyFeed =  Integer.parseInt(moneyFeed);
			int totalInputMoney = money.feedMoney(intMoneyFeed);
			System.out.println("Your total is " + totalInputMoney); break;
		
		case "2":
			inventory.createInventory();
			System.out.println("What What would you like? Ex: A1");
			String productChoice = input.nextLine();
			
			
			
		case "3":	
			
		}
	}
	
	

	}
}
