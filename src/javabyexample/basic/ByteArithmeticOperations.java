package javabyexample.basic;

public class ByteArithmeticOperations {

	public static void main(String[] args) {
		byte num1 = 60;
		byte num2 = 60;
		System.out.println("Byte Arithmetic Operations");
		System.out.println("Number1 " + num1);
		System.out.println("Number2 " + num2);
		byte sum = (byte) (num1 + num2);
		System.out.println("Sum = " + sum);
		byte diff = (byte) (num1 - num2);
		System.out.println("Diff = " + diff);
		byte product = (byte) (num1 * num2);
		System.out.println("Product = " + product);
		/*
		 * 60 * 60 = 3600 which is 111000010000 in binary form. byte is a 8-bits data
		 * form. truncates into 8 bits of the data which is equivalent to 00010000 which
		 * is 16 in decimal.
		 */
		byte quotient = (byte) (num1 / num2);
		System.out.println("Quotient = " + quotient);
		byte remainder = (byte) (num1 % num2);
		System.out.println("Remainder = " + remainder);

	}

}
