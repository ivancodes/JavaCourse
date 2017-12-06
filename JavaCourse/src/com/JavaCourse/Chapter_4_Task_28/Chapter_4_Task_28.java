//(Another Dangling-else Problem) Modify the given code to produce the output shown in
//each part of the problem. Use proper indentation techniques. Make no changes other than inserting
//braces and changing the indentation of the code. The compiler ignores indentation in a Java program.
//We’ve eliminated the indentation from the given code to make the problem more challenging.
//[Note: It’s possible that no modification is necessary for some of the parts.]


package com.JavaCourse.Chapter_4_Task_28;

import java.util.Scanner;

public class Chapter_4_Task_28 {

	public static void main(String[] args) {
		int x,y;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter X: ");
		x = input.nextInt();
		
		System.out.print("Enter  Y: ");
		y = input.nextInt();
		
//		a) Assuming that x = 5 and y = 8, the following output is produced:
//		@@@@@
//		$$$$$
//		&&&&&
		System.out.println("\nCondition a)");
		
		if (y == 8) {
			if (x == 5)
			System.out.println("@@@@@");
			}
			else {
			System.out.println("#####");
			}
		
			System.out.println("$$$$$");
			System.out.println("&&&&&");
			
			System.out.println("\nConditions b) and c)");
//		b) Assuming that x = 5 and y = 8, the following output is produced:
//		@@@@@
//		c) Assuming that x = 5 and y = 8, the following output is produced:
//		@@@@@
			
		if (y == 8) {
			if (x == 5)
			System.out.println("@@@@@");
			}
			else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
			}
//		
//		d) Assuming that x = 5 and y = 7, the following output is produced. 
//		[Note: The last three output statements after the else are all part of a block.]
//		#####
//		$$$$$
//		&&&&&
		System.out.println("\nCondition d)");
		
		System.out.print("\nEnter X: ");
		x = input.nextInt();
		
		System.out.print("Enter  Y: ");
		y = input.nextInt();
		
		if (y == 8) {
			if (x == 5)
			System.out.println("@@@@@");
		}
			else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
			}
			
			input.close();
			System.exit(0);
	}

}
