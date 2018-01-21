//6.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//the coin appears. Display the results. The program should call a separate method flip that takes no
//arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//simulates coin tossing, each side of the coin should appear approximately half the time.]

package com.JavaCourse.Chapter_6_Task_29;

import java.security.SecureRandom;
import java.util.Scanner;

public class Chapter_6_Task_29 {

	public enum CoinSide {
		HEADS, TAILS
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int headsCount = 0, tailsCount = 0;
		Character decision;

		Scanner input = new Scanner(System.in);

		System.out.print("\nToss the coin?\ny/n: ");
		decision = input.next().charAt(0);

		while (decision.equals('y')) {

			System.out.print("\nyou flipped: " + flip());

			switch (flip()) {
			case HEADS:
				headsCount++;
				break;

			case TAILS:
				tailsCount++;
				break;
			}

			System.out.print("\nToss the coin?\ny/n: ");
			decision = input.next().charAt(0);

		}

		System.out.printf("%nHEADS count: %d%nTAILS count: %d", headsCount, tailsCount);
		
		input.close();
		System.exit(0);

	}

	public static CoinSide flip() {

		CoinSide side = null;
		SecureRandom random = new SecureRandom();
		int flip = random.nextInt(2);

		switch (flip) {
		case 0:
			side = CoinSide.HEADS;
			break;
		case 1:
			side = CoinSide.TAILS;
			break;
		}

		return side;

	}

}
