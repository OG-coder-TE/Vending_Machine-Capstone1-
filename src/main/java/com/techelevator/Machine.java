package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Machine {
	
	static Scanner input = new Scanner(System.in);
<<<<<<< HEAD

	public static void main(String[] args) throws FileNotFoundException {
		Display myDisplay = new Display();
		
		myDisplay.getMainMenu();
=======
	
	
	public static void main(String[] args) throws FileNotFoundException {
	
		Inventory inventoryObject = new Inventory();
		
		
		
		MainMenu main = new MainMenu();

		
		System.out.println("Welcome to The Supreme Vending Machine!!!");
		System.out.println();
>>>>>>> 1e75147a3308c85518460d01dc5d8fdf88a333f5
				
		main.getMainMenu();
		
		inventoryObject.createInventory().get(info[0]);
		
		
		
		
		
		
		
		
		
		
	}
	
	

	}

