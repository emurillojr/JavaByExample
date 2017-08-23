package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddNumberPrinter {

	public static void main(String[] args) {
		// Prints odd numbers
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("Enter number odd numbers to be printed: ");
			input = br.readLine();
			int maxOddCount = Integer.parseInt(input);
			System.out.println("Odd numbers: ");

			for (int count = 1, oddcount = 0; oddcount < maxOddCount; count++) {
				if (count % 2 == 0) {
					continue;
				} else {
					System.out.println(count);
					oddcount++;
				}
			}
			/*
			 * for (int count = 1; count < 2 * maxOddCount; count = count + 2) {
			 * System.out.println(count); }
			 */

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
