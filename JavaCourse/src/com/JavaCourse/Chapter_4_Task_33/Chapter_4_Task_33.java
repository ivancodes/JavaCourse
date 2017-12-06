//4.33 (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in the
//command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
//should not terminate (i.e., it should create an infinite loop). What happens when you run this program?

// Tipa priver togo kak NE nado pisat' tsikli? :)

package com.JavaCourse.Chapter_4_Task_33;

public class Chapter_4_Task_33 {

	public static void main(String[] args) {
		long d = 1;
		
		//some stupid code
		while (d>0) {
			d*=2;
			System.out.println(d);
		}

	}

}
