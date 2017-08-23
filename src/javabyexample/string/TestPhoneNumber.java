package javabyexample.string;

public class TestPhoneNumber {

	public static void main(String[] args) {
		String[] telphoneNumbers = new String[10];
		telphoneNumbers[0] = "777-777-7777";
		telphoneNumbers[1] = "(777)-777-7777";
		telphoneNumbers[2] = " 777 - 777 - 7777 ";
		telphoneNumbers[3] = "7 7 7  - 777  - 7 7 77";
		telphoneNumbers[4] = "  ( 7 7 7   ) - 777 - 7777 ";
		telphoneNumbers[5] = "777-777-7777-";
		telphoneNumbers[6] = "(77)-77-777";
		telphoneNumbers[7] = "  - (777) - 7777 ";
		telphoneNumbers[8] = "7 7 7  - (777)  - 7 7 77";
		telphoneNumbers[9] = "  ( 7 c 7   ) - 777 - abcd ";
 
		for (String number : telphoneNumbers) {
			System.out
					.println(" Number: " + number + "  IsValidPhoneNumber:" + PhoneNumber.validatePhoneNumber(number));
		}
	}
}
