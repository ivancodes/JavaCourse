//4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
//three employees. The company pays straight time for the first 40 hours worked by each employee
//and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//number of hours worked last week and their hourly rates. Your program should input this information
//for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//input the data.

package com.JavaCourse.Chapter_4_Task_20;

public class Employee {

	private String name;
	private double perHourRate;
	private int hoursWorked;
	private double totalSalary;

	public Employee(String name, double perHourRate, int hoursWorked, double totalSalary) {

		this.name = name;


		if (perHourRate > 0) {
			this.perHourRate = perHourRate;
		}

		if (hoursWorked >= 0) {
			this.hoursWorked = hoursWorked;
		}
		
		if (totalSalary >= 0) {
			this.totalSalary = totalSalary;
		}

	}

	// getters

	public String getName() {
		return name;
	}

	public double getPerHourRate() {
		return perHourRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public double getTotalSalary() {
		return totalSalary;
	}

	// setters

	public void setName(String name) {
		this.name = name;
	}

	public void setPerHourRate(double perHourRate) {
		if (perHourRate > 0) {
			this.perHourRate = perHourRate;
		}
		this.perHourRate = perHourRate;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

}
