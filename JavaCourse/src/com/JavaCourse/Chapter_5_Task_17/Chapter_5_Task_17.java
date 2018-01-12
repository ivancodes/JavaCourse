//5.17 (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
//Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//Write an application that reads a series of pairs of numbers as follows:
//a) product number
//b) quantity sold
//Your program should use a switch statement to determine the retail price for each product. It
//should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//loop to determine when the program should stop looping and display the final results.

package com.JavaCourse.Chapter_5_Task_17;
import java.util.Scanner;

public class Chapter_5_Task_17 {

	public static void main(String[] args) {
		
		// Variables
		Scanner input = new Scanner(System.in);
		int soldQty, productNum, 
					 product1count = 0,
					 product2count = 0,
					 product3count = 0,
					 product4count = 0,
					 product5count = 0;
		
		Character decision = 'y';
		
		// Obtain and validate user input
		System.out.println("### Sales Data ### \nEnter the product number and quantity below: \n");
		while(decision.equals('y')) {
			
			System.out.print("Product number:");
			productNum = input.nextInt();
			
			while (productNum < 1 || productNum > 5) {
				System.out.print("Please enter a valid product number: ");
				productNum = input.nextInt();
			}
			
			System.out.print("Sold quantity: ");
			soldQty = input.nextInt();
			
			System.out.print("Enter more sales data? y/n: ");
			decision = input.next().charAt(0);
			
		// Assign appropriate numbers to corresponding products	
			switch (productNum) {
				
			case 1: product1count = soldQty;
					break;
			case 2: product2count = soldQty;
					break;
			case 3: product3count = soldQty;
					break;
			case 4: product4count = soldQty;
					break;
			case 5: product5count = soldQty;
					break;
			
			}
			
		}
		
		double totalSalesProduct1 = product1count*2.98,
				   totalSalesProduct2 = product2count*4.5,
				   totalSalesProduct3 = product3count*9.98,
				   totalSalesProduct4 = product4count*4.49,
				   totalSalesProduct5 = product5count*6.87,
				   total = totalSalesProduct1 + totalSalesProduct2 + totalSalesProduct3 +totalSalesProduct4 + totalSalesProduct5;
		
		// Print results
		System.out.println("\n### SALES RESULTS ###");
		System.out.printf("%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%n%s%.2f",
				 		  "Product #1 retail total sales of: $", totalSalesProduct1,
						  "Product #2 retail total sales of: $", totalSalesProduct2,
						  "Product #3 retail total sales of: $", totalSalesProduct3,
						  "Product #4 retail total sales of: $", totalSalesProduct4,
						  "Product #5 retail total sales of: $", totalSalesProduct5,
						  "Total value of sales: $", total);
		
		input.close();
		System.exit(0);
	}

}
