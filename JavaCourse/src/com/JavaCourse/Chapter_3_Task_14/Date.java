//3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type
//int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
//variables and assumes that the values provided are correct. Provide a set and a get method for each
//instance variable. Provide a method displayDate that displays the month, day and year separated
//by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities. 

package com.JavaCourse.Chapter_3_Task_14;

public class Date {
	
	private int month, day, year;
	
	public Date (int month, int day, int year) {
		
		// Check for valid MONTHS
		if (month > 0 & month <= 12) {
			
			this.month =  month;
			
		}
		
		// Check for valid DAYS
		if (month == 1 & day > 0 & day <= 31) {
			this.day =  day;
		}
		
		if (month == 2 & year%4 != 0 || year%100 == 0 && year%400 != 0 & day > 0 & day <= 28) {
			this.day =  day;
		} else if (month == 2 & day > 0 & day <= 29) {
			this.day = day;
		}
		
		if (month == 3 & day > 0 & day <= 31) {
			this.day =  day;
		}
		
		if (month == 4 & day > 0 & day <= 30) {
			this.day =  day;
		}
		
		if (month == 5 & day > 0 & day <= 31) {
			this.day =  day;
		}
		
		if (month == 6 & day > 0 & day <= 30) {
			this.day =  day;
		}
		
		if (month == 7 & day > 0 & day <= 31) {
			this.day =  day;
		}
		
		if (month == 8 & day > 0 & day <= 31) {
			this.day =  day;
		}
		
		if (month == 9 & day > 0 & day <= 30) {
			this.day =  day;
		}
		
		if (month == 10 & day > 0 & day <= 31) {
			this.day =  day;
		}
		if (month == 11 & day > 0 & day <= 30) {
			this.day =  day;
		}
		
		if (month == 12 & day > 0 & day <= 31) {
			this.day =  day;
		}
		
		if (year%year == 0) {
			this.year = year;
		}
		
		}
	
		//setters
		public void setMonth(int month) {
			if (month > 0 & month <= 12) {
				
				this.month =  month;
				
			}
		}
		
		public void setDay(int day) {
			if (month == 1 & day > 0 & day <= 31) {
				this.day =  day;
			}
			// Check is FEB has 28 or 29 days
			if (month == 2 & (year%4 != 0 && (year%100 == 0 && year%400 != 0)) & (day > 0 & day <= 28)) {
				this.day =  day; 
			} else if (month == 2 & day > 0 & day <= 29) {
				this.day = day;
				}
		
			if (month == 3 & day > 0 & day <= 31) {
				this.day =  day;
			}
			
			if (month == 4 & day > 0 & day <= 30) {
				this.day =  day;
			}
			
			if (month == 5 & day > 0 & day <= 31) {
				this.day =  day;
			}
			
			if (month == 6 & day > 0 & day <= 30) {
				this.day =  day;
			}
			
			if (month == 7 & day > 0 & day <= 31) {
				this.day =  day;
			}
			
			if (month == 8 & day > 0 & day <= 31) {
				this.day =  day;
			}
			
			if (month == 9 & day > 0 & day <= 30) {
				this.day =  day;
			}
			
			if (month == 10 & day > 0 & day <= 31) {
				this.day =  day;
			}
			if (month == 11 & day > 0 & day <= 30) {
				this.day =  day;
			}
			
			if (month == 12 & day > 0 & day <= 31) {
				this.day =  day;
			}
			
		
		}
		
		public void setYear (int year) {
			if (year%year == 0) {
				this.year = year;
			}
		}
			
		
		
	
		//getters
		public String getDate() {
			return String.format("%d/%d/%d", month, day, year);
		}
		
		public int getMonth() {
			return month;
		}

		public int getDay() {
			return day;
		}
		
		public int getYear() {
			return year;
		}
}
