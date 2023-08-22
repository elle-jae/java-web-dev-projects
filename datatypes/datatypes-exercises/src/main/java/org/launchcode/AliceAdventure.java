package org.launchcode;

import java.util.Scanner;

public class AliceAdventure {
    public static void main(String[] args) {
        String paragraphText = "alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or" +
                " conversations in it, ‘and what is the use of a book,’" +
                " thought alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Search Word ");
        String searchTerm = input.nextLine().toLowerCase();
        String updatedParagraphText = paragraphText.replaceAll(searchTerm, "");

        if(paragraphText.contains(searchTerm)) {
            System.out.println(searchTerm + " is in the paragraph. " + searchTerm + " is at index " + paragraphText.indexOf(searchTerm) + " and has a length of " + searchTerm.length());
            System.out.println(updatedParagraphText);
        } else {
            System.out.println(searchTerm + " is NOT in the paragraph.");

        }


    }
}
