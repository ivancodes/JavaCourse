package com.JavaCourse.Chapter_4_Task_21;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		int max = 0;
		int current = 0;
		int i = 1;
		
		Scanner input = new Scanner(System.in);

		while(i < 10){
			
			System.out.print("Enter the value: ");
			current = input.nextInt();
			
			if(current >= max){
			max = current;
			}	
			
			i++;
			}
		
		System.out.println("The max value entered is " + max);
		
		input.close();
		System.exit(0);
	}

}
