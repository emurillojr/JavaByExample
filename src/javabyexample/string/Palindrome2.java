package javabyexample.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome2 {
	/*
	 * Program to determine whether given string is Palindrome, example anna,
	 * racecar, noon
	 */
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program checks whether the input string is a palindrome ");
			System.out.println("Enter the string: ");
			input = br.readLine();
			input = input.toUpperCase();
			StringBuffer strBuff = new StringBuffer(input);

			if (input.equalsIgnoreCase(strBuff.reverse().toString())) {
				System.out.println("Entered string is a palindrome ");
			} else {
				System.out.println("Entered string is a not palindrome ");
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
