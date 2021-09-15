package com.xworkz.methods;

public class PhonePay {
	public static void moneyTransfer() {
		System.out.println("money transferred successfully");
	}

	public static void electricityBill() {
		System.out.println("electricity bill paid.....");
	}

	public static void dthBill() {
		System.out.println("DTH bill paid....");
	}

	public static void homeLoan() {
		System.out.println("your loan is cleared...");
	}

	public static void rechargeMobile() {
		System.out.println("mobile recharged successfully");
	}

	public static void main(String[] args) {
		System.out.println("Login into Phonepay");
		PhonePay.moneyTransfer();
		PhonePay.electricityBill();
		PhonePay.dthBill();
		PhonePay.homeLoan();
		PhonePay.rechargeMobile();
		System.out.println("Logout into Phonepay");
	}

}
