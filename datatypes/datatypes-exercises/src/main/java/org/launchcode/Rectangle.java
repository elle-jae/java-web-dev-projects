package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int rectangleLength = input.nextInt();

        System.out.println("Enter width of rectangle: ");
        int rectangleWidth = input.nextInt();
        int rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("The area of the rectangle is " + rectangleArea);




    }
}
