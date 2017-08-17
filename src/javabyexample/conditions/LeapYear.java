package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main( String[] args ) {
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter Year: ");
            input = br.readLine();
            int year = Integer.parseInt(input);  // 2000
            if ((year % 4 == 0) && year % 100 != 0) {  // if year divisible by 4 and not divisible by 100
                System.out.println(year + " is a leap year.");
            }
            else if ((year % 400 == 0)) { // or if year divisible by 400
                System.out.println(year + " is a leap year.");
            }
            else {
                System.out.println(year + " is not a leap year.");
            }

            // boolean isLeapYear = ((year % 4 == 0) && year % 100 != 0) || (year % 400 == 0);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
