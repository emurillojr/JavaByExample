package javabyexample.basic;

import java.util.Scanner;

/*
 * SubtractNumber class accepts two numbers from the user
 * through console and provides the result of subtracting two numbers.
 */
public class SubtractNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program accepts two numbers from the user and subtracts them");
		int number1 = Integer.parseInt(keyboard.next());
		int number2 = Integer.parseInt(keyboard.next());
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
		int sum = number1 - number2;
		System.out.println("Sum = : " + sum);
		keyboard.close();

	}

}
