//3.13 (Employee Class) Create a class called Employee that includes three instance variables—a
//first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
//that initializes the three instance variables. Provide a set and a get method for each instance
//variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
//that demonstrates class Employee’s capabilities. Create two Employee objects and display each
//object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
//again. 

package com.JavaCourse.Chapter_3_Task_13;

public class Employee {

	private String firstName, lastName;
	private double monthlySalary;
	
	// constructor
	public Employee(String firstName, String lastName, double monthlySalary) {

		if (firstName != "") {
			this.firstName = firstName;
		}

		if (lastName != "") {
			this.lastName = lastName;
		}

		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
	}

	// setters
	public void setFirstName(String firstName) {
		if (firstName != "") {
			this.firstName = firstName;
		} else {
			System.out.println("Invalid first name. Please try again.");
		}
	}

	public void setLastName(String lastName) {
		if (lastName != "") {
			this.lastName = lastName;
		} else {
			System.out.println("Invalid last name. Please try again.");
		}
	}

	public void setMonthlySalary(Double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			System.out.println("Invalid salary entered.");
		}
	}

	public void promoteMonthlySalary(Double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary * 1.1;
		} else {
			System.out.println("Promotion Failed.");
		}
	}

	// getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

}
