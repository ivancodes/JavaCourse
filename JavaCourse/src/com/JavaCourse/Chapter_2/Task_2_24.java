//2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
//and prints the largest and smallest integers in the group. Use only the programming techniques you
//learned in this chapter.

package com.JavaCourse.Chapter_2;

import java.util.Scanner;

public class Task_2_24 {

	public static void main(String[] args) {
		// Variables declaration

		Scanner input = new Scanner(System.in);

		int nbr1, nbr2, nbr3, nbr4, nbr5;

		// Obtain user input
		System.out.print("Enter the first number: ");
		nbr1 = input.nextInt();
		System.out.print("Enter the second number: ");
		nbr2 = input.nextInt();
		System.out.print("Enter the third number: ");
		nbr3 = input.nextInt();
		System.out.print("Enter the fourth number: ");
		nbr4 = input.nextInt();
		System.out.print("Enter the fifth number: ");
		nbr5 = input.nextInt();

		System.out.println();
		
		// Analize the comparison and print the largest & smallest values
		if (nbr1 > nbr2 & nbr1 > nbr3 & nbr1 > nbr4 & nbr1 > nbr5) {
			System.out.println(nbr1 + " is the largest.");
		}

		if (nbr2 > nbr1 & nbr2 > nbr3 & nbr2 > nbr4 & nbr2 > nbr5) {
			System.out.println(nbr2 + " is the largest.");
		}

		if (nbr3 > nbr1 & nbr3 > nbr2 & nbr3 > nbr4 & nbr3 > nbr5) {
			System.out.println(nbr3 + " is the largest.");
		}

		if (nbr4 > nbr1 & nbr4 > nbr2 & nbr4 > nbr3 & nbr4 > nbr5) {
			System.out.println(nbr4 + " is the largest.");
		}
		
		if (nbr5 > nbr1 & nbr5 > nbr2 & nbr5 > nbr3 & nbr5 > nbr4) {
			System.out.println(nbr5 + " is the largest.");
		}

		if (nbr1 < nbr2 & nbr1 < nbr3 & nbr1 < nbr4 & nbr1 < nbr5) {
			System.out.println(nbr1 + " is the smallest.");
		}

		if (nbr2 < nbr1 & nbr2 < nbr3 & nbr2 < nbr4 & nbr2 < nbr5) {
			System.out.println(nbr2 + " is the smallest.");
		}

		if (nbr3 < nbr1 & nbr3 < nbr2 & nbr3 < nbr4 & nbr3 < nbr5) {
			System.out.println(nbr3 + " is the smallest.");
		}

		if (nbr4 < nbr1 & nbr4 < nbr2 & nbr4 < nbr3 & nbr4 < nbr5) {
			System.out.println(nbr4 + " is the smallest.");
		}
		
		if (nbr5 < nbr1 & nbr5 < nbr2 & nbr5 < nbr3 & nbr5 < nbr4) {
			System.out.println(nbr5 + " is the smallest.");
		}
		
		//Release the used object
		input.close();
	}

}
