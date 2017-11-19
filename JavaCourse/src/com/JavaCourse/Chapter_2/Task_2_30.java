//2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting
//of five digits from the user, separates the number into its individual digits and prints the digits
//separated from one another by three spaces each. For example, if the user types in the number 42339,
//the program should print
//Assume that the user enters the correct number of digits. What happens when you enter a
//number with more than five digits? What happens when you enter a number with fewer than five
//digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
//need to use both division and remainder operations to “pick off” each digit.]

package com.JavaCourse.Chapter_2;

import java.util.Scanner;

public class Task_2_30 {

	public static void main(String[] args) {

		// Variables declaration
		Scanner input = new Scanner(System.in);
		int nbr, d1, d2, d3, d4, d5;

		// Obtain user input
		System.out.print("Please enter a five digit number: ");
		nbr = input.nextInt();

		// Verify if entered number meets condition to be a five digit number
		if (nbr < 10000) {

			System.out.println("The number is less than five digits. Please try again.");

		} else if (nbr > 99999) {

			System.out.println("The number is greater than five digits. Please try again.");

		} else {
			
			// Once the condition is met, slice the number to digits and print results

			d1 = nbr % 10;
			nbr = nbr/10;
			d2 = nbr % 10;
			nbr = nbr/10;
			d3 = nbr % 10;
			nbr = nbr/10;
			d4 = nbr % 10;
			nbr = nbr/10;
			d5 = nbr % 10;

			System.out.printf("%d%n%d%n%d%n%d%n%d%n", d1, d2, d3, d4, d5);
			System.out.println("The sum of digits is: " + (d1 + d2 + d3 + d4 + d5));

		}
		
		// Release the used object
		input.close();

	}

}
