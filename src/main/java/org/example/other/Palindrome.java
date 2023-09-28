package org.example.other;
//String Manipulation and Parsing: Tasks involving string manipulation, parsing, and regular expressions are common.
// Candidates might be asked to reverse a string, check for palindrome, tokenize a string, or perform other string-related operations.

//https://4programmers.net/Forum/Java/299498-porownanie_dla_wartosci_string_palindromy
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
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static boolean isPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (Character.isDigit(character) || Character.isAlphabetic(character)) {
                stringBuilder.append(character);
            }
        }
        return input.equalsIgnoreCase(stringBuilder.reverse().toString());
    }

    public static void resultPrinting(String word1) {
        if (isPalindrome(word1)) {
            System.out.println("Tak, wyraz " + word1 + " jest palindromem.");
        } else {
            System.out.println("Nie, wyraz " + word1 + " nie jest palindromem");
        }
    }
}



