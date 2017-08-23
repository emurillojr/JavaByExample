package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindSmallest {
	public static void main(String[] args) {
		System.out.println("This program will find the smallest of the three numbers ");
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
			// entered -2, 20, 15
			float smallest = num1; // -2 -2
			if (num2 < smallest) { // 20 < -2
				smallest = num2; // no change
			}
			if (num3 < smallest) { // 15 < -2
				smallest = num3; // no change
			}
			System.out.println("Smallest : " + smallest);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
