package com.techelevator;

import org.junit.Assert;

import org.junit.Test;

public class CurrencyTest {

	//Test Cases: input = 5; input = 0; input = 9; input = -2;
	
	
	
	@Test
	
	public void testing_currency_with_5_returns_5() {
	
	Currency input = new Currency(0, 0, 0, 0, 0);
	
	int output = input.feedMoney(5);
	
	
	Assert.assertEquals(5, output);
	}
	
@Test
	
	public void testing_currency_with_0_returns_0() {
	
	Currency input = new Currency(0, 0, 0, 0, 0);
	
	int output = input.feedMoney(0);

	Assert.assertEquals(0, output);
	}

@Test

public void testing_currency_with_9_returns_0() {

Currency input = new Currency(0, 0, 0, 0, 0);

int output = input.feedMoney(9);

Assert.assertEquals(0, output);
}

@Test

public void testing_currency_with_negative_2_returns_0() {

Currency input = new Currency(0, 0, 0, 0, 0);

int output = input.feedMoney(-2);

Assert.assertEquals(0, output);
}


	
}
