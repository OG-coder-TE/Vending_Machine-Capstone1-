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
	
	Scanner userInput = new Scanner(System.in);
	
	PurchaseMenu purchaseMenuObject = new PurchaseMenu();
	
	Vending_Machine vendingMachineObject = new Vending_Machine();

	
	
	//Instance Variables
	protected List<Item> inventoryList = new ArrayList<>();

	
	
	
	
	//Constructor
	public MainMenu() {
		
		
	}
	
	
	//Methods
	
	public void getMainMenu() throws NumberFormatException, IOException {
				
		boolean goodInput = false;
		System.out.println();
		System.out.println("==  Welcome to the Main Menu  ==");
		System.out.println();
		
		while(!goodInput) {
			System.out.println("[1] Display Vending Machine Items");
			System.out.println("[2] Purchase");
			System.out.println("[3] Exit");
			System.out.println();
			String selection = userInput.nextLine();
			
				if(selection.equals("1")) {
					displayInventory();
					goodInput = false;
				}
				else if(selection.equals("2")) {
					goodInput = true;
					purchaseMenuObject.getPurchaseMenu();
				}
				else if(selection.equals("3")) {
					goodInput = true;
					vendingMachineObject.exitMessage();
				}
				else if(selection.equals("4")) {
					goodInput=true;
				}
		}			
	}
	
	
	public void displayInventory() {
		System.out.println();
		System.out.println();

		for(Item product : inventoryList) {
			System.out.println(product.getSlot() + " | " + product.getName() + "| $" + product.getPrice() + " | " + product.getType() + " | " + product.getCount());
		}
		System.out.println();
		System.out.println();

	}
	
	

}

	
		

	