package javabyexample.recursion;

//original javabyexample/loops/HCFCalculator.java
//redone using recursion

public class HCFCalculator {

	public static void main(String[] args) {
		System.out.println("HCF of 5 and 25:  " + hcf(5, 25));
		System.out.println("HCF of 8 and 28:  " + hcf(8, 28));
		System.out.println("HCF of 24 and 39: " + hcf(24, 39));
		System.out.println("HCF of 12 and 4:  " + hcf(12, 4));
		System.out.println("HCF of 4 and 12:  " + hcf(4, 12));
		System.out.println("HCF of 15 and 7:  " + hcf(15, 7));
		System.out.println("HCF of 7 and 15:  " + hcf(7, 15));
		System.out.println("HCF of 23 and 41: " + hcf(23, 41));
		System.out.println("HCF of 41 and 23: " + hcf(41, 23));
	}

	/**
	 * If num1 > num2, then hcf of num1 and num2 is same as hcf of num2 and num1 %
	 * num2
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int hcf(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return hcf(num2, num1 % num2);
		}
	}
}