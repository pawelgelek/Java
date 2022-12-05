package org.example.other;

import java.util.Scanner;

public class Zdom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ile = podajLiczbe("Podaj ile razy mam porownać:", scanner);
        for (int i = 0; i < ile; i++) {

            int a = podajLiczbe("Podaj pierwsza liczbe:", scanner);
            int b = podajLiczbe("Podaj druga liczbe:", scanner);
            wskazWiekszaLiczbe(a, b);
        }
    }

    private static int podajLiczbe(String x, Scanner scanner) {
        System.out.println(x);
        int a = scanner.nextInt();
        return a;
    }

    private static void wskazWiekszaLiczbe(int a, int b) {
        if (a > b) {
            System.out.println("Pierwsza liczba jest wieksza od drugiej");
        } else if (a == b) {
            System.out.println("Obie liczby sa rowne");
        } else {
            System.out.println("Druga liczba jest wieksza od pierwszej");
        }
    }
}