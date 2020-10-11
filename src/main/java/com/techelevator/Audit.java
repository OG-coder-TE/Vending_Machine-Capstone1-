package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Calendar;

public class Audit {
	DateFormat Date = DateFormat.getDateInstance();
	  Calendar cals = Calendar.getInstance();
	  String currentDate = Date.format(cals.getTime());
	
	protected String transactionType;
	protected String slot;
	protected String name;
	protected double startingAmount;
	protected double endingAmount;
	
	File audit = new File("Log.txt");
	
	
	public Audit() {
		
		
	}
	
	public Audit(String transactionType, double startingAmount, double endingAmount) throws IOException {
		
		this.startingAmount = startingAmount;
		this.startingAmount = startingAmount;
		this.endingAmount = endingAmount;
		
		File audit = new File("Log.txt");
		if(!audit.exists()) {
			try {audit.createNewFile();
			
			}finally {
				transactionDetails();
			}
		}
	}
	
	
	public Audit(String name, String slot, double startingAmount, double endingAmount) throws IOException {
		this.name = name;
		this.slot = slot;
		this.startingAmount = startingAmount;
		this.endingAmount = endingAmount;
		
		File audit = new File("Log.txt");
		if(!audit.exists()) {
			try {audit.createNewFile();
			
			}finally {
		
				auditDispensing();
			}
		}
	}


	

	public String getTransactionType() {
		return transactionType;
	}


	public String getSlot() {
		return slot;
	}


	public double getStartingAmount() {
		return startingAmount;
	}

	public void setStartingAmount(double startingAmount) {
		this.startingAmount = startingAmount;
	}

	public double getEndingAmount() {
		return endingAmount;
	}

	public void setEndingAmount(double endingAmount) {
		this.endingAmount = endingAmount;
	}

	



  private void transactionDetails() throws IOException {

  
  try(FileWriter fileWriter = new FileWriter("Log.txt", true);
		  PrintWriter printWriter = new PrintWriter(fileWriter)) {
		  	  printWriter.println (currentDate + " " + transactionType + "$" + startingAmount + "$" + endingAmount);

		  }
  }  
  
  private void auditDispensing() throws IOException {

	 try(FileWriter fileWriter = new FileWriter("Log.txt", true);
		 PrintWriter printWriter = new PrintWriter(fileWriter)) {
			 printWriter.println(currentDate + " " + name + " " + slot + "$" + startingAmount + "$" + endingAmount);
		 }
	 } 
	 }
  
