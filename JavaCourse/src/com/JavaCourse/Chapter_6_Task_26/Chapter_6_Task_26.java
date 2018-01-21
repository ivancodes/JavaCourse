//6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
//its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
//the method into an application that reads a value from the user and displays the result.		

package com.JavaCourse.Chapter_6_Task_26;

import java.util.Scanner;

public class Chapter_6_Task_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;

		System.out.print("Please enter the number: ");
		number = input.nextInt();

		System.out.print("The reversed  number is: " + reverseNum(number));
		input.close();
		System.exit(0);
	}

	public static int reverseNum(int number) {
		
		Integer reversed = 0;
		String rnum = "";
		
		while (number % 10 > 0) {

			int prevNum = number % 10;
			rnum = rnum + String.valueOf(prevNum);
			number = number / 10;
						
		reversed = Integer.parseInt(rnum);
		
		}
		
		return reversed;
	}

}
