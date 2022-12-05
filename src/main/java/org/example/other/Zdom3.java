package org.example.other;

import java.util.Scanner;

public class Zdom3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        double a = scanner.nextDouble();
        System.out.println("Podaj druga liczbe:");
        double b = scanner.nextDouble();
        System.out.println("Podaj znak wykonywanej operacji:");
        String podaneZKonsoli = scanner.next();
        switch (podaneZKonsoli) {
            case "+": {
                System.out.println(a + b + " to jest wynik dodawania");
                break;
            }
            case "-": {
                System.out.println(a - b + " to jest wynik odejmowania");
                break;
            }
            case "*": {
                System.out.println(a * b + " to jest wynik mnozenia");
                break;
            }
            case "/": {
                System.out.println(a / b + " to jest wynik dzielenia");
                break;
            }
        }
    }
}
