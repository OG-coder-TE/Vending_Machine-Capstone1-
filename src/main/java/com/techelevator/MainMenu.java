package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
	
	
	
	
	}
<<<<<<< HEAD
=======




	//Methods
	public void getMainMenu(){
			
		System.out.println("(1) Display Vending Machine Item");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		
		System.out.println("Please, choose what you would like to do!");
		userChoice = inputUser.nextLine();
		
		if(userChoice.equals("1")) {
			Map<String, Product> inventoryObject = Inventory.getInventoryMap();
			System.out.println(inventoryObject);
			System.out.println();
			getMainMenu();
		}
			
		if(userChoice.contentEquals("2")) {
				
				System.out.println();
				System.out.println("Great! What's next?");
				purchaseMenuObject.displayMenu();
		
			}
		
		if(userChoice.contentEquals("3")) {
			System.out.println("Goodbye!");
			System.exit(1);
		}
	}
	
	}

	
		
		
<<<<<<< HEAD
	}
=======
	
				
	
	
>>>>>>> 1e75147a3308c85518460d01dc5d8fdf88a333f5
>>>>>>> 810abaeb121dd156b8f908e32499ebd1cacb46af
	