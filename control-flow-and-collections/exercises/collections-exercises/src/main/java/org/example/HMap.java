package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class HMap {
    public static void main(String[] args) {
        //Create HashMap that takes in name (string) and ID numbers (integers)
        HashMap<String, Integer> roster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        Integer studentID;

        System.out.println("Enter Student Name or hit ENTER to finish.");

do {
    System.out.println("Student Name: ");
studentName = input.nextLine();
if (!studentName.equals("")) {
    System.out.println("ID Number: ");
    studentID = input.nextInt();
    roster.put(studentName,studentID);

input.nextLine();

}

    //Create Scanner for user input
} while(!studentName.equals(""));

System.out.println("Class Roster");
System.out.println(roster);

        //Use .put() to add user input to HashMap

        //Print Hashmap with student roster


    }
}
