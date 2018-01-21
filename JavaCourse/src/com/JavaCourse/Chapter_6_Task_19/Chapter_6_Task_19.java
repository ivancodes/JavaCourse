//6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive
//a second parameter of type char called fillCharacter. Form the square using the char provided
//as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
//#####
//#####
//#####
//#####
//#####
//Use the following statement (in which input is a Scanner object) to read a character from the user
//at the keyboard:
//char fill = input.next().charAt(0);

package com.JavaCourse.Chapter_6_Task_19;

import java.util.Scanner;

public class Chapter_6_Task_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the square side (1 to 20): ");
		int side = input.nextInt();

		System.out.print("Enter the symbol you want your rectangle to be filled with: ");
		char fill = input.next().charAt(0);

		System.out.println("\nBelow is the result of a drawRectangle(side, fill) method:");
		drawRectangle(side, fill);

		input.close();
		System.exit(0);

	}

	// Declare a static method that draws rectangle using arguments as follows:
	// 1) side - the number of symbols in a row and a number of rows to draw
	// 2) fill - the symbol "filler" defined by user

	public static void drawRectangle(int side, char fill) {

		if (side > 0 && side <= 20) {

			int i = side;

			while (i > 0) {
				System.out.print("\n " + fill + " ");

				int k = side;
				while (k > 1) {
					System.out.print(" " + fill + " ");
					k--;
				}

				i--;

			}

		} else {

			System.out.println("Invalid side value entered. Please try again.");

		}
	}

}
