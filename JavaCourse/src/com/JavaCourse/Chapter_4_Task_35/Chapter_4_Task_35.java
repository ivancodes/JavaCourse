//4.35 (Sides of a Triangle) Write an application that reads three nonzero values entered by the
//user and determines and prints whether they could represent the sides of a triangle.

package com.JavaCourse.Chapter_4_Task_35;

import java.util.Scanner;

public class Chapter_4_Task_35 {

	public static void main(String[] args) {
		double a=0,
			   b=0,
			   c=0;
		Scanner input =  new Scanner(System.in);
		
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
		
		
		if ((a + b)<= c || (a + c)<= b || (c + b)<= a) {
			
			System.out.println("\nThe entered values cannot represent the sides of a Triangle.");
						
		} else {
			
			System.out.println("\nThe entered values can represent sides of a Triangle.");
			
		}
		
		
		
		input.close();
		System.exit(0);
	}

}
