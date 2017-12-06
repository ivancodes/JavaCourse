//3.13 (Employee Class) Create a class called Employee that includes three instance variables—a
//first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
//that initializes the three instance variables. Provide a set and a get method for each instance
//variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
//that demonstrates class Employee’s capabilities. Create two Employee objects and display each
//object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
//again. 

package com.JavaCourse.Chapter_3_Task_13;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		String firstName = "<FIRST_NAME>";
		String lastName = "<LAST_NAME>";
		double monthlySalary = 100;

		Employee qaJunior1 = new Employee("Vasilii", "Pupkin", 200.15);
		Employee qaJunior2 = new Employee("Petr", "Vatrushkin", 150.9);
		Employee qaJunior3 = new Employee(firstName, lastName, monthlySalary);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the new employee data:");
		
		System.out.print("First Name: ");
		firstName = input.nextLine();
		qaJunior3.setFirstName(firstName);

		System.out.print("Last Name: ");
		lastName = input.nextLine();
		qaJunior3.setLastName(lastName);

		System.out.print("Monthly Salary: $");
		monthlySalary = input.nextDouble();		
		qaJunior3.setMonthlySalary(monthlySalary);

		System.out.printf("%nCURRENT EMPLOYEES: %n%n%s%s%s%s%.2f%n%s%s%s%s%.2f%n%s%s%s%s%.2f%n",
				qaJunior1.getFirstName(), " ", qaJunior1.getLastName(), " having yearly salary of $",
				qaJunior1.getMonthlySalary() * 12, qaJunior2.getFirstName(), " ", qaJunior2.getLastName(),
				" having yearly salary of $", qaJunior2.getMonthlySalary() * 12, qaJunior3.getFirstName(), " ",
				qaJunior3.getLastName(), " having yearly salary of $", qaJunior3.getMonthlySalary() * 12);

		System.out.println("");
		System.out.print("Would you like to rise employee's salary by 10%? y/n: ");

		if (input.next().charAt(0) == 'y') {
			qaJunior1.promoteMonthlySalary(qaJunior1.getMonthlySalary());
			qaJunior2.promoteMonthlySalary(qaJunior2.getMonthlySalary());
			qaJunior3.promoteMonthlySalary(qaJunior3.getMonthlySalary());

			System.out.printf("%nSALARY PROMOTED: %n%n%s%s%s%s%.2f%n%s%s%s%s%.2f%n%s%s%s%s%.2f%n",
					qaJunior1.getFirstName(), " ", qaJunior1.getLastName(), " having yearly salary of $", qaJunior1.getMonthlySalary() * 12, 
					qaJunior2.getFirstName(), " ", qaJunior2.getLastName(),	" having yearly salary of $", qaJunior2.getMonthlySalary() * 12, 
					qaJunior3.getFirstName(), " ", qaJunior3.getLastName(), " having yearly salary of $", qaJunior3.getMonthlySalary() * 12);
		} else {
			System.out.println("GREED IS GOOD, BUDDY :D");
		}

		input.close();
	}

}
