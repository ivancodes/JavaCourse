//6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
//hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//for each customer who parked in the garage yesterday. You should enter the hours parked for each
//customer. The program should display the charge for the current customer and should calculate and
//display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
//the charge for each customer. 

package com.JavaCourse.Chapter_6_Task_08;

import java.util.Scanner;

public class Chapter_6_Task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		double hrsParked = 0;

		Scanner input = new Scanner(System.in);
		
		// A couple of pre-defined clients
		Client client1 = new Client("Vasya", 3);
		Client client2 = new Client("Petya", 15);

		// Some manual input data
		System.out.println("Please enter the Client data");
		System.out.print("Name: ");
		name = input.nextLine();
		
		// Small validation to enter correct data
		while (hrsParked <= 0 || hrsParked > 24) {
			System.out.print("Hours spent on parking (1-24): ");
			hrsParked = input.nextDouble();
		}

		Client client3 = new Client(name, hrsParked);

		// Printing results
		System.out.printf("%nClient #1 data: %n%s has parked for %.1f hrs and was charged $%.2f%n", client1.getName(),
				client1.getHrsParked(), client1.getCharge());
		System.out.printf("%nClient #2 data: %n%s has parked for %.1f hrs and was charged $%.2f%n", client2.getName(),
				client2.getHrsParked(), client2.getCharge());
		System.out.printf("%nClient #3 data: %n%s has parked for %.1f hrs and was charged $%.2f%n", client3.getName(),
				client3.getHrsParked(), client3.getCharge());

		// Some housekeeping
		input.close();
		System.exit(0);

	}

}
