package org.example.other;
//String Manipulation and Parsing: Tasks involving string manipulation, parsing, and regular expressions are common.
// Candidates might be asked to reverse a string, check for palindrome, tokenize a string, or perform other string-related operations.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = getString("Podaj wyraz, ktory bedziemy sprawdzac: ", scanner);
        resultPrinting(word1);
//        if (isPalindrome(word1)) {
//            System.out.println("Tak, wyraz " + word1 + " jest palindromem.");
//        } else {
//            System.out.println("Nie, wyraz " + word1 + " nie jest palindromem");
//        }
    }

    public static String getString(String message, Scanner scanner) {
        System.out.println(message);
        String a = scanner.nextLine();
        return a;
    }

    public static boolean isPalindrome(String word1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if (Character.isDigit(c) || Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }
        return word1.equals(stringBuilder.reverse().toString());
    }

    public static void resultPrinting(String word1) {
        if (isPalindrome(word1)) {
            System.out.println("Tak, wyraz " + word1 + " jest palindromem.");
        } else {
            System.out.println("Nie, wyraz " + word1 + " nie jest palindromem");
        }
    }
}



