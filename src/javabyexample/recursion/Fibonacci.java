package javabyexample.recursion;

//original javabyexample/arrays/FibonacciSequence.java
//redone using recursion

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("1st Fibonacci Number: " + fibonacci(1));
		System.out.println("2nd Fibonacci Number: " + fibonacci(2));
		System.out.println("3rd Fibonacci Number: " + fibonacci(3));
		System.out.println("4th Fibonacci Number: " + fibonacci(4));
		System.out.println("5th Fibonacci Number: " + fibonacci(5));
		System.out.println("10th Fibonacci Number: " + fibonacci(10));
	}

	public static int fibonacci(int n) {
		if (n == 1) {
			return 1;
		} else if (n < 1) {
			return 0;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
