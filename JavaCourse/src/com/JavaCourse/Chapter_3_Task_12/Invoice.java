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

public class Invoice {

	// instance variables
	private String partNbr;
	private String partDescr;
	private int qty;
	private double price;

	// >>>>>>> CONSTRUCTOR
	public Invoice(String partNbr, String partDescr, int qty, double price) {

		if (partNbr != "") {
			this.partNbr = partNbr;
		} else {
			this.partNbr = "n/a";
		}

		if (partDescr != "") {
			this.partDescr = partDescr;
		} else {
			this.partDescr = "n/a";
		}

		if (qty > 0) {
			this.qty = qty;
		} else {
			this.qty = 0;
		}

		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0.0;
		}

	}

	// >>>>>>> METHODS

	// -- setters
	public void setPartNbr(String partNbr) {
		if (partNbr != "") {
			this.partNbr = partNbr;
		} else {
			this.partNbr = "n/a";
		}
	}

	public void setPartDescr(String partDescr) {
		if (partDescr != "") {
			this.partDescr = partDescr;
		} else {
			this.partDescr = "n/a";
		}
	}

	public void setQty(int qty) {
		if (qty > 0) {
			this.qty = qty;
		} else {
			this.qty = 0;
		}
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0.0;
		}
	}

	// -- getters
	public String getPartNbr() {
		return partNbr;

	}

	public String getPartDescr() {
		return partDescr;

	}

	public int getQty() {
		return qty;

	}

	public double getPrice() {
		return price;
	}

	public double getAmt() {
		double amt = qty * price;
		return amt;
	}

}
