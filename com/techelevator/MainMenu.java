package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
		
		
	//Instance Variables
	
	
	//Constructor
	public MainMenu() {
		
		
	}
	
	
	//Methods
	
	public void getMainMenu() throws NumberFormatException, IOException {
		
		//Welcome message
		System.out.println();
		System.out.println("==  Welcome to the Main Menu  ==");
		System.out.println();
		
		Vending_Machine vendingMachineObject = new Vending_Machine();
		

		
		boolean goodInput = false;

		while(!goodInput) {
			System.out.println("[1] Display Vending Machine Items");
			System.out.println("[2] Purchase");
			System.out.println("[3] Exit");
			System.out.println();
			Scanner userInput = new Scanner(System.in);
			String selection = userInput.nextLine();
			
				if(selection.equals("1")) {
					
					displayInventory();
					
					goodInput = false;
				}
				else if(selection.equals("2")) {
					
					goodInput = true;
					
					Currency currencyObject = new Currency();
					currencyObject.getPurchaseMenu();
				}
				else if(selection.equals("3")) {
					
					goodInput = true;
				
					vendingMachineObject.exitMessage();
				}
				
		}			
	}
	
	//method for when user inputs "1" and displays current inventory
	public void displayInventory() {
		System.out.println();
		System.out.println();

		Vending_Machine vendingMachineObject = new Vending_Machine();
		for(Item product : vendingMachineObject.getInventoryList()) {
			System.out.println(product.getSlot() + " | " + product.getName() + "| $" + product.getPrice() + " | " + product.getType() + " | " + product.getCount());
		}
		System.out.println();
		System.out.println();

	}
	
	

}

	
		

	