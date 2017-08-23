package javabyexample.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhoneNumber {
	/*
	 * Program to determine whether given phone number is in correct format
	 */
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program validates the format of the north america phone number");
			System.out.println("Please enter the phone number in XXX-XXX-XXXX format or in (XXX)-XXX-XXXX format");
			input = br.readLine();
			input = input.toUpperCase();
			boolean isValidPhoneNumber = false;
			isValidPhoneNumber = validatePhoneNumber(input);
			if (isValidPhoneNumber) {
				System.out.println("Phone number is valid");
			} else {
				System.out.println("Phone number is invalid");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	//
	public static boolean validatePhoneNumber(String input) {
		boolean isValidPhoneNumber = true;
		input = input.trim();
		int index1 = input.indexOf('-'); // find index position of first '-'
		int index2 = input.lastIndexOf('-'); // find index position of second '-'
		if (index1 == -1 || index2 == -1 || index1 >= (input.length() - 1) || index2 >= (input.length() - 1)) {
			isValidPhoneNumber = false;
		} else {
			String areaCode = input.substring(0, index1).trim();
			String exchange = input.substring(index1 + 1, index2).trim();
			String number = input.substring(index2 + 1).trim();
			/*
			 * System.out.println( "Area code: " + areaCode ); System.out.println(
			 * "Exchange: " + exchange ); System.out.println( "Number: " + number );
			 */
			if (!validateAreaCode(areaCode) || !validateNumber(exchange, 3) || !validateNumber(number, 4)) {
				isValidPhoneNumber = false;
			}
		}

		return isValidPhoneNumber;
	}

	public static boolean validateAreaCode(String areaCode) {
		boolean isvalid = true;
		int digitCount = 0;
		for (int count = 0; count < areaCode.length(); count++) {
			char tempChar = areaCode.charAt(count);
			if (tempChar >= '0' && tempChar <= '9') {
				digitCount++;
				continue;
			} else if (tempChar == ' ') {
				continue;
			} else if (count == 0 && tempChar == '(') {
				continue;
			} else if (count == (areaCode.length() - 1) && tempChar == ')') {
				continue;
			} else {
				isvalid = false;
				break;
			}
		}
		isvalid = isvalid && digitCount == 3;
		return isvalid;
	}

	public static boolean validateNumber(String number, int expectedDigitCount) {
		boolean isvalid = true;
		int digitCount = 0;
		for (int count = 0; count < number.length(); count++) {
			char tempChar = number.charAt(count);
			if (tempChar >= '0' && tempChar <= '9') {
				digitCount++;
				continue;
			} else if (tempChar == ' ') {
				continue;
			} else {
				isvalid = false;
				break;
			}
		}
		isvalid = isvalid && digitCount == expectedDigitCount;
		return isvalid;
	}
}
