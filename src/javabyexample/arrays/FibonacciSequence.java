package javabyexample.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciSequence {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program prints Fibonacci Sequence: ");
			System.out.println("Enter the number of items to be printed from sequence: ");
			input = br.readLine();
			int maxCount = Integer.parseInt(input);
			// if max count is greater than 2 leave as is, otherwise make it 2
			maxCount = maxCount > 2 ? maxCount : 2;
			int[] fibonacciSequence = new int[maxCount];
			// first two elements
			fibonacciSequence[0] = 0;
			fibonacciSequence[1] = 1;
			/*
			 * if user enters number less than 2, change max count to 2
			 */
			for (int count = 2; count < maxCount; count++) {
				fibonacciSequence[count] = fibonacciSequence[count - 1] + fibonacciSequence[count - 2];
			}
			System.out.println("Fibonacci Sequence: ");
			displayRow(fibonacciSequence);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	// prints said row of the elements from an array
	public static void displayRow(int[] row) {
		/*
		 * for (int num = 0; num < row.length; num++) { System.out.print(row[num] +
		 * " "); } System.out.println();
		 */
		for (int num : row) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
