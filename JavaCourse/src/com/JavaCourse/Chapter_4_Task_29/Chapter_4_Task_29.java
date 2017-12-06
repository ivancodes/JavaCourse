//4.29 (Square of Asterisks) Write an application that prompts the user to enter the size of the side
//of a square, then displays a hollow square of that size made of asterisks. Your program should work
//for squares of all side lengths between 1 and 20.

package com.JavaCourse.Chapter_4_Task_29;

import java.util.Scanner;

public class Chapter_4_Task_29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the square side A (1 to 20): ");
		int side = input.nextInt();
		int i = side;

		if (side > 0 && side <= 20) {
			
			System.out.println("Tribute to Malevich:");
			
			while (i > 0) {
				System.out.print("\n * ");

				int k = side;
				while (k > 1) {
					System.out.print(" * ");
					k--;
				}

				i--;

			}

			

		} else {
			System.out.println("Invalid side value entered. Please try again.");
		}
	
		input.close();
		System.exit(0);
	}
}
