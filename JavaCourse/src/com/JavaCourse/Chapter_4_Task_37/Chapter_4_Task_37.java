//4.37 (Factorial) The factorial of a nonnegative integer n is written as n! 
//a) Write an application that reads a nonnegative integer and computes and prints its factorial.?
//b) Write an application that estimates the value of the mathematical constant e by using
//	 the following formula. Allow the user to enter the number of terms to calculate.
//c) Write an application that computes the value of e pow(x) by using the following formula. Allow
//the user to enter the number of terms to calculate.

package com.JavaCourse.Chapter_4_Task_37;

import java.util.Scanner;

public class Chapter_4_Task_37 {

	// Put Factorial calcualtion into a separate method body to make it reusable
	public static int CountFactorial(int number) {
		int factorial = 1, count = 1;
		while (count <= number) {

			factorial *= count;
			count++;

		}
		return factorial;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 0;

		// TASK A - Factorials

		System.out.println(" >> Task A - calculating the Factorial << ");
		while (number <= 0) {
			System.out.print("Enter the positive non-zero number: ");
			number = input.nextInt();
		}

		// Return calculated result
		System.out.print("Factorial = " + CountFactorial(number));

		// TASK B - CONSTANT E

		System.out.println("\n\n >> Task B - calculating the constant \"E\" << ");

		number = 0;
		while (number <= 0) {
			System.out.print("Enter the positive non-zero number: ");
			number = input.nextInt();
		}

		int count = 1;
		double eConst = 1;
		while (count < number) {
			eConst += (double) 1 / CountFactorial(count++);

		}

		System.out.print("The estimated constant  value: " + eConst);

		
		// TASK C = CONSTANT E POWERED BY X

		System.out.println("\n\n >> Task C - calculating the constant \"E\" powered by X << ");
		number = 0;
		int x = 0;
		while (number <= 0 && x <= 0) {
			System.out.print("Enter the positive non-zero number of calculation depth: ");
			number = input.nextInt();
			System.out.print("Enter the positive non-zero X-power number: ");
			x = input.nextInt();
		}
		
		count = 1;
		eConst = 1;
		
		while (count < number) {
			eConst += (double) Math.pow(x++, count) / CountFactorial(count++);
			
		}
		System.out.print("The E constant powered by X: " + Math.pow(eConst, x));

		input.close();
		System.exit(0);
	}

}
