//5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.

package com.JavaCourse.Chapter_5_Task_11;
import java.util.Scanner;

public class Chapter_5_Task_11 {

	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE;
		Scanner input = new Scanner(System.in);
		Integer number;
		int i = 0, counter = 0;
		
		System.out.print("How many numbers would you like to enter: ");
		counter = input.nextInt();
		
		while (i < counter) {
			
			
			System.out.print("Enter the number: ");
			number = input.nextInt();
			
			if(number < min) {
				min = number;
			}
			
			i++;
			
		}
		
		System.out.println("The smallest value entered is \"" + min + "\"");
	
		input.close();
		System.exit(0);
		
	}
  
}
