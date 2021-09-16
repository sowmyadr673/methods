package com.xworkz.methods.parameter;

public class LinkedInLogin {

	// this method paramter with no return type

	public static void linkedInLogin(String email, String pswd) {

		String emailLogin = "sowmya@gmail.com";
		String password = "sowmya@password";
		if (email == emailLogin && password == pswd) {
			System.out.println("successfull logged into linkedin");
		} else {
			System.out.println("incorrect email and password");
		}

	}

	public static void main(String[] args) {

		String email = "sowmya@gmail.com";
		String password = "sowmya@password";
		LinkedInLogin.linkedInLogin(email, password);
	}

}
