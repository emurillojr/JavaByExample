package javabyexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LCMCalculator {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program calculates Lowest Common Multiple of two numbers ");
			System.out.println("Enter number1: ");
			input = br.readLine();
			int num1 = Integer.parseInt(input);
			System.out.println("Enter number2: ");
			input = br.readLine();
			int num2 = Integer.parseInt(input);
			int hcf = HCFCalculator.calculateHCF(num1, num2);
			System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
			int lcm = num1 * num2 / hcf;
			System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
