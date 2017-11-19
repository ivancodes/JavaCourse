//(Arithmetic) Write an application that asks the user to enter two integers, obtains them
//from the user and prints their sum, product, difference and quotient (division).

package com.JavaCourse.Chapter_2;
import java.util.Scanner;

public class Task_2_15 {
	
	public static void main (String[] args) {
		
		//Variables declaration
		Scanner input = new Scanner(System.in);
		int nbr1,
			nbr2,
			sum,
			difference,
			product;
		
		float quotient;
		
		//Obtain values from user input
		System.out.print("Enter the first number: ");
		nbr1  = input.nextInt();
		System.out.print("Enter the second number: ");
		nbr2  = input.nextInt();
		
		//Perform calculations
		sum = nbr1 + nbr2;
		difference = nbr1 - nbr2;
		product = nbr1*nbr2;
		quotient = (float) nbr1/nbr2;
		
		//Print results
		System.out.printf("%s%d%n%s%d%n%s%d%n%s%.2f", "The Sum = ", sum, "The difference = ", difference, "The Product = ", product, "The Quotient = ", quotient);
		
		//Release object after use
		input.close();
	}

}
