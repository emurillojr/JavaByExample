package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindLargest {
	public static void main(String[] args) {
		System.out.println("This program will find the largest of the three numbers ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("Enter Number1 : ");
			input = br.readLine();
			float num1 = Float.parseFloat(input);
			System.out.println("Enter Number2: ");
			input = br.readLine();
			float num2 = Float.parseFloat(input);
			System.out.println("Enter Number3: ");
			input = br.readLine();
			float num3 = Float.parseFloat(input);
			System.out.println("Numbers Entered:  " + num1 + "  " + num2 + "  " + num3);
			// entered 6, 12, 18
			float largest = num1; // 6 6
			if (num2 > largest) { // 12 > 6
				largest = num2; // 12
			}
			if (num3 > largest) { // 18 > 12
				largest = num3; // 18
			}
			System.out.println("Largest : " + largest); // 18
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
