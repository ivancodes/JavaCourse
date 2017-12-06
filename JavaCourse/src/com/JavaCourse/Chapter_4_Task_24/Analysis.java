//4.24 (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any input,
//if the value entered is other than 1 or 2, keep looping until the user enters a correct value.

package com.JavaCourse.Chapter_4_Task_24;

import java.util.Scanner; // class uses class Scanner

public class Analysis {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);

		// initializing variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// process 10 students using counter-controlled loop
		while (studentCounter <= 10) {
			// prompt user for input and obtain value from user

			int result;

			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = input.nextInt();

			// VALIDATION FOR ENTERING CORRECT VALUES...
			while (result != 1 && result != 2) {
				System.out.print("Incorrect value entered. Please enter '1' for pass, or '2' for fail: ");
				result = input.nextInt();
			}

			// if...else is nested in the while statement
			if (result == 1) {
				passes = passes + 1;
			} else {
				failures = failures + 1;
			}

			// increment studentCounter so loop eventually terminates
			studentCounter = studentCounter + 1;
		}

		// termination phase; prepare and display results
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		// determine whether more than 8 students passed
		if (passes > 8)
			System.out.println("Bonus to instructor!");

		input.close();
	}

} // end class Analysis
