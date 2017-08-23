package javabyexample.basic;

public class SwapNumbers {

	public static void main(String[] args) {
		int num1 = 78;
		int num2 = 135;
		System.out.println("Before Swap: ");
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap: ");
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2);

	}

}
