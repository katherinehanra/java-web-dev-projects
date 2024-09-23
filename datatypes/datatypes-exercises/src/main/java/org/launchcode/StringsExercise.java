package org.launchcode;
import java.util.Scanner;


public class StringsExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String snippet = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’\n" +
                "\n";
        System.out.println(snippet);
        System.out.println("Pick a term to search within the book snippet:");
        String termSelection = input.nextLine();
        System.out.println(snippet.toLowerCase().contains(termSelection.toLowerCase()));
    }
}
