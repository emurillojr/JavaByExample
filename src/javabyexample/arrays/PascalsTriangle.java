package javabyexample.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PascalsTriangle {
	/*
	 * Pascals Triangle Right isosceles Triangle - starts and ends with 1 Mid
	 * numbers are the som of the numbers from the previous Row
	 * 
	 */
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program creates a pascals triangle: ");
			System.out.println("Enter the number of rows in Pascals triangle: ");
			input = br.readLine();
			int maxRowCount = Integer.parseInt(input);
			int[] previousRow;
			int[] currentRow = { 1 }; // intro
			displayRow(currentRow);

			for (int rowCount = 1; rowCount < maxRowCount; rowCount++) {
				previousRow = currentRow;
				currentRow = new int[rowCount + 1];
				currentRow[0] = 1;
				for (int colCount = 1; colCount < rowCount; colCount++) {
					currentRow[colCount] = previousRow[colCount - 1] + previousRow[colCount];
				}
				currentRow[rowCount] = 1;
				displayRow(currentRow);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	public static void displayRow(int[] row) {
		/*
		 * for (int num = 0; num < row.length; num++) { System.out.print(row[num] +
		 * " "); } System.out.println();
		 */

		for (int num : row) {
			System.out.print(num + " ");
		}
		System.out.println("");
	}
}
