package javabyexample.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
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
			boolean isPalindrome = true;
			int strLength = input.length();
			int mid = strLength / 2;
			for (int count = 0; count < mid; count++) {
				// if first character = last character
				if (input.charAt(count) == input.charAt(strLength - count - 1)) {
					continue;
				} else {
					isPalindrome = false;
					break;
				}
			}

			if (isPalindrome) {
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
