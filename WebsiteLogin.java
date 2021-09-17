package com.xworkz.methods.parameter;

public class WebsiteLogin {

	public static String logIn(String userName, String password) {

		String name = "sowmya";
		String pswd = "997208";

		if (userName == name && password == pswd) {
			return "Login successfull";
		} else {
			return "Invalid username and password.";
		}

	}

	public static void main(String[] args) {

		System.out.println(WebsiteLogin.logIn("sowmya", "997208"));
	}

}
