package org.example.other;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = podajLiczbe("Podaj liczbe: ", scanner);
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
        String rezultat = fizzBuzz(i);
        System.out.println(rezultat);
    }

    private static int podajLiczbe(String x, Scanner scanner) {
        System.out.println(x);
        int a = scanner.nextInt();
        return a;
    }

    public static String fizzBuzz(Integer i) {
        String rezultat;
        if (i % 3 == 0 && i % 5 == 0) {
            rezultat = "FizzBuzz";
        } else if (i % 3 == 0) {
            rezultat = "Fizz";
        } else if (i % 5 == 0) {
            rezultat = "Buzz";
        } else {
            rezultat = (String.valueOf(i));
        }
        return rezultat;
    }
}
