//4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//these items are as follows:
//Item Value
//1 239.99
//2 129.75
//3 99.95
//4 350.89
//Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.

package com.JavaCourse.Chapter_4_Task_19;

import java.util.Scanner;

public class SalesCommissionCalculator {

	public static void main(String[] args) {

		String name = "";
		double salesAmt = 0;
		double price = 0;
		int itemsSold = 0;
		int countSales = 0;
		int SALARY_BASE = 200;
		
		Scanner input = new Scanner(System.in);
		SalesMan salesman = new SalesMan(name, salesAmt);
		
		// Obtain sales data
		System.out.print("Enter the Salesman name: ");
		name = input.nextLine();
		salesman.setName(name);

		System.out.print("Any item(s) sold?(y/n) ");
		String sentinel = input.next();

		while (sentinel.equals("y")) {

			System.out.print("Enter number of sold items: ");
			itemsSold = input.nextInt();

			System.out.print("Enter the price per item: $");
			price = input.nextDouble();

			salesAmt = salesAmt + (itemsSold * price);
			salesman.setSalesAmt(salesAmt);
			countSales++;

			System.out.print("\nAny other item(s) sold?(y/n) ");
			sentinel = input.next();
		}
		
		double BONUS = salesman.getSalesAmt() * 0.09;

		// Print results
		if (countSales == 0) {
			System.out.printf("%nSalary for %s%s%d", salesman.getName(), " = $", SALARY_BASE);
		} else {
			System.out.printf("%nSalary for %s%s%.2f", salesman.getName(), " = $", (SALARY_BASE + BONUS));
		}

				System.out.print("\n\nComplete. Enter 'q' to quit...");
		sentinel = input.next();
		if(sentinel.equals("q")) {
			input.close();
			System.exit(0);
		}
		
	}

}
