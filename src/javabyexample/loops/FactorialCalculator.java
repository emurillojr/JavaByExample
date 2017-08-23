package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialCalculator {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		int num;
		try {
			boolean isValid = false;
			System.out.println("This program will calculate the factorial of a number ");
			System.out.println("Enter Number between 1 and 20: ");
			do {
				input = br.readLine();
				num = Integer.parseInt(input);
				if (num < 1 || num > 20) {
					System.out.println("Please enter a number between 1 and 20 ");
				} else {
					isValid = true;
				}
			} while (!isValid);
			long factorial = 1;
			// example 5 5*4*3*2*1 = 120
			for (int num2 = num; num2 >= 1; num2--) {
				factorial = factorial * num2;
			}
			System.out.println("Factorial of " + num + " is " + factorial);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
