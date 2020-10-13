package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Vending_Machine  {	
	
	
	protected List<Item> inventoryList = new ArrayList<>();
	
	//vending machine constructor
	public Vending_Machine() {
		restockInventory();
	}
	
	
	
	public void welcomeMessage() throws NumberFormatException, IOException {
		System.out.println();
		System.out.println("== Welcome to Your New Favorite Vending Machine! ==");
		System.out.println("==              By Umbrella Corp                 ==");
		System.out.println();
		MainMenu mainMenuObject = new MainMenu();
		mainMenuObject.getMainMenu();
	}
		
	public void exitMessage() {
		System.out.println();
		System.out.println("== Have a good day, and remember to wear a mask and wash your hands! ==");
		System.out.println();

		System.exit(1);
	}
	
	public void incorrectInputMessage() {
		System.out.println();
		System.out.println(" !!! Invalid Entry !!!");
		System.out.println();
	}
	
	
	public boolean restockInventory() {
		File file = new File("vendingmachine.csv");
		
		try(Scanner inventoryLine = new Scanner(file)){
			
			while(inventoryLine.hasNextLine()) {
				
				String line = inventoryLine.nextLine();
				String[] pieces = line.split("\\|");
				
				String location = pieces[0];
				String name = pieces[1];
				double price = Double.parseDouble(pieces[2]);
				String type = pieces[3];
								
				
				if(type.toLowerCase().equals("chip")) {
					this.inventoryList.add(new Chip(location, name, price, type));
				}
				else if(type.toLowerCase().equals("candy")){
					this.inventoryList.add(new Candy(location, name, price, type));
				}
				else if(type.toLowerCase().equals("drink")) {
					this.inventoryList.add(new Drink(location, name, price, type));
				}
				else if(type.toLowerCase().equals("gum")) {
					this.inventoryList.add(new Gum(location, name, price, type));
				}
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("!!! File Does Not Exist! !!!");
			return false;
		}
		return true;

	}



	public List<Item> getInventoryList() {
		return inventoryList;
	}
		
	
	
	
	
	
	
}
		

