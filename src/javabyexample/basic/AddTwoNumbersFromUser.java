package javabyexample.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddTwoNumbersFromUser {

	public static void main(String[] args) {
		System.out.println("This program accepts two numbers from the user and adds them");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("Enter Number1: ");
			String number1 = br.readLine();
			System.out.println("Enter Number2: ");
			String number2 = br.readLine();
			int num1 = Integer.parseInt(number1);
			int num2 = Integer.parseInt(number2);
			int sum = num1 + num2;
			System.out.println("Sum = : " + sum);
		} catch (Exception ex) {
			System.out.println("Caught Exception: " + ex.getMessage());
			ex.printStackTrace();
		}

	}

}
