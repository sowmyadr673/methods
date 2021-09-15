package com.xworkz.methods;

import java.util.Date;

public class DisplayDate {

	public static void displayDate() {
		System.out.println(new Date());
	}

	public static void main(String[] args) {
		System.out.println("Beginning of the method");
		DisplayDate.displayDate();
		System.out.println("Ending of the method");
	}

}
