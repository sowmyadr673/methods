package com.xworkz.methods;

public class TollGate {

	public static void collectMoney() {
		System.out.println("money paid is successful");
	}

	public static void gateOpen() {
		System.out.println("open the gate");
	}

	public static void gateClose() {
		System.out.println("close the gate");
	}

	public static void main(String[] args) {

		System.out.println("Arrived at toll gate");
		TollGate.collectMoney();
		TollGate.gateOpen();
		System.out.println("Exit the gate");
		TollGate.gateClose();
	}

}
