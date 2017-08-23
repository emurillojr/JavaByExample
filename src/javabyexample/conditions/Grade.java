package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Grade {

	public static void main(String[] args) {
		System.out.println("This program accepts score and evaluates grade");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("Enter Score (Valid integer Score between 0 and 100): ");
			input = br.readLine();
			int score = Integer.parseInt(input);
			String grade;
			/*
			 * if (score >= 90) { grade = "A"; } 
			 * else if (score >= 80 && score < 90) { grade = "B"; } 
			 * else if (score >= 70 && score < 80) { grade = "C"; } 
			 * else if (score >= 60 && score < 70) { grade = "D"; } 
			 * else { grade = "F"; }
			 */
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("Score: " + score + "  Grade: " + grade);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
