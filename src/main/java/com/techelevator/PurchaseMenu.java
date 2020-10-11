package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PurchaseMenu {
	
	Scanner userInput = new Scanner(System.in);
	
	Vending_Machine vendingMachineObject = new Vending_Machine();
	
	MainMenu mainMenuObject = new MainMenu();
	
	Currency currencyObject = new Currency();
	
	Audit auditObject = new Audit();

	//Instance Variables
	protected double currentBalance = 0.00;
	protected List<Item> inventoryList = new ArrayList<>();

	
	//Constructor
	
	
	
	//Methods
	public void getPurchaseMenu() throws NumberFormatException, IOException {
		boolean goodInput = false;
		System.out.println();
		System.out.println();
		System.out.println("==  Purchase Menu  ==");
		System.out.println();
		System.out.println();
		
		while(!goodInput) {
			System.out.println("[1] Feed Money");
			System.out.println("[2] Select Product");
			System.out.println("[3] Finish Transaction");
			System.out.println();
			System.out.println("Current Balance: $" + currentBalance);
			System.out.println();
			System.out.println();
			String selection = userInput.nextLine();
			
				if(selection.equals("1")) {
					//feed money
					goodInput = true;
					feedMoney();
				}
				else if(selection.equals("2")) {
					//select product
					getSelectProduct();
					goodInput = true;
				}
				else if(selection.equals("3")) {
					currencyObject.giveChange();
					goodInput = true;
					mainMenuObject.getMainMenu();
				}		
			}
		}
	
	public void feedMoney() throws NumberFormatException, IOException {
		boolean finish = false;
		while(!finish) {
			System.out.println();
			System.out.println("== Input 6 to Go Back And Select Product ==");
			System.out.println("Please select amount to feed in Dollars: (1), (2), (5), (10)");
			System.out.println();
			System.out.println("Current Balance: $" + currentBalance);
			System.out.println();
			System.out.println();
			String inputAmount = userInput.nextLine();
			
			//User inputs "6" to go back to product selection menu
			if(inputAmount.equals("6")) {
				
				finish = true;
				getSelectProduct();
			}
			else if(inputAmount.equals("1") || inputAmount.equals("2") || inputAmount.equals("5") || inputAmount.equals("10")) {
				double startingAmount = currentBalance;
				currentBalance += Double.parseDouble(inputAmount);
				Audit lineInAudit = new Audit("FEED MONEY: ", startingAmount, currentBalance);
			}
			else {
				vendingMachineObject.incorrectInputMessage();
			}
		}
	}
	
	
	public void getSelectProduct() throws NumberFormatException, IOException {
		mainMenuObject.displayInventory();
		System.out.println("Current Balance: $" + currentBalance);

		System.out.println();
		System.out.println("Please Enter Slot Location: ");
		String userSelection = userInput.nextLine().toUpperCase();
		
		boolean goodInput = false;
		
		while(!goodInput) {
			for(Item inventory : inventoryList) {
				//if user enters a valid location
				if(inventory.getSlot().equals(userSelection)) {
					goodInput = true;
					goodItemSelection(inventory);
				}
			}
		vendingMachineObject.incorrectInputMessage();
		getSelectProduct();
		}
	}
	
	//When there input item is valid
	public void goodItemSelection(Item inventory) throws IOException {
				
			//When there is no product in stock
			if(inventory.getCount() < 1) {
				System.out.println();
				System.out.println(" Not enough product available!");
				System.out.println();
				
				//Takes back to select another product
				getSelectProduct();
			}
			//When the current balance is less than price of product
			if(currentBalance < (inventory.getPrice())) {
				System.out.println();
				System.out.println(" Not Enough Funds!");
				System.out.println();
				
				//Takes back to give option to feed money
				getPurchaseMenu();
			}	
			
			//When the current balance is equal to or more than price of product
			else { 
				
			
				//When product is in stock - updates current balance, updates current inventory
					double startingAmount = currentBalance;
					currentBalance -= (inventory.getPrice());
					inventory.dispenseProduct();
				
					
					
					//Log each time a product is dispensed
					double initialAmount = startingAmount;
						Audit lineInAudit  = new Audit(inventory.getName(), inventory.getSlot(), initialAmount, (initialAmount - inventory.getPrice()));
						initialAmount -= inventory.getPrice();
					}	
					getPurchaseMenu();
				}
			
		}
	
	
	
	
	//Getters
	
	
	
	
	
	
