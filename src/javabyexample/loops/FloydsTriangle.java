package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FloydsTriangle {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program creates Floyds triangle with given number of rows. ");
			System.out.println("Enter the number of rows in Floyds triangle : ");
			input = br.readLine();
			int maxRows = Integer.parseInt(input);
			int num = 0;
			for (int rowCount = 1; rowCount <= maxRows; rowCount++) { // rows
				for (int colCount = 1; colCount <= rowCount; colCount++) { // columns
					System.out.print(++num + " ");
				}
				System.out.println("");
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
