

import java.util.Scanner;

public class FactorialSolution {
	
	public int fact(int n) {

		if (n==1) {

			return n;
		} else {

			n = n * fact(n-1);

			return n;
		}

	}
	
//	public static void main(String[] args) {
//
//		FactorialSolution test = new FactorialSolution ();
//		
//		Scanner userinput = new Scanner(System.in);
//
//		System.out.print("Enter the number to find factorial: ");
//
//		int num = userinput.nextInt();
//
//		System.out.println("The factorial of " +num+" is: "+test.fact(num));
//
//	}

}
