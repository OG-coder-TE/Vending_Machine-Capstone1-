package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
	
	private String userChoice = "";
	private Scanner inputUser = new Scanner(System.in);
	
	private Map<String, Product> inventoryMap;
	private File log;
	
	public MainMenu(Map<String, Product> data, File logFile) {
		this.inventoryMap = data;
		this.log = logFile;
	}

	
	
	
	//Methods
	public void getMainMenu(){
		
		System.out.println("(1) Display Vending Machine Item");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		
		System.out.println("Please, choose what you would like to do!");
		userChoice = inputUser.nextLine();
		
		
	
	}

	
		
		
	}
	