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

public class SalesMan {

	private String name;
	private double salesAmt;

	// Define constructor
	public SalesMan(String name, double salesAmt) {

		this.name = name;

		if (salesAmt >= 0) {
			this.salesAmt = salesAmt;
		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setSalesAmt(double salesAmt) {
		if (salesAmt >= 0) {
			this.salesAmt = salesAmt;
		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public double getSalesAmt() {
		return this.salesAmt;
	}

}
