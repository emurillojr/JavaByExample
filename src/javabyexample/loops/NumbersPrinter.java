package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumbersPrinter {

	public static void main(String[] args) {
		// Print numbers from 1 to the given number
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("Enter Number: ");
			input = br.readLine();
			int maxnumber = Integer.parseInt(input);

			for (int count = 1; count <= maxnumber; count++) {
				System.out.println(count);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
