//2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether
//it’s odd or even.

package com.JavaCourse.Chapter_2;

import java.util.Scanner;

public class Task_2_25 {

	public static void main(String[] args) {
		
		//Variables declaration
		Scanner input = new Scanner(System.in);
		int nbr1, nbr2;

		// Obtain user input
		System.out.print("Enter the first number: ");
		nbr1 = input.nextInt();
		System.out.print("Enter the second number: ");
		nbr2 = input.nextInt();
		
		System.out.println();
		
		//Analize whether the entered values are odd or even
		if (nbr1%2 == 0) {
			System.out.println(nbr1 + " is odd");
		} else {
			System.out.println(nbr1 + " is even");
		}
		
		if (nbr2 % 2 == 0) {
			System.out.println(nbr2 + " is odd");
		} else {
			System.out.println(nbr2 + " is even");
		}
		
		//Release the used object
		input.close();
	}

}
