package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Calendar;

public class Audit {
	
	protected String transactionType;
	protected String slot;
	protected String name;
	protected double amountStart;
	protected double amountEnd;
	
	File audit = new File("Log.txt");
	
	
	public Audit() {
		
		
	}
	
	public Audit(String name, String slot, double amountStart, double amountEnd) {
		this.name = name;
		this.slot = slot;
		this.amountStart = amountStart;
		this.amountEnd = amountEnd;
		
	}
	
	
	public Audit(String transactionType, double amountStart, double amountEnd) throws IOException{
		this.amountStart = amountStart;
		this.amountEnd = amountEnd;
		
		File audit = new File("Log.txt");
		if(!audit.exists()) {
			try {audit.createNewFile();
			
			}finally {
		
		transactionDetails();
			}
		}
	}


	

	public String getTransactionType() {
		return transactionType;
	}


	public String getSlot() {
		return slot;
	}


	public double getAmountStart() {
		return amountStart;
	}

	public void setAmountStart(double amountStart) {
		this.amountStart = amountStart;
	}

	public double getAmountEnd() {
		return amountEnd;
	}

	public void setAmountEnd(double amountEnd) {
		this.amountEnd = amountEnd;
	}

	



  private void transactionDetails() throws IOException {

  DateFormat Date = DateFormat.getDateInstance();
  Calendar cals = Calendar.getInstance();
  String currentDate = Date.format(cals.getTime());
  
  try(FileWriter fileWriter = new FileWriter("Log.txt", true);
		  PrintWriter printWriter = new PrintWriter(fileWriter)) {
		  	  printWriter.println (currentDate + " " + transactionType + "$" + amountStart + "$" + amountEnd);

		  }
  }  
	
	
	
	
	
	
	
	}




