//6.22 (Temperature Conversions) Implement the following integer methods:
//a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
//calculation
//celsius = 5.0 / 9.0 * (fahrenheit - 32);
//b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
//the calculation
//fahrenheit = 9.0 / 5.0 * celsius + 32;
//c) Use the methods from parts (a) and (b) to write an application that enables the user either
//to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
//Celsius temperature and display the Fahrenheit equivalent.

package com.JavaCourse.Chapter_6_Task_22;
import java.util.Scanner;

public class Chapter_6_Task_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int c, f, selection;
		
		System.out.println("Choose conversion:\n1) Fahrenheit to Celsius\n2) Celsius to Fahrenheit");
		System.out.print("\nEnter selection (1 or 2): ");
		selection = input.nextInt();
		
		switch (selection){
			case 1: 
				System.out.print("Enter the temperature in Fahrenheit: ");
				f = input.nextInt();
				System.out.printf("%nThe %d degrees in Fahrenheit means %.2f degrees in Celsius", f, convertFtoC(f));
				break;
			case 2:
				System.out.print("Enter the temperature in Celsius: ");
				c = input.nextInt();
				System.out.printf("%nThe %d degrees in Celsius means %.2f degrees in Fahrenheit", c, convertCtoF(c));
				break;
			default:
				System.out.println("Invalid Selection. Please try again.");
				break;
		}
		
		input.close();
		System.exit(0);
		
	}
	
	public static double convertFtoC(int f) {
		double c = 5.0 / 9.0 * (f - 32);
		return c;
	}
	
	public static double convertCtoF(int c) {
		double f = 9.0 / 5.0 * c + 32;
		return f;
	}

}
