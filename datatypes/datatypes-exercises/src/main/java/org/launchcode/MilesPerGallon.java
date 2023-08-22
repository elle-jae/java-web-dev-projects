package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        int milesDriven = input.nextInt();
        System.out.println("Enter gallons of gas consumed: ");
        int gasConsumed = input.nextInt();
        int milesPerGallon = milesDriven/gasConsumed;
        System.out.println("Miles-per-gallon: " + milesPerGallon);

    }
}
