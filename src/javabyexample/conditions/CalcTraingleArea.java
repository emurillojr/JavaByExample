package javabyexample.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcTraingleArea {
    public static void main(String[] args) {
        System.out.println("This program accepts the sides of a triangle and calculates area");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Enter side1 : ");
            input = br.readLine();
            float side1 = Float.parseFloat(input);
            System.out.println("Enter side2: ");
            input = br.readLine();
            float side2 = Float.parseFloat(input);
            System.out.println("Enter side3: ");
            input = br.readLine();
            float side3 = Float.parseFloat(input);

            System.out.println("Numbers Entered:  " + side1 + "  " + side2 + "  " + side3);
            // sum of two sides must be greater than the other to form a triangle
            if ((side1 + side2) > side3
            		&& (side2 + side3) > side1
                    && (side3 + side1) > side2) 
            {
                float perimeter = side1 + side2 + side3;
                float p = perimeter/2;
                //Herons formula   Area = (p*(p-a)*(p-b)*(p-c))^0.5 where p is half the perimeter and a, b,
                // and c are sides of triangle
                double area = Math.sqrt((p*(p-side1)*(p-side2)*(p-side3)));
                System.out.println("Area : " + area);
            }
            else {
                System.out.println("Cannot form a closed triangle with the given sides");
            }

        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
