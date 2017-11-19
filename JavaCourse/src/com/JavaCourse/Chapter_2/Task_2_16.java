//2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
//them from the user and displays the larger number followed by the words "is larger". If the numbers
//are equal, print the message "These numbers are equal". 

package com.JavaCourse.Chapter_2;
import java.util.Scanner;

public class Task_2_16 {
	
	public static void main (String[] args) {
		
		//Variables declaration
		Scanner input = new Scanner(System.in);
		int nbr1,
			nbr2;
		
		//Obtain values from user input
		System.out.print("Enter the first number: ");
		nbr1  = input.nextInt();
		System.out.print("Enter the second number: ");
		nbr2  = input.nextInt();
		
		//Comparison analyses and results printing
		System.out.println("Comparison says:");
		
		if (nbr1 == nbr2) {
			System.out.println("Entered values are equal: " + nbr1);
		}

		if (nbr1 < nbr2) {
			System.out.println(nbr2 + " is larger.");
		}
		
		if (nbr1 > nbr2) {
			System.out.println(nbr1 + " is larger.");
		}
		
		//Release object after use
		input.close();
		
	}
}