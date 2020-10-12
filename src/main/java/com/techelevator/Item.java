package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {

	
//Instance Variables
private int count = 5;
private String slot;
private String name;
private double price;
private String type;

//Constructor

public Item(String slot, String name, double price, String type) {
	this.slot = slot;
	this.name = name;
	this.price = price;
	this.type = type;
}	


//Methods
public int dispenseProduct(int withdrawAmount) {
	withdrawAmount = 1;	
	
	count = count - withdrawAmount;
		
		
		System.out.println(name + " $" + price);
		
		getMessage();
		return count;
}


//Method for Subclasses
public void getMessage() {
	
}

//Getters & Setters

public int getCount() {
	return count;
}
public String getSlot() {
	return slot;
}
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public String getType() {
	return type;
}

	
}
