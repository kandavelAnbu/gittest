package com.sample.gradle;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sample.gradle.PrimeNumberSolution;

import junit.framework.Assert;

public class PrimeTest {

	@Test(dataProvider = "dpPrime")
	public void testPrime(int input) {
		
		try {
			
			PrimeNumberSolution ps = new PrimeNumberSolution();
			boolean actual = ps.numberIsPrime(input);
			Assert.assertEquals(actual, true);
		} catch(Exception e) {
			System.out.println("Enter the valid number");
		}
	}
	
	@DataProvider
	public Object[][] dpPrime() {
		return new Object[][] {
			new Object[] {2}
		};
	}
	
}
