package javabyexample.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindLargest {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program creates an array of given size and fills with random numbers. ");
			System.out.println("Enter number of elements in array : ");
			input = br.readLine();
			int elementCount = Integer.parseInt(input);
			int[] numbers = new int[elementCount];

			for (int count = 0; count < elementCount; count++) {
				numbers[count] = (int) (Math.random() * 125 + Math.random() * 100);
			}

			// Print all the numbers in array
			System.out.print("Array elements: ");
			for (int count = 0; count < numbers.length; count++) {
				System.out.print(numbers[count] + " ");
			}
			System.out.println();

			// Sort array
			Arrays.sort(numbers);
			System.out.print("Sorted Array: ");

			// for (int number = 0; number < numbers.length; number++) {
			// System.out.print(numbers[number] + " ");
			// }

			for (int number : numbers) {
				System.out.print(number + " ");
			}
			System.out.println();
			System.out.println("Largest element in array: " + numbers[numbers.length - 1]);
			System.out.println("Second largest element in array: " + numbers[numbers.length - 2]);
			System.out.println("Smallest element in array: " + numbers[0]);
			System.out.println("Second smallest element in array: " + numbers[1]);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
