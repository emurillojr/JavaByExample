package javabyexample.basic;

public class SwapNumbersWithoutTempVariable {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 13;
		System.out.println("Before Swap");
		System.out.println("Number1: " + num1 + "\nNumber2: " + num2);
		num1 = num1 + num2; // 38
		num2 = num1 - num2; // 38 - 13 = 25
		num1 = num1 - num2; // 38 - 25 = 13
		System.out.println("After Swap");
		System.out.println("Number1: " + num1 + "\nNumber2: " + num2);

	}

}
