package org.example.other;

//import java.util.Scanner;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println("wynik="+a+b);
        System.out.println(a+b+" to jest wynik");
    }
}
