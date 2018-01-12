//5.16 (Bar Chart Printing Program) One interesting application of computers is to display
//graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//number that’s read, your program should display the same number of adjacent asterisks. For example,
//if your program reads the number 7, it should display *******. Display the bars of asterisks after
//you read all five numbers.

package com.JavaCourse.Chapter_5_Task_16;
import java.util.Scanner;

public class Chapter_5_Task_16 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, num5;
		Scanner input = new Scanner (System.in);
		
		//Obtain and validate user input
		System.out.println("BAR CHART DEMO\n\nPlease enter the numbers between 1 and 30 below:\n");
		System.out.print("First number: ");
		
		num1 = input.nextInt();
		while (num1<0 || num1>30) {
			System.out.println("Please enter the valid number 1:");
			num1 = input.nextInt();
		}
		
		System.out.print("Second number: ");
		num2 = input.nextInt();
		while (num2<0 || num2>30) {
			System.out.println("Please enter the valid number 2:");
			num2 = input.nextInt();
		}
		
		System.out.print("Third number: ");
		num3 = input.nextInt();
		while (num3<0 || num3>30) {
			System.out.println("Please enter the valid number 3:");
			num3 = input.nextInt();
		}
		
		System.out.print("Fourth number: ");
		num4 = input.nextInt();
		while (num4<0 || num4>30) {
			System.out.println("Please enter the valid number 4:");
			num4 = input.nextInt();
		}
		
		System.out.print("Fifth number: ");
		num5 = input.nextInt();
		while (num5<0 || num5>30) {
			System.out.println("Please enter the valid number 5:");
			num5 = input.nextInt();
		}
		
		//Process and print results
		System.out.println("\n### START BAR CHART ###\n");
		
		System.out.print("#1 |");
		while (num1 > 0) {
			System.out.print("*");
			num1--;
		}
		
		System.out.print("\n#2 |");
		
		while (num2 > 0) {
			System.out.print("*");
			num2--;
		}
		
		System.out.print("\n#3 |");
		
		while (num3 > 0) {
			System.out.print("*");
			num3--;
		}
		
		System.out.print("\n#4 |");
		
		while (num4 > 0) {
			System.out.print("*");
			num4--;
		}
		
		System.out.print("\n#5 |");
		
		while (num5 > 0) {
			System.out.print("*");
			num5--;
		}
		
		System.out.println("\n\n### END OF CHART ###");
		
		input.close();
		System.exit(0);
		
	}

}
