package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Audit {
	
	
	protected String transactionType;
	protected String slot;
	protected String name;
	protected double startingAmount;
	protected double endingAmount;
	
	File audit = new File("Log.txt");
	
	

	public Audit(String transactionType, double startingAmount, double endingAmount) throws IOException {
		
		this.transactionType = transactionType;
		this.startingAmount = startingAmount;
		this.endingAmount = endingAmount;
		
		File audit = new File("Log.txt");
		if(!audit.exists()) {
			try {audit.createNewFile();
			
			} catch (IOException e) {
				
			}
		}
		transactionDetails();

	}
	
	
	public Audit(String name, String slot, double startingAmount, double endingAmount) throws IOException {
		this.name = name;
		this.slot = slot;
		this.startingAmount = startingAmount;
		this.endingAmount = endingAmount;
		
		File audit = new File("Log.txt");
		if(!audit.exists()) {
			try {audit.createNewFile();
			
			} catch(IOException e) {
				
			}
		
			
		}
		auditDispensing();
		
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
	  
	  Date dNow = new Date();
	    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

  
  try(FileWriter fileWriter = new FileWriter("Log.txt", true);
		  PrintWriter printWriter = new PrintWriter(fileWriter)) {
		  	  printWriter.println (ft.format(dNow) + " "  + transactionType + " " + "$" + startingAmount + " " + "$" + endingAmount);

		  }
  }  
  
  private void auditDispensing() throws IOException {
	  
	  Date dNow = new Date();
	    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	 try(FileWriter fileWriter = new FileWriter("Log.txt", true);
		 PrintWriter printWriter = new PrintWriter(fileWriter)) {
			 printWriter.println(ft.format(dNow) + " " + name + " " + slot + " " + "$" + startingAmount + " " + "$" + endingAmount);
		 }
	 } 
	 }
  
