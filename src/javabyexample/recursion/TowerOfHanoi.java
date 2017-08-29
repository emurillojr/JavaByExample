package javabyexample.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int numberOfDiscs = 5;
		moveDiscs(numberOfDiscs, "A", "B", "C");
	}

	public static void moveDiscs(int n, String start, String intermediate, String end) {
		if (n == 1) {
			// Moved nth disc to the end pole
			System.out.println("Move " + n + " disc from " + start + "  to " + end);
		} else {
			// Move n-1 discs from start pole to the intermediate pole
			moveDiscs(n - 1, start, end, intermediate);
			// Moved nth disc to the end pole
			System.out.println("Move " + n + " disc from " + start + "  to " + end);
			// Moved n-1 discs from intermediate pole to end pole
			moveDiscs(n - 1, intermediate, start, end);
		}
	}
}
