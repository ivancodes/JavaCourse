//4.32 (Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
//System.out.print("* ");
//System.out.print(" ");
//System.out.println();
//to display the checkerboard pattern that follows. A System.out.println method call with no arguments
//causes the program to output a single newline character. [Hint: Repetition statements are
//required.]

package com.JavaCourse.Chapter_4_Task_32;

public class Chapter_4_Task_32 {

	public static void main(String[] args) {

		System.out.println("Checkerboard pattern or drunk Malevich:\n");

		// define Y axis size
		int y = 8;
		while (y > 0) {

			// Define a line shift: kak ya zakolebalsya poka dodumalsya do etoi figni!!!
			if (y % 2 == 0) {

				System.out.print("* ");

				// define x axis
				int x = 7;
				while (x > 0) {

					System.out.print("* ");
					x--;
				}

				System.out.println();
				y--;

				// shift back the line
			} else {

				System.out.print(" ");
				System.out.print("* ");

				int x = 7;
				while (x > 0) {

					System.out.print("* ");
					x--;
				}

				System.out.println();
				y--;

			}
		}

		System.exit(0);
	}

}
