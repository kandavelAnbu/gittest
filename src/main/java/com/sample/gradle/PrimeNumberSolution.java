package com.sample.gradle;


import java.util.Scanner;

public class PrimeNumberSolution {
	
	public boolean numberIsPrime(int n) {

		for(int i = 2; i<n; i++) {

			if ( n%i == 0) {

				return false;
			} 
			
		}
		
		return true;
	}

	 

	public static void main(String[] args) {

		PrimeNumberSolution test = new PrimeNumberSolution();

		Scanner userinput = new Scanner(System.in);

		System.out.print("Enter the number of primes to be displayed: ");

		int num = userinput.nextInt();
		
		int count = 0;

		for( int i =2; i>0; i++) {

			if (test.numberIsPrime(i) && count<num) {

				System.out.print(i +" ");
				count++;
			}
		}

	}
}
