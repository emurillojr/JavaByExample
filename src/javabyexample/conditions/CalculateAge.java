package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculateAge {
    public static void main(String[] args) {
        System.out.println("This program accepts date of birth and calculates age");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter Year of Birth (> 1900, Enter four digits): ");
            input = br.readLine();
            int year = Integer.parseInt(input);
            System.out.println("Enter Month of Birth (1-12): ");
            input = br.readLine();
            int month = Integer.parseInt(input);
            System.out.println("Enter day of birth (1- 31): ");
            input = br.readLine();
            int day = Integer.parseInt(input);

            System.out.println("Date of Birth (mm-dd-yyyy) : " + month + "-" + day + "-" + year);
            LocalDate today = LocalDate.now();  // Obtains the current date from the system clock in the default time-zone.
            LocalDate birthday = LocalDate.of(year, month, day); // Obtains an instance of LocalDate from a year, month and day.
            Period period = Period.between(birthday, today); // Obtains a Period consisting of the number of years, months, and days between two dates.
            System.out.println("Age: "
                                + period.getYears() + " years "
                                + period.getMonths() + " months and "
                                + period.getDays() + " days ");
            long p2 = ChronoUnit.DAYS.between(birthday, today);
            System.out.println("You have been on alive for " + p2 + " days");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
