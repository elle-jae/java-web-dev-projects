package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AList {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;

        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbersArray = new ArrayList<>();
        numbersArray.add(1);
        numbersArray.add(2);
        numbersArray.add(3);
        numbersArray.add(4);
        numbersArray.add(5);
        numbersArray.add(6);
        numbersArray.add(7);
        numbersArray.add(8);
        numbersArray.add(9);
        numbersArray.add(10);
        System.out.println(numbersArray);
        System.out.println(sumEven(numbersArray));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int searchInput = input.nextInt();

        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        ArrayList<String> wordList = new ArrayList<>(
                Arrays.asList(words));
        for (String word : wordList)
            if (word.length() == searchInput) {
                System.out.println(word);
            }
    }
}



