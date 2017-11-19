//(Multiples) Write an application that reads two integers, determines whether the first is a
//multiple of the second and prints the result. 

package com.JavaCourse.Chapter_2;

import java.util.Scanner;

public class Task_2_26 {

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
		
		//Analize whether the first is a multiple of the second and prints the result
		if (nbr1 % nbr2 == 0) {
			System.out.println(nbr2 + " is a multiple of " + nbr1);
		} else {
			System.out.println(nbr2 + " is not a multiple of " +nbr1);
		}
		
		input.close();
	}
}