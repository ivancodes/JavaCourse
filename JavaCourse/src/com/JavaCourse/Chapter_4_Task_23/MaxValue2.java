package com.JavaCourse.Chapter_4_Task_23;

import java.util.Scanner;

public class MaxValue2 {

	public static void main(String[] args) {
		int max = 0;
		int max2 = 0;
		int current = 0;
		int i = 0;

		Scanner input = new Scanner(System.in);

		while (i < 10) {

			System.out.print("Enter the value: ");
			current = input.nextInt();

			if (current > max) {
				max2 = max;
				max = current;
			} 
			
			else if (current > max2) {
				max2 = current;
			}

			i++;
		}

		System.out.println("The first max value entered is " + max);
		System.out.println("The second max value entered is " + max2);

		input.close();
		System.exit(0);

	}

}
