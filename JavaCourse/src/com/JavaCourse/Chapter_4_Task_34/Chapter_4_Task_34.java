package com.JavaCourse.Chapter_4_Task_34;

public class Chapter_4_Task_34 {

	public static void main(String[] args) {

		int x = 0, y = 0;

		// System.out.println(++(x + y));
		// Since ++(x+y) means x + y = x +y + 1, this violates the rules for the
		// assignment operator. The assignment operator stores the value of the
		// expression on the right-hand-side of the assignment operator into the
		// variable on the left-hand-side. Thus, it requires exactly 1 variable on the
		// left-hand-side. We cannot store the value into x + y since that is an
		// expression and it does not have a memory location to store the value (as a
		// variable has). Hence, the ++ operator can only be used with a single
		// variable. To increment the value by one you may simply use the + operator.
		
		System.out.println(1 + (x + y));
		

	}

}
