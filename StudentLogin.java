package com.xworkz.methods.parameter;

public class StudentLogin {

	// this method has parameter and no return type:

	public static void studentRecord(String usn, String name) {

		String studentUsn = "1234";
		String studentName = "Sowmya D R";
		if (usn == studentUsn && name == studentName) {
			System.out.println("Student record found...");
		} else {
			System.out.println("check the usn !!! ");
		}
	}

	public static void main(String[] args) {

		String usn = "1234";
		String name = "Sowmya D R";
		StudentLogin.studentRecord(usn, name);
	}

}
