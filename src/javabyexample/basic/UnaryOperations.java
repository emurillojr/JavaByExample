package javabyexample.basic;

public class UnaryOperations {

	public static void main(String[] args) {
		int num1 = 12;
        int num2 = 0;
        System.out.println("Number1: " + num1 + "  Number2: " + num2);
        num1++;  // num1 = num1 + 1;
        System.out.println("After executing num1++.  Number1: " + num1 + "  Number2: " + num2);
        num1--; // num1 = num1 - 1;
        System.out.println("After executing num1--.  Number1: " + num1 + "  Number2: " + num2);
        --num1;
        System.out.println("After executing --num1.  Number1: " + num1 + "  Number2: " + num2);
        ++num1;
        System.out.println("After executing ++num1.  Number1: " + num1 + "  Number2: " + num2);
        System.out.println();
        num2 = num1++;   //Pre increment assignment  num2 = num1; num1 =  num1 + 1;  first you assign, then increment the number
        System.out.println("After executing num2 = num1++.  Number1: " + num1 + "  Number2: " + num2);
        System.out.println();
        num2 = ++num1;   //Post increment assignment  num1 = num1 + 1;  num2 = num1;  first you increment the number, then assign the number
        System.out.println("After executing num2 = ++num1.  Number1: " + num1 + "  Number2: " + num2);

	}

}
