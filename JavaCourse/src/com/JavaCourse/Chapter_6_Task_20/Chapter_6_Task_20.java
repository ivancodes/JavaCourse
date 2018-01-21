//6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//a method called circleArea to calculate the area of the circle. 

package com.JavaCourse.Chapter_6_Task_20;
import java.util.Scanner;

public class Chapter_6_Task_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the radius value: ");
		double radius = in.nextDouble();
		
		System.out.printf("%nThe Area value calculated by calcCircleArea(radius) method is \"%.2f\"", calcCircleArea(radius));
		in.close();
		System.exit(0);
		
	}

	public static double calcCircleArea(double radius) {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
}
