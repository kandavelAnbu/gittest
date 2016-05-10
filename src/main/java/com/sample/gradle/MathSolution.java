package com.sample.gradle;


import java.util.Scanner;

public class MathSolution {

	public int Add (int num1, int num2) {
		
		return num1 + num2;
	}
	
	public int Sub (int num1, int num2) {
		
		return num1 - num2;
	}
	
	public int Multi (int num1, int num2) {
		
		return num1 * num2;
	}
	
	public int Divide (int num1, int num2) {
		return num1 / num2;
	}
	
//	public static void main(String[] args) {
//		
//		MathSolution math = new MathSolution();
//		
//		Scanner userinput = new Scanner (System.in);
//		System.out.println("MathsCalculation");
//		System.out.println("Enter the first input");
//		
//		int num1 = userinput.nextInt();
//		
//		System.out.println("Enter the second input");
//		
//		int num2 = userinput.nextInt();
//		
//		System.out.println("Enter the operation to be perform (+,-,*,/):");
//		
//		String operation = userinput.next();
//		
//		if (operation.equals("+")) {
//			
//			System.out.println(math.Add(num1 , num2));
//		
//		} else if (operation.equals("-")) {
//			
//			System.out.println(math.Sub(num1 , num2));
//		
//		} else if (operation.equals("*")) {
//			
//			System.out.println(math.Multi(num1 , num2));
//		
//		} else if (operation.equals("/")) {
//			
//			System.out.println(math.Divide(num1 , num2));
//		
//		} else {
//			
//			System.out.println("Enter the valid operation");
//		}
//		
//	}
}
