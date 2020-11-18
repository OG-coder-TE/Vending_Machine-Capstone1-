package com.techelevator;

import java.io.IOException;

public class StartUpVendingMachine {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		
		MainMenu mainMenuObject = new MainMenu();
		
		Vending_Machine vendingMachineObject = new Vending_Machine();
		
		vendingMachineObject.welcomeMessage();
		
		
		mainMenuObject.getMainMenu();
		
		
	}

}
