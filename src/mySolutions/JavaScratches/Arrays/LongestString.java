package mySolutions.JavaScratches.Arrays;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Scanner;

// https://coderbyte.com/editor/Longest%20Word:Java
public class LongestString {

    public static final String REGEX_STRING = "[^A-Za-z0-9]";

    public static String longestWord(String sen) {
        String[] words = sen.split(" ");
        String longest = "";

        for(String word : words) {
            word = Normalizer.normalize(word, Form.NFD);
            word = word.replaceAll(REGEX_STRING, "");

            if ( word.length() > longest.length() ) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        System.out.println(longestWord(scanner.nextLine()));
        scanner.close();
    }
}
