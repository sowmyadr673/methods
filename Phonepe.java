package com.xworkz.methods.parameter;

public class Phonepe {

	public static String DTHRecharge(String selectProvider, int subno, int amount) {
		return "your " + selectProvider + " subscriber number:" + subno + " is ruppes " + amount
				+ " recharged successfully";
	}

	public static String transferMoney(long Accountno, String IFSCcode) {
		return "transaction is successful to the account " + Accountno;
	}

	public static String donate(String NGO) {
		return "your donation for the " + NGO + " is successful";
	}

	public static String redBus(String fromlocation, String tolocation, int amount, int seatno) {
		return "The redbus " + fromlocation + " to " + tolocation + " for the seat number " + seatno
				+ " is booked successfully for RS " + amount;
	}

	public static String checkBankBalance(long UPIAccount, int amount) {
		return "your balance fetched successfully.account balance is " + amount;
	}

	public static String FASTagRecharge(String FastagBank, String vehicleno) {
		return "your " + FastagBank + " recharge " + vehicleno + " is successful";
	}

	public static void main(String[] args) {

		String dthrecharge = Phonepe.DTHRecharge("dish Tv", 342768904, 398);
		System.out.println(dthrecharge);
		System.out.println();

		String moneytransfer = Phonepe.transferMoney(123457889, "bobryhuvb");
		System.out.println(moneytransfer);
		System.out.println();

		String donates = Phonepe.donate("Child welfare");
		System.out.println(donates);
		System.out.println();

		String redbusbook = Phonepe.redBus("Bangalore", "chennai", 800, 2);
		System.out.println(redbusbook);
		System.out.println();

		String bankbalance = Phonepe.checkBankBalance(235656567, 10000);
		System.out.println(bankbalance);
		System.out.println();

		String Fastagrecharge = Phonepe.FASTagRecharge("AXIS Bank FASTag", "KA02AG9866");
		System.out.println(Fastagrecharge);
		System.out.println();

	}

}
