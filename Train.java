package com.xworkz.methods.parameter;

public class Train {

	public static String trainInfo(int trainno, String arrivaltime) {

		return "the thirupathi express train number: " + trainno + " arrived at " + arrivaltime;
	}

	public static String trainBooking(int seatno, String name, String coach) {

		return name + " your ticket is booked for the seat number:" + seatno + " and the coach:" + coach
				+ " booked successfully";
	}

	public static void main(String[] args) {

		String train = Train.trainInfo(3456, "4.30AM");
		System.out.println(train);
		String ticketbooking = Train.trainBooking(123, "darshan", "s2");
		System.out.println(ticketbooking);
	}

}
