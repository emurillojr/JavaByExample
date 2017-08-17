package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonthFinder {

    public static void main(String[] args) {
        System.out.println("This program accepts numeric month and prints string  month");
        InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String input;
            try {
                System.out.println("Enter numeric month (Valid number between 1 and 12 ): ");
                input = br.readLine();
                int month = Integer.parseInt(input);
                String strMonth;
            switch(month) {
                case 1:
                    strMonth = "January";
                    break;
                case 2:
                    strMonth = "February";
                    break;
                case 3:
                    strMonth = "March";
                    break;
                case 4:
                    strMonth = "April";
                    break;
                case 5:
                    strMonth = "May";
                    break;
                case 6:
                    strMonth = "June";
                    break;
                case 7:
                    strMonth = "July";
                    break;
                case 8:
                    strMonth = "August";
                    break;
                case 9:
                    strMonth = "September";
                    break;
                case 10:
                    strMonth = "October";
                    break;
                case 11:
                    strMonth = "November";
                    break;
                case 12:
                    strMonth = "December";
                    break;
                default:
                    strMonth = "Invalid Month";
            }

            System.out.println("Month " + month + " : " + strMonth);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
