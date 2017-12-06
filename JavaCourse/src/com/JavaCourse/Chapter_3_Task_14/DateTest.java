//3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type
//int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
//variables and assumes that the values provided are correct. Provide a set and a get method for each
//instance variable. Provide a method displayDate that displays the month, day and year separated
//by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities. 

package com.JavaCourse.Chapter_3_Task_14;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		int month = 1, 
			day = 1, 
			year = 1;
		
		Scanner input = new Scanner (System.in);
		Date date = new Date (month, day, year);
		
		System.out.println("----DATE TEST----");
		
		System.out.print("Enter the Month (1-12): ");
		month = input.nextInt();
		date.setMonth(month);
		
		System.out.print("Enter the Day (1-31): ");
		day = input.nextInt();
		date.setDay(day);
				
		System.out.print("Enter the Year (YYYY): ");
		year = input.nextInt();
		date.setYear(year);
		
		System.out.println("\n >>> The date is formatted: " + date.getDate());
		
		System.out.printf("%nAnd now check out the gorgeous getters:%n%s%d%n%s%d%n%s%d ", "I am the get month: ", date.getMonth(), "and I am the get day: ", date.getDay(), "and here's get year: ", date.getYear());
		
		input.close();
	}

}
