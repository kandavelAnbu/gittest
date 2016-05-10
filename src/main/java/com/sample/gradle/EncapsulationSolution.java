package com.sample.gradle;


public class EncapsulationSolution {  
	
	private static String name = "kandha";  
   
	public String getName() {  
		return name;  
	}  
	
	public void setName(String name) {  
		this.name=name;  
	}    
  
	public static void main(String[] args) {  
		System.out.println("Running app");
		EncapsulationSolution ens = new EncapsulationSolution ();  
		ens.setName("vel");  
		System.out.println(ens.getName());
	}  
}