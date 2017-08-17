package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PythagoreanTripple {
    public static void main(String[] args) {
        System.out.println("This program checks whether the accepted postive integers are Pythagoream tripple");
        System.out.println("Three integers are phythagorean tripples if they satisfy the equation a^2 + b^2 = c^2 ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter Number1 (Positive integer greter than zero) : ");
            input = br.readLine();
            int num1 = Integer.parseInt(input);
            System.out.println("Enter Number2 (Positive integer greter than zero) : ");
            input = br.readLine();
            int num2 = Integer.parseInt(input);
            System.out.println("Enter Number3 (Positive integer greter than zero) : ");
            input = br.readLine();
            int num3 = Integer.parseInt(input);
        	// valid numbers for test (3,4,5) (5,12,13) (11,60,61)
            System.out.println("Entered Integers: " + num1 + "  " + num2 + "  " + num3);
            if ((Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2))
                    ||  (Math.pow(num2, 2) + Math.pow(num3, 2) == Math.pow(num1, 2 ))
                    ||  (Math.pow(num3, 2) + Math.pow(num1, 2) == Math.pow(num2, 2 ))) {
                System.out.println("The integers are pythogorean tripples ");
            }
            else {
                System.out.println("The integers are not pythogorean tripples ");
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
