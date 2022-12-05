package org.example.other;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Zdom5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = podajLiczbe("Podaj liczbe, ktorej oblicze pierwiastek: ", scanner);
        pierwiastkuj(a);
//        System.out.println("Podaj liczbe, ktorej oblicze pierwiastek: ");
//        double a = scanner.nextDouble();
//        System.out.println("Pierwiastek liczby " + a + " jest rowny: " + sqrt(a));
    }

    public static double podajLiczbe(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        double a = scanner.nextDouble();
        return a;
    }

    public static double pierwiastkuj(double a) {
        System.out.println("Pierwiastek liczby "+a+" jest rowny: "+sqrt(a));
        return a;
    }

    // commit przykład
}
