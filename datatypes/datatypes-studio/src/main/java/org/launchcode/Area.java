package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        boolean validEntry = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter radius: ");
                double radius = input.nextDouble();

                if (radius > 0) {
                    double area = Circle.getArea(radius);
                    System.out.println(area);
                    validEntry = true;
                } else {
                    System.out.println("Not a valid entry. Enter a positive number");
                }
            }
         catch(Exception e){
                System.out.println("Not a valid entry. Enter a positive number");
            }
        }
        while (!validEntry);

} }


