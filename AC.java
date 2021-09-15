package com.xworkz.methods;

public class AC {

	public static void on() {
		System.out.println("AC is ON");
	}

	public static void increaseTemperature() {
		System.out.println("increase the AC temperature");
	}

	public static void decreaseTemperature() {
		System.out.println("decrease the AC temperature");
	}

	public static void off() {
		System.out.println("AC is OFF");
	}

	public static void main(String[] args) {

		AC.on();
		AC.increaseTemperature();
		AC.decreaseTemperature();
		AC.off();
	}

}
