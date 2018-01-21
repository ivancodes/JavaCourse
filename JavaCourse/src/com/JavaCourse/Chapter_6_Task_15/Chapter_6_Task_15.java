//6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
//a right triangle when the lengths of the other two sides are given. The method should take two arguments
//of type double and return the hypotenuse as a double. Incorporate this method into an
// Exercises 239
//application that reads values for side1 and side2 and performs the calculation with the hypotenuse
//method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
//triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.] 

package com.JavaCourse.Chapter_6_Task_15;
import java.util.Scanner;

public class Chapter_6_Task_15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double a, b;
		
		System.out.println("Hypotenuse calculation requires two sides of a triangle to be entered.\n");
		System.out.print("Enter side a: ");
		a = input.nextDouble();
		System.out.print("Enter side b: ");
		b = input.nextDouble();
		
		System.out.printf("%nHypotenuse = %.2f", calcHypotenuse(a, b));
		input.close();
		System.exit(0);
		
	}	
	
	public static double calcHypotenuse(double a, double b){
		double hyp = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		return hyp;
	}
	
}
