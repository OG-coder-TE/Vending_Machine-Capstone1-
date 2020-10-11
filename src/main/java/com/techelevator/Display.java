package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Display {
	
	
	
	Currency money = new Currency();
	Inventory inventory = new Inventory();
	int currentBalance = 0;
	
	
	
	//Methods
	public void getMainMenu() throws FileNotFoundException{
	
		System.out.println("Welcome to The Supreme Vending Machine!!!");
		System.out.println();
		
		System.out.println("(1) Display Vending Machine Item");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		
		System.out.println("Please, choose what you would like to do!");
		Scanner input = new Scanner(System.in);
		String firstChoice = input.nextLine();
		
		if(firstChoice.equals("1")) {
			ArrayList<String> displayObject = inventory.displayMachineItems();
			System.out.println(displayObject);
			System.out.println();
			getMainMenu();
		}
			
		if(firstChoice.contentEquals("2")) {
				
				System.out.println();
				System.out.println("Great! What's next?");
				getPurchaseMenu();
		
			}
		
		if(firstChoice.contentEquals("3")) {
			System.out.println("Goodbye!");
			System.exit(1);
		}
		
	}
	
	public void getPurchaseMenu() throws FileNotFoundException {
		
		System.out.println("(1) Feed Money");
		System.out.println("(2) Select Product");
		System.out.println("(3) Finish Transaction");
		Scanner input = new Scanner(System.in);
		String purchaseMenu = input.nextLine();
		
		if (purchaseMenu.equals("1")) {
			getFeedMoney();
		}
		
		if (purchaseMenu.equals("2")) {
			getSelectProduct();
		}
		
		if (purchaseMenu.equals("3")) {
			money.createChange();
		}
	}
	
	public void getFeedMoney() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("How much money will you feed me?");
			String moneyFeed = input.nextLine();
			int intMoneyFeed =  Integer.parseInt(moneyFeed);
			int totalInputMoney = (int)money.feedMoney(intMoneyFeed);
			currentBalance += totalInputMoney;
			System.out.println("Your total is " + currentBalance);
			getPurchaseMenu();
	}
	
	public void getSelectProduct() throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
//		inventory.createInventory();
		System.out.println("What What would you like? Ex: A1");
		String productChoice = input.nextLine();
		if (inventory.createInventory().containsKey(productChoice)) {
			System.out.println(inventory.createInventory());
		}
		getPurchaseMenu();
	}
	
	public void getFinishTransaction() {
		
		Scanner input = new Scanner(System.in);
	}
//			
//			
//		case "3":
//		 getPurchaseMenu();
//		}
	
	
	public void displayInventoryWithRemainingQuantity() {
		
		
				
	}
	
	//Getters
	
	
	
	
	
}
