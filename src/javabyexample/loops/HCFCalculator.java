package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HCFCalculator {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program calculates Highest Common Factor of two numbers ");
			System.out.println("Enter number1: ");
			input = br.readLine();
			int num1 = Integer.parseInt(input);
			System.out.println("Enter number2: ");
			input = br.readLine();
			int num2 = Integer.parseInt(input);
			int hcf = calculateHCF(num1, num2);
			System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	/**
	 * caclulateHCF program calculates the HCF of the two given numbers
	 * 
	 * @param num1
	 *            Number1
	 * @param num2
	 *            Number2
	 * @return hcf Return HCF - highest common factor
	 */
	public static int calculateHCF(int num1, int num2) {
		// smaller number and larger number variable declaration
		int snum, lnum;
		if (num1 <= num2) {
			snum = num1;
			lnum = num2;
		} else {
			snum = num2;
			lnum = num1;
		}
		while (lnum % snum != 0) {
			int tempNum = lnum % snum;
			lnum = snum;
			snum = tempNum;
		}
		int hcf = snum;
		return hcf;
	}
}
