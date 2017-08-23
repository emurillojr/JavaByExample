package javabyexample.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		System.out.println("Array Demonstration Program");
		// Example of int array
		int[] scores = new int[10];
		scores[0] = 25;
		scores[1] = 32;
		scores[2] = 38;
		scores[3] = 24;
		scores[4] = 16;
		scores[5] = 19;
		scores[6] = 31;
		scores[7] = 27;
		scores[8] = 23;
		scores[9] = 28;

		for (int count = 0; count < scores.length; count++) {
			System.out.println("Score " + count + " : " + scores[count]);
		}

		System.out.println();

		int[] data = { 10, 20, 30, 40, 50, 50 };

		for (int count = 0; count < data.length; count++) {
			System.out.println("Data " + count + " : " + data[count]);
		}

		System.out.println();

		// Example of String array
		String[] weekdays = new String[7];
		weekdays[0] = "Sunday";
		weekdays[1] = "Monday";
		weekdays[2] = "Tuesday";
		weekdays[3] = "Wednesday";
		weekdays[4] = "Thursday";
		weekdays[5] = "Friday";
		weekdays[6] = "Saturday";

		for (int count = 0; count < weekdays.length; count++) {
			System.out.println(weekdays[count]);
		}

		// Accessing an element of an array at a particular index
		System.out.println("5th day of week is " + weekdays[4]);

	}

}
