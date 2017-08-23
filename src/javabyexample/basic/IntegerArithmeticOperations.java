package javabyexample.basic;

public class IntegerArithmeticOperations {

	public static void main(String[] args) {
		int num1 = 12589;
		int num2 = 525;
		System.out.println("Integer Arithmetic Operations");
		System.out.println("Number1: " + num1);
		System.out.println("Number2: " + num2);
		int sum = num1 + num2;
		System.out.println("Sum = " + sum);
		int diff = num1 - num2;
		System.out.println("Diff = " + diff);
		int product = num1 * num2;
		System.out.println("Product = " + product);
		int quotient = num1 / num2;
		System.out.println("Quotient = " + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder = " + remainder);

		int overflowResult = 1000 * 1000 * 3000 / 1000 * 1000;
		System.out.println("OverflowResult: " + overflowResult);

		long overflowLongResult = (long) ((1000L * 1000L * 3000L) / (1000L * 1000L));
		System.out.println("OverflowLongResult: " + overflowLongResult);

	}

}
