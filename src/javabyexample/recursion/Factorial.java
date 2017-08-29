package javabyexample.recursion;

// original javabyexample/loops/FactorialCalculator.java
// redone using recursion

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial of 5:  " + factorial(5));
		System.out.println("Factorial of 6:  " + factorial(6));
		System.out.println("Factorial of 7:  " + factorial(7));
		System.out.println("Factorial of 8:  " + factorial(8));
		System.out.println("Factorial of 9:  " + factorial(9));
		System.out.println("Factorial of 10: " + factorial(10));
	}

	public static int factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		// System.out.println(num * factorial(num - 1));
		return num * factorial(num - 1);

	}
}
