package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Product {
	
	private int Inventory = 5;
	private String item;
	private double price;
	private String productType;
	private String itemKey;
	private String itemMessage;
	
	public Product(String[] productInfo) {
		this.itemKey = productInfo[0];
		this.productType = productInfo[1];
		this.price = Double.parseDouble(productInfo[2]);
		this.productType = productInfo[3];
		this.itemMessage = productInfo[4];
	}
	

	
	
	
	public int getInventory() {
		return Inventory;
	}




	public String getItem() {
		return item;
	}




	public String getProductType() {
		return productType;
	}



	public String getItemKey() {
		return itemKey;
	}




	public String getItemMessage() {
		return itemMessage;
	}

	public double getPrice() {
	return price;
	}











	
	
	
	
}