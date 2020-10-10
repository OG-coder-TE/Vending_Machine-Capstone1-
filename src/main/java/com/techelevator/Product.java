package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Product {
	
	private String name;
	private String price;
	private int money;
	
	public Product (String name, String price, int money) {
		this.name = name;
		this.price = price;
		this.money = money;
	}
	String path = "vendingmachine.csv";
	File inputFile = new File(path);
	String locationsName = "";
	int cost = 0;
	
	

	
	
	

	
	
	
	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public int getMoney() {
		return money;
	}
	
	
	
	
	
	
	
}