//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a charge account. For each customer,
//the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning balance 
//+ charges – credits), display the new balance and determine whether the new balance exceeds the
//customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//the message "Credit limit exceeded".

// <<<< SET some values to DOUBLE because int is too sad!

package com.JavaCourse.Chapter_4_Task_18;

public class Customer {

	private int accNbr;

	private double balanceStartOfMonth, currentBalance, creditLimit, totalCharge;

	// Define construntor properties
	public Customer(int accNbr, double totalCharge, double balanceStartOfMonth, double currentBalance,
			double creditLimit) {

		this.currentBalance = currentBalance;
		
		if (accNbr < 100000 && accNbr > 9999) {
			this.accNbr = accNbr;
		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}

		if (totalCharge >= 0) {
			this.totalCharge = totalCharge;
		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}

		if (balanceStartOfMonth >= 0) {

			this.balanceStartOfMonth = balanceStartOfMonth;
		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}
			

		if (creditLimit >= 0) {

			this.creditLimit = creditLimit;

		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}

	}

	// SETTERS
	public void setAccNbr(int accNbr) {

		if (accNbr < 100000 && accNbr > 9999) {
			this.accNbr = accNbr;
		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}

	}

	public void setBalanceStartOfMonth(double balanceStartOfMonth) {

		if (balanceStartOfMonth >= 0) {

			this.balanceStartOfMonth = balanceStartOfMonth;
		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}

	}

	public void setCurrentBalance(double currentBalance) {

		this.currentBalance = currentBalance;

	}
	
	public void setCreditLimit(double creditLimit) {

		if (creditLimit >= 0) {

			this.creditLimit = creditLimit;

		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}

	}
	
	public void setTotalCharge(double totalCharge) {

		if (totalCharge >= 0) {

			this.totalCharge = totalCharge;

		} else {
			System.out.println("\nInvalid value entered. Please try again...");
			System.exit(0);
			}

	}
	
	// GETTERS
	public int getAccNbr() {
		return accNbr;
	}
	
	public double getBalanceStartOfMonth() {
		return balanceStartOfMonth;
	}
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public double getTotalCharge() {
		return totalCharge;
	}

}
