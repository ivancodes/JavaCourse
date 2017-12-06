//(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//representation of the average. So, if the sum of the values is 7, the average should be 2, not
//2.3333….]

package com.JavaCourse.Chapter_2;
import java.util.Scanner;

public class Task_2_17 {

	public static void main (String[] args) {
		
		//Variables declaration
		Scanner input = new Scanner(System.in);
		int nbr1,
			nbr2,
			nbr3,
			sum,
			average,
			product;
		
		//Obtain user input
		System.out.print("Enter the first number: ");
		nbr1  = input.nextInt();
		System.out.print("Enter the second number: ");
		nbr2  = input.nextInt();
		System.out.print("Enter the third number: ");
		nbr3  = input.nextInt();
		
		//Perform calculations
		sum = nbr1 + nbr2 + nbr3;
		average = (nbr1 + nbr2 + nbr3)/3;
		product = nbr1*nbr2*nbr3;
		
		//Print calculation results
		System.out.printf("%s%d%n%s%d%n%s%d%n", "The Sum = ", sum, "The Average = ", average, "The Product = ", product);
		
		//Analize the comparison and print the largest & smallest values
		if (nbr1 == nbr2 & nbr1 == nbr3) {
			System.out.println("Entered values are equal: " + nbr1);
		}

		if (nbr1 > nbr2 & nbr1 > nbr3) {
			System.out.println(nbr1 + " is the largest.");
		}
		
		if (nbr2 > nbr1 & nbr2 > nbr3) {
			System.out.println(nbr2 + " is the largest.");
		}

		if (nbr3 > nbr1 & nbr3 > nbr2) {
			System.out.println(nbr3 + " is the largest.");
		}
		
		if (nbr1 < nbr2 & nbr1 < nbr3) {
			System.out.println(nbr1 + " is the smallest.");
		}
		
		if (nbr2 < nbr1 & nbr2 < nbr3) {
			System.out.println(nbr2 + " is the smallest.");
		}

		if (nbr3 < nbr1 & nbr3 < nbr2) {
			System.out.println(nbr3 + " is the smallest.");
		}

		
		//Release the object after use
		input.close();
		System.exit(0);
	}
	
	
}
