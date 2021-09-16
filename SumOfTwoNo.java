package com.xworkz.methods.parameter;

public class SumOfTwoNo {

	// This method has parameter with return type:

	public static int sum(int num) {
		return num + num;
	}

	public static void main(String[] args) {

		int result;
		result = sum(4);
		System.out.println("sum of two numbers is:" + result);
	}

}
