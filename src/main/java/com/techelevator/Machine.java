package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Machine {
	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) throws FileNotFoundException {
	
		Inventory inventoryObject = new Inventory();
		
		
		
		MainMenu main = new MainMenu();

		
		System.out.println("Welcome to The Supreme Vending Machine!!!");
		System.out.println();
				
		main.getMainMenu();
		
		inventoryObject.createInventory().get(info[0]);
		
		
		
		
		
		
		
		
		
		
	}
	
	

	}

