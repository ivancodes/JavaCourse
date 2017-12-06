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

import java.util.Scanner;

public class CustomerTest {
	
	// A regular method to retrieve Customer data. Read - bulk getter
	public static void getCustomerData(Customer customer) {
		System.out.printf("%nCUSTOMER DATA%n%s%d%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f", 
				
				"Account number: ", customer.getAccNbr(),
				"Balance for the start of the Month: $", customer.getBalanceStartOfMonth(),
				"Credit limit available: $", customer.getCreditLimit(),
				"Total charge: $", customer.getTotalCharge(),
				"Current Balance: $", customer.getCurrentBalance());
	}
	
	public static void main(String[] args) {
		
		int    accNbr = 10000;
		double balanceStartOfMonth = 0, 
			   currentBalance = 0, 
			   totalCharge = 0, 
			   totalCredits = 0;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the customer data? (y/n) ");
		String sentinel = input.next();
		
		// Have user to enter one or more Customers
		while (sentinel.equals("y")) {
					
		Customer customer = new Customer (accNbr, balanceStartOfMonth, currentBalance, totalCharge, totalCredits);
		
		// Obtain Customer data
		System.out.print("\nEnter a five-digit customer Account number: ");
		accNbr = input.nextInt();
		customer.setAccNbr(accNbr);
		
		System.out.print("Enter the Balance for the start of the Month: $");
		balanceStartOfMonth = input.nextDouble();
		customer.setBalanceStartOfMonth(balanceStartOfMonth);
		
		System.out.print("Enter the credit limit for this customer: $");
		totalCharge = input.nextDouble();
		customer.setCreditLimit(totalCharge);
		
		System.out.print("Enter the Total Charges: $");
		totalCharge = input.nextDouble();
		customer.setTotalCharge(totalCharge);
		
		currentBalance = customer.getBalanceStartOfMonth() + customer.getCreditLimit() - customer.getTotalCharge();
		customer.setCurrentBalance(currentBalance);
		
		// Return entered data
		getCustomerData(customer);
		
		// Let user know whether the account has exceeded the Credit limit
		if (customer.getCurrentBalance() < 0) {
			
			System.out.println("\n\n!!!WARNING: Customer with account number " + customer.getAccNbr() + " has exceeded the Credit Limit by $" + -customer.getCurrentBalance() );
			
		}
		
		System.out.print("\n\nEnter the next customer data? (y/n) ");
		sentinel = input.next();
		
		}
		
	System.out.println("Complete. Thanks for using CrappySoft(tm)");
		
	input.close();
	}

}
