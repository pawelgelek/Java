package org.example.other;

import java.util.ArrayList;
import java.util.Scanner;
//Zadanie:
//- utworz klase Koszyk
//-- przedmiot + ilosc + cena za przedmiot
//- wylicz sume koszyka
//- ++ pobieraj przedmiot / ilosc / cene z konsoli

//Porady:
//- przekaż do metody Liste<Koszyk>
//- w treści zadania było: "- utworz klase Koszyk -- przedmiot + ilosc + cena za przedmiot"
//Ale nie masz nigdzie klasy Koszyk, która ma produkt, cene, ilosc.

public class KoszykV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ile = podajLiczbe("Podaj ilosc produktow w koszyku: ", scanner);
        ArrayList<ProduktV2> wszystkie = new ArrayList();
        double suma = 0;
        for (int i = 0; i < ile; i++) {
            String name = podajNazwe("Podaj nazwe: ", scanner);
            Double cena = podajLiczbe2("Podaj cene produktu: ", scanner);
            Double ilosc = podajLiczbe2("Podaj liczbe sztuk: ", scanner);
            ProduktV2 produktV2 = coKupujesz(name, cena, ilosc);
            wszystkie.add(produktV2);
//            ProduktV2 produktV2 = wszystkie.get(i);
//            wypisz(produktV2,i);


            suma = suma + (ilosc * cena);
        }
        sumaWydatkow(suma);
        System.out.println(wszystkie);
    }

    public static int podajLiczbe(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        int a = scanner.nextInt();
        return a;
    }

    public static double podajLiczbe2(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        double a = scanner.nextDouble();
        return a;
    }

    public static ProduktV2 coKupujesz(String name, double price, double quantity) {
        ProduktV2 produktV2 = new ProduktV2(name, price, quantity);
//        produktV2.name = name;
//        produktV2.price = price;
//        produktV2.quantity = quantity;
        return produktV2;
    }

    public static String podajNazwe(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        String a = scanner.next();
        return a;
    }

    public static Double sumaWydatkow(double suma) {
        System.out.println("suma zakupow: " + suma);
        return suma;
    }
}
