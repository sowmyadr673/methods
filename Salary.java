package com.xworkz.methods.parameter;

public class Salary {
	// This method has parameter with return type:

	public static int totalSalary(int PF, int ESI, int GrossSalary) {

		int totalsalary = PF + ESI + GrossSalary;
		return totalsalary;
	}

	public static void main(String[] args) {

		int PF = 1200;
		int ESI = 1500;
		int GrossSalary = 20000;
		int totalsalary = Salary.totalSalary(PF, ESI, GrossSalary);
		System.out.println("the total salary is:" + totalsalary);
	}

}
