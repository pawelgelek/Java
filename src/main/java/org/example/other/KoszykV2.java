package org.example.other;

import java.util.Scanner;

public class KoszykV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ile = podajLiczbe("Podaj ilosc produktow w koszyku: ", scanner);
        double suma = 0;
        for (int i = 0; i < ile; i++) {
            String produkt = coKupujesz("Podaj nazwe produktu: ", scanner);
            Double ilosc = podajLiczbe("Podaj liczbe sztuk: ", scanner);
            Double cena = podajLiczbe("Podaj cene produktu: ", scanner);
            suma = suma + (ilosc * cena);
        }
        System.out.println("suma zakupow: " + suma);
    }

    public static double podajLiczbe(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        double a = scanner.nextDouble();
        return a;
    }

    public static String coKupujesz(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        String a = scanner.next();
        return a;
    }

    public static double sumaWydatkow(double ilosc, double cena) {
        System.out.println("suma zakupow: " + ilosc * cena);
        return cena;
    }
}
