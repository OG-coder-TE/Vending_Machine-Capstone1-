package com.techelevator;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Currency {

	
	//Instance Variables
	private double currentBalance = 0.00;

	
	//Constructor
	
	
	//Methods
	
		public void giveChange() throws IOException {
		
		int change = (int)(currentBalance * 100);
		
		int quarters = (change / 25);
	    change = change % 25;
	    
	    int dimes = (change / 10);
	    change = change % 10;
	    
	    int nickels = (change / 5);
	    change = change % 5;
	    
	    Audit lineInAudit = new Audit("GIVE CHANGE: ", currentBalance, 0.00);
	    
	    
	    System.out.println("Quarters: " + quarters + ", Dimes: " + dimes + ", Nickels: " + nickels);
	    
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
				Scanner userInput = new Scanner(System.in);

				String inputAmount = userInput.nextLine();
				
				//User inputs "6" to go back to product selection menu
				if(inputAmount.equals("6")) {
					
					
					finish = true;
					getSelectProduct();
				}
				
				//Logs the transaction for when money is fed to the Log.txt file
				else if(inputAmount.equals("1") || inputAmount.equals("2") || inputAmount.equals("5") || inputAmount.equals("10")) {
					
					
					double startingAmount = currentBalance;
					currentBalance += Double.parseDouble(inputAmount);
					
					Audit lineInAudit = new Audit("FEED MONEY: ", startingAmount, currentBalance);
				}
				//If incorrect input is given
				else {
					Vending_Machine vendingMachineObject = new Vending_Machine();
					vendingMachineObject.incorrectInputMessage();
				}
			}
		}
		
		
		//When there input item is valid
		public void goodItemSelection(Item inventory) throws IOException {
			int withdrawAmount = 1;
			
				//When there is no product in stock
				if(inventory.getCount() < withdrawAmount) {
					System.out.println();
					System.out.println("!!! Not enough product available! !!!");
					System.out.println();
					
					//Takes back to select another product
					getSelectProduct();
				}
				//When the current balance is less than price of product
				if(currentBalance < (inventory.getPrice())) {
					System.out.println();
					System.out.println("Not Enough Funds!");
					System.out.println();
					
					//Takes back to give option to feed money
					getPurchaseMenu();
				}	
				
				//When the current balance is equal to or more than price of product 
				//AND there is enough product
				else if (inventory.getCount() >= withdrawAmount && currentBalance >= (inventory.getPrice())){ 
					

					//When product is in stock - updates current balance, updates current inventory
						double startingAmount = currentBalance;
						currentBalance -= (inventory.getPrice());
						inventory.dispenseProduct(withdrawAmount);					
						
						
						//Log each time a product is dispensed
						double initialAmount = startingAmount;
							Audit lineInAudit  = new Audit(inventory.getName(), inventory.getSlot(), initialAmount, (initialAmount - inventory.getPrice()));
							initialAmount -= inventory.getPrice();
						}	
						getPurchaseMenu();
					}
		
		
		public void getSelectProduct() throws NumberFormatException, IOException {

			
			MainMenu mainMenuObject = new MainMenu();
			mainMenuObject.displayInventory();
			System.out.println("Current Balance: $" + currentBalance);
			
			//User enters slot location
			System.out.println();
			System.out.println("Please Enter Slot Location: ");
			Scanner userInput = new Scanner(System.in);
			String userSelection = userInput.nextLine().toUpperCase();
			
			boolean goodInput = false;
			
			Vending_Machine vendingMachineObject = new Vending_Machine();
			List<Item> inventoryList = vendingMachineObject.getInventoryList();
			
			//While loop is created to get item from inventory
			while(!goodInput) {
				for(Item inventory : inventoryList) {
					
					//If slot input is correct
					if(inventory.getSlot().equals(userSelection)) {
						goodInput = true;
						goodItemSelection(inventory);
					}
				}
			//If user input is incorrect
			vendingMachineObject.incorrectInputMessage();
			getSelectProduct();
			}
		}
		//Method for purchase menu
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
				Scanner userInput = new Scanner(System.in);

				String selection = userInput.nextLine();
				
					if(selection.equals("1")) {
						
						//User inputs "1" and taken to feed money method
						goodInput = true;
						feedMoney();
					}
					//User inputs "2" and taken to select product
					else if(selection.equals("2")) {
						//select product
						getSelectProduct();
						goodInput = true;
					}
					//User enters "3" and taken to main menu
					else if(selection.equals("3")) {
						giveChange();
						goodInput = true;
						MainMenu mainMenuObject = new MainMenu();
						mainMenuObject.getMainMenu();
					}		
				}
			}
}
	
	
	

