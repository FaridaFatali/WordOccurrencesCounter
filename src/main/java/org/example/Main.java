package org.example;

import java.util.Scanner;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=OwhsObNvwVQ">...</a>
 * @author Farida Fatali
 * Word Occurrences Counter in Java
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();
        scanner.close();

        Content myContent = new Content(content);
        String word = "the"; // or another word you want
        System.out.println(word + ": " + myContent.getCount(word));
    }
}