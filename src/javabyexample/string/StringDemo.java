package javabyexample.string;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * int num1 = 5; int num2 = 5;
		 * 
		 * if( num1 == num2 ) { System.out.println( "Two numbers are equal" ); } else {
		 * System.out.println( "Two numbers are not equal" ); }
		 */

		String str1 = "Sunday";
		String str2 = "Sunday";

		if (str1 == str2) {
			System.out.println("Two Strings are same");//
		}
		if (str1.equals(str2)) {
			System.out.println("Two Strings are same");//
		} else {
			System.out.println("Two Strings are not same");
		}

		String str3 = new String("Sunday");
		String str4 = new String("Sunday");

		if (str3 == str4) {
			System.out.println("Two new Strings are same");
		} else {
			System.out.println("Two new Strings are not same");//
		}

		if (str3.equals(str4)) {
			System.out.println("Equals Method: Two new Strings are same");//
		} else {
			System.out.println("Equals Method: Two new Strings are not same");
		}

		String name = "My name John Adams";
		System.out.println("Name: " + name);
		System.out.println("Length: " + name.length());
		System.out.println("SubString: " + name.substring(10)); // "hn Adams"
		System.out.println("Substring: " + name.substring(2, 8)); // " name "

		StringBuffer name2 = new StringBuffer("My name is John Adams");
		name2.append(" . Hello World!");
		System.out.println("Name2: " + name2.toString());

	}

}
