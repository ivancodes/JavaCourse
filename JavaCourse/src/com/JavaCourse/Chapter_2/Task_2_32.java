//(Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
//and prints the number of negative numbers input, the number of positive numbers input and
//the number of zeros input.

package com.JavaCourse.Chapter_2;

import java.util.Scanner;

public class Task_2_32 {

	public static void main(String[] args) {
		
		// Variables declaration
		Scanner input = new Scanner(System.in);
		int nbr1,
			nbr2,
			nbr3,
			nbr4,
			nbr5,
			zero = 0,
			negative = 0,
			positive = 0;
		
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
		
		// Count zeros
		if (nbr1 == 0) {
			zero = zero + 1;
		}
		
		if (nbr2 == 0) {
			zero = zero + 1;
		}
		
		if (nbr3 == 0) {
			zero = zero + 1;
		}
		
		if (nbr4 == 0) {
			zero = zero + 1;
		}
		
		if (nbr5 == 0) {
			zero = zero + 1;
		}
		
		// Count positives
		if (nbr1 > 0) {
			positive = positive + 1;
		}
		
		if (nbr2 > 0) {
			positive = positive + 1;
		}
		
		if (nbr3 > 0) {
			positive = positive + 1;
		}
		
		if (nbr4 > 0) {
			positive = positive + 1;
		}
		
		if (nbr5 > 0) {
			positive = positive + 1;
		}
		
		// Count negatives
		if (nbr1 < 0) {
			negative = negative + 1;
		}
		
		if (nbr2 < 0) {
			negative = negative + 1;
		}
		
		if (nbr3 < 0) {
			negative = negative + 1;
		}
		
		if (nbr4 < 0) {
			negative = negative + 1;
		}
		
		if (nbr5 < 0) {
			negative = negative + 1;
		}
		
		// Print  results
		System.out.println();
		System.out.println("Zero numbers: " + zero);
		System.out.println("Positive numbers: " + positive);
		System.out.println("Negative numbers: " + negative);
		
		//Close used object
		input.close();
		
	}

}
