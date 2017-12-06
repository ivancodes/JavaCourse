//4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print the
//combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//data from the user.


package com.JavaCourse.Chapter_4_Task_17;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		
		int km = 0, 
			liters = 0, 
			trips = 0;
		double	total = 0.0;
		Scanner input = new Scanner(System.in);
				
		System.out.println("----- MILEAGE STATS ----");
		
		System.out.print("Have you  had a trip? (y/n) ");
		String sentinel = input.next();
		
		while (sentinel.equals("y")) {
				
			System.out.print("\nEnter km driven: ");
			km = input.nextInt();
			System.out.print("Enter gas liters used: ");
			liters = input.nextInt();
					
			trips++;
			total = (double)km/liters;
			
			System.out.print("\nHad another trip? y/n: ");
			sentinel = input.next();
		}
		
		System.out.println("\n---- TOTALS ----");
		if (trips > 0) {
		total = total/trips;
		System.out.print("The average gas usage is (km per liter): " + total);
		
		} else {
			System.out.print("No gas has been used since there are no trips.");
		}
		
		input.close();

	}

}
