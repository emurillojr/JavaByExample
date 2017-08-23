package javabyexample.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
 * ConvertCelsiusToFahrenheit class converts temperature in Celsius to temperature in Fahrenheit.
 */
public class ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {
		System.out.println("This program will convert temperature in Celcius to Fahrenheit ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("Enter temperature in Celcius : ");
			input = br.readLine();
			float tempC = Float.parseFloat(input);
			float tempF = tempC * 9 / 5 + 32;
			DecimalFormat decFormat = new DecimalFormat("0.00");
			System.out.print("Temperature in Fahrenheit : " + decFormat.format(tempF));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
