package org.example;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }
        }
        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] eachWord = paragraph.split("\\.");
        System.out.println(Arrays.toString(eachWord));
        System.out.println(eachWord.length);
    }
}
