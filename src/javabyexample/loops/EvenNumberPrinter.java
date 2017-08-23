package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenNumberPrinter {

	public static void main(String[] args) {
		// Prints even numbers
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("Enter number even numbers to be printed: ");
			input = br.readLine();
			int maxevenCount = Integer.parseInt(input);
			System.out.println("Even numbers: ");
			for (int count = 1, evencount = 0; evencount < maxevenCount; count++) {
				if (count % 2 == 0) {
					System.out.println(count);
					evencount++; // when even number gets printed, increase even number count
				}
			}
			/*
			 * for (int count = 2; count <= 2 * maxevenCount; count = count + 2) {
			 * System.out.println(count); }
			 */

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
/*
 * example 5 maxevenCount = 5 loop stops when evencount < maxevenCount count 1
 * evencount 0 if count % 2 == 0 print count = print nothing count 2 evencount 1
 * if count % 2 == 0 print count = 2 count 3 evencount 1 if count % 2 == 0 print
 * count = print nothing count 4 evencount 2 if count % 2 == 0 print count = 4
 * count 5 evencount 2 if count % 2 == 0 print count = print nothing count 6
 * evencount 3 if count % 2 == 0 print count = 6 count 7 evencount 3 if count %
 * 2 == 0 print count = print nothing count 8 evencount 4 if count % 2 == 0
 * print count = 8 count 9 evencount 4 if count % 2 == 0 print count = print
 * nothing count 10 evencount 5 if count % 2 == 0 print count = 10
 */
