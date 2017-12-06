//4.30 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
//For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
//If the number is not five digits long, display an error message and allow the user to enter
//a new value. 

package com.JavaCourse.Chapter_4_Task_30;

import java.util.Scanner;

public class Chapter_4_Task_30 {

	public static void main(String[] args) {
		int number, d1, d2, d3, d4, d5;
		Scanner input = new Scanner(System.in);

		// Start app

		number = 0;

		while (number < 10000 || number > 99999) {

			System.out.print("\n Please enter a valid five-digit number: ");
			number = input.nextInt();

		}

		// Split the number into digits

		int nbr = number;
		d1 = nbr % 10;
		nbr = nbr / 10;
		d2 = nbr % 10;
		nbr = nbr / 10;
		d3 = nbr % 10;
		nbr = nbr / 10;
		d4 = nbr % 10;
		nbr = nbr / 10;
		d5 = nbr % 10;

		// Identify a palendrome

		if ((d1 == d5 && d2 == d4) || (d1 == d2 && d2 == d3 && d3 == d4 && d4 == d5)) {
			System.out.println("\nThe number \"" + number + "\" is a palindrome");
		} else {
			System.out.println("\nThe number \"" + number + "\" is not a palindrome");
		}

		input.close();
		System.exit(0);
	}

}
