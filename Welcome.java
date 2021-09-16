package com.xworkz.methods.parameter;

public class Welcome {

	// This method has no parameter with return type:

	public static String greet() {
		
		return "welcome to java";
	}

	public static void main(String[] args) {
		
		String greetings = Welcome.greet();
		System.out.println(greetings);
	}
}
