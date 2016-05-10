package com.sample.gradle;


class Employee {
	float salary = 4000;
}
	
public class Programmer extends Employee { 
	int bonus = 10000;

	public static void main(String[] args) {
		
		Programmer inherit = new Programmer();
		System.out.println("Salary is given by :" + inherit.salary);
		System.out.println("bonus is given by :"  + inherit.bonus);
		
	}
}


