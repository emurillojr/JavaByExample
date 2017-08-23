package javabyexample.loops;

public class AlphabetsPrinter {

	public static void main(String[] args) {
		// Prints alphabets from A to Z - using ascii values
		System.out.println("Prints alphabets from A to Z ");
		for (int ch = 'A'; ch <= 'Z'; ch++) {
			// System.out.println(ch);
			System.out.println((char) ch); // cast to char and print it 65-90 ascii values
		}

	}

}
