package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumberPrinter {

	public static void main(String[] args) {
		// Prints prime numbers
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program prints prime numbers ");
			System.out.println("Enter number of prime numbers to be printed: ");
			input = br.readLine();
			int maxPrimeCount = Integer.parseInt(input);
			System.out.println("Prime numbers: ");

			for (int count = 2, primeCount = 0; primeCount < maxPrimeCount; count++) {
				if (checkPrime(count)) {
					System.out.println(count);
					primeCount++;
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	/**
	 * checkPrime method checks whether the given number is a prime number. If the
	 * given number is a prime number, the method returns true. Otherwise, the
	 * method returns false.
	 * 
	 * @param number
	 * @return true If number is prime false If number is not prime
	 */
	private static boolean checkPrime(int number) {
		boolean isPrime = true;
		if (number == 2) {
			isPrime = true;
		} else if (number % 2 == 0) {
			isPrime = false;
		} else {
			int maxCount = (int) Math.ceil(Math.sqrt(number));
			for (int count = 3; count <= maxCount; count = count + 2) {
				if (number % count == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}
