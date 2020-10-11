package com.techelevator;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class PurchaseMenu {
	
	private String userChoice = "";
	private String itemChoice = "";
	private Scanner userInput = new Scanner(System.in);
	public int inputTotalMoney = 0;
	private Map<String, Product> inventoryMap;
	private File log;
	
	
	public PurchaseMenu(Map<String, Product> data, File logFile) {
		this.inventoryMap = data;
		this.log = logFile;
	}
	
	public void displayMenu() {
		System.out.println("Purchase Menu");
		System.out.println();
		System.out.println("[1] Feed Money");
		System.out.println("[2] Select Product");
		System.out.println("[3] Finish Transaction");
		
	
	}
	
	public void getInput() {
		
		System.out.println("Choose what you would like to do ");
		userChoice = userInput.nextLine();
		System.out.println();
		
		while(!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.contentEquals("5")) {
			System.out.println("Please choose [1], [2] or [3]");
			userChoice = userInput.nextLine();
			
		}
			
	} public void userInput() {
		if(userChoice.contentEquals("1")) {
			System.out.println("Add money");
			userChoice = userInput.nextLine();
			while(!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.contentEquals("5")) {
				System.out.println("Please add money. Or type [3] to go back");
				userChoice = userInput.nextLine();
			}
		}
	}
	
	
	
	
	
}