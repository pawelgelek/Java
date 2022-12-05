package org.example.other;

import java.util.Scanner;

public class Zdom1 {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Pierwsza liczba jest większa od drugiej");
        } else if (a == b) {
            System.out.println("Obie liczby są równe");
        } else {
            System.out.println("Druga liczba jest większa od pierwszej");
        }
    }
}