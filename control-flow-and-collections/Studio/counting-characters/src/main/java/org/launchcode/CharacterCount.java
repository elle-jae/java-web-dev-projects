package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
//        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";
       Scanner input = new Scanner(System.in);
       System.out.println("Enter text: ");

       String userInput = input.nextLine().toLowerCase().replaceAll("\\s" , "");
        HashMap<Character,Integer> characterCountMap = new HashMap<>();
        for (char c : userInput.toCharArray()) {
            if (characterCountMap.containsKey(c)) {
                characterCountMap.put(c , characterCountMap.get(c)+1);
            } else {
                characterCountMap.put(c, 1);
            }
        }
for (Map.Entry <Character, Integer> entry: characterCountMap.entrySet()) {
    System.out.println(entry.getKey() + ":" + entry.getValue());
}
    }
    }
