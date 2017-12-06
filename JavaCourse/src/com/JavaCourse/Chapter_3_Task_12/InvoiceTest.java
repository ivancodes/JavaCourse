//3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
//an invoice for an item sold at the store. An Invoice should include four pieces of information as
//instance variables—a part number (type String), a part description (type String), a quantity of the
//item being purchased (type int) and a price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//multiplies the quantity by the price per item), then returns the amount as a double value. If the
//quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

package com.JavaCourse.Chapter_3_Task_12;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		String partNbr = "", partDescr = "";
		int qty = 0;
		double price = 0;

		Scanner input = new Scanner(System.in);
		Invoice thePart = new Invoice(partNbr, partDescr, qty, price);

		System.out.printf("INVOICE SAMPLE %n%s%s%n%s%s%n%s%d%n%s%.2f%n%n%s%n%n", "Part number: ", thePart.getPartNbr(),
				"Part description: ", thePart.getPartDescr(), "Quantity: ", thePart.getQty(), "Amount to pay: ",
				thePart.getAmt(), "#############");

		// Obtain user input
		System.out.print("Enter the Part Number: ");
		partNbr = input.nextLine();
		thePart.setPartNbr(partNbr);

		System.out.print("Enter the Part Description: ");
		partDescr = input.nextLine();
		thePart.setPartDescr(partDescr);

		System.out.print("Enter the Quantity: ");
		qty = input.nextInt();
		thePart.setQty(qty);

		System.out.print("Enter the Part Price: $");
		price = input.nextInt();
		thePart.setPrice(price);

		// Show results
		System.out.printf("%n%nCURRENT INVOICE: %n%s%s%n%s%s%n%s%d%n%s%.2f", "Part number: ", thePart.getPartNbr(),
				"Part description: ", thePart.getPartDescr(), "Quantity: ", thePart.getQty(), "Amount to pay: ",
				thePart.getAmt());

		// Release input
		input.close();

	}

}
