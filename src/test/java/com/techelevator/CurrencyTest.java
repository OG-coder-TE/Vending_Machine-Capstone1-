package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class CurrencyTest {

	//Test Cases: input = 5; input = 0; input = 9; input = -2;
	
	
	
	@Test
	
	public String testing_return_change_with_two_dollars_seventyfive_cents() {
	
	Currency input = new Currency();
	
	String output = input.createChange(2.75);
	
	
	Assert.assertEquals(5, output);
	}
	

	
}
