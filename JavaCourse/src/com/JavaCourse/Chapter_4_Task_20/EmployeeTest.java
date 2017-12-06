//4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
//three employees. The company pays straight time for the first 40 hours worked by each employee
//and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//number of hours worked last week and their hourly rates. Your program should input this information
//for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//input the data.

package com.JavaCourse.Chapter_4_Task_20;

import java.util.Scanner;

public class EmployeeTest {

	static String name = "";
	static double perHourRate = 0;
	static int hoursWorked = 0;
	static double totalSalary = 0;

	// Get employee data
	public static void getEmployeeData(Employee employee) {
		System.out.println("\nName: " + employee.getName());
		System.out.println("Per hour pay rate: $" + employee.getPerHourRate());
		System.out.println("Total hours worked last week: " + employee.getHoursWorked());
		System.out.println("Total salary for last week: " + employee.getTotalSalary());
	}

	// Calculate employees salary and show overtimes if any..
	public static void setTotalSalary(Employee employee) {
		if (employee.getHoursWorked() <= 40) {
			totalSalary = employee.getPerHourRate() * employee.getHoursWorked();
			employee.setTotalSalary(totalSalary);
		} else {
			totalSalary = employee.getPerHourRate() * 40;
			totalSalary += (employee.getPerHourRate() * employee.getHoursWorked() - 40) * 0.5;
			employee.setTotalSalary(totalSalary);
			
			System.out.println("Overtimes: $" + (employee.getPerHourRate() * employee.getHoursWorked() - 40) * 0.5 );
		}

	}


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Employee employee1 = new Employee(name, perHourRate, hoursWorked, totalSalary);
		Employee employee2 = new Employee(name, perHourRate, hoursWorked, totalSalary);
		Employee employee3 = new Employee(name, perHourRate, hoursWorked, totalSalary);

		// Obtain the first employee data
		System.out.print("\nEnter the first employee Name: ");
		name = input.nextLine();
		employee1.setName(name);

		System.out.print("Enter the first employee per hour pay rate: $");
		perHourRate = input.nextDouble();
		employee1.setPerHourRate(perHourRate);

		System.out.print("Enter the first employee worked hours last week: ");
		hoursWorked = input.nextInt();
		employee1.setHoursWorked(hoursWorked);
		setTotalSalary(employee1);

		// Obtain the second employee data
		System.out.print("\nEnter the second employee Name: ");
		input.nextLine();
		name = input.nextLine();
		employee2.setName(name);

		System.out.print("Enter the second employee per hour pay rate: $");
		perHourRate = input.nextDouble();
		employee2.setPerHourRate(perHourRate);

		System.out.print("Enter the second employee worked hours last week: ");
		hoursWorked = input.nextInt();
		employee2.setHoursWorked(hoursWorked);
		setTotalSalary(employee2);

		// Obtain the third employee data
		System.out.print("\nEnter the third employee Name: ");
		input.nextLine();
		name = input.nextLine();
		employee3.setName(name);

		System.out.print("Enter the third employee per hour pay rate: $");
		perHourRate = input.nextDouble();
		employee3.setPerHourRate(perHourRate);

		System.out.print("Enter the third employee worked hours last week: ");
		hoursWorked = input.nextInt();
		employee3.setHoursWorked(hoursWorked);
		setTotalSalary(employee3);

		// Print results
		getEmployeeData(employee1);
		getEmployeeData(employee2);
		getEmployeeData(employee3);

		input.close();
		System.exit(0);
	}

}
