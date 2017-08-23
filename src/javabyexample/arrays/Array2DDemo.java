package javabyexample.arrays;

public class Array2DDemo {

	public static void main(String[] args) {
		// Initialize array [row][column]
		int[][] data = { { 10, 2 }, { 3, 5 }, { 6, 8 }, { 12, 4 }, { 9, 2 } };

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				System.out.println(" Data --> Row: " + row + " Col: " + col + "       Value: " + data[row][col]);
			}
		}

		System.out.println(" Element at index 3 and 1 is " + data[3][1]);
	}
}
