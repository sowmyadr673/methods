package com.xworkz.methods;

public class Phone {

	public static void call() {
		System.out.println("you have 1 missed call");
	}

	public static void message() {
		System.out.println("you have 2 unread messages");
	}

	public static void music() {
		System.out.println("you can listen the songs");
	}

	public static void phonePay() {
		System.out.println(" Pay whenever you like, wherever you like");
	}

	public static void download() {
		System.out.println("Download is successful");
	}

	public static void main(String[] args) {

		Phone.call();
		Phone.message();
		Phone.music();
		Phone.phonePay();
		Phone.download();
	}

}
