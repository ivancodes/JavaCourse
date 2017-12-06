//4.36 (Sides of a Right Triangle) Write an application that reads three nonzero integers and determines
//and prints whether they could represent the sides of a right triangle.

package com.JavaCourse.Chapter_4_Task_36;

import java.util.Scanner;

public class Chapter_4_Task_36 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		Scanner input = new Scanner(System.in);

		// Obtain user intput with checks to enter correct values
		while (a <= 0) {
			System.out.print("Please enter a non-zero, positive value for 'a': ");
			a = input.nextDouble();
		}

		while (b <= 0) {
			System.out.print("Please enter a non-zero, positive value for 'b': ");
			b = input.nextDouble();
		}

		while (c <= 0) {
			System.out.print("Please enter a non-zero, positive value for 'c': ");
			c = input.nextDouble();
		}

		// Check if entered numbers can represent a triangle
		if ((a + b) <= c || (a + c) <= b || (c + b) <= a) {

			System.out.println("\nThe entered values cannot represent the sides of a Triangle.");

		} else {

			System.out.println("\nThe entered values can represent sides of a Triangle.");

		}

		// Define the right triangle..
		if (a == b && b == c) {

			System.out.println("Moreover, this is the right triangle.");

		}

		input.close();
		System.exit(0);
	}

}
