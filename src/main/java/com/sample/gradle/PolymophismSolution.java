package com.sample.gradle;


class Animal {  
	 
	 void eat() {
		 System.out.println("animal is eating...");
	 }  
}  
  
class Dog extends Animal {  

	void eat() {
		System.out.println("dog is eating...");
	}  
}  
  
class polymorphsimSolution extends Dog {  
	
	public static void main(String[] args) {  
		Animal a = new polymorphsimSolution();  
		a.eat();  
	}
}  

