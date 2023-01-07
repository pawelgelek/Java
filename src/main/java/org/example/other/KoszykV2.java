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
        ProduktV2 produktV2 = coKupujesz();
        ArrayList<ProduktV2> wszystkie = new ArrayList();
        wszystkie.add(produktV2);
        double suma = 0;
        for (int i = 0; i < ile; i++) {
            ProduktV2 produktV2 = wszystkie.get(i);
            wypisz(produktV2,i);


//            Double cena = podajLiczbe("Podaj cene produktu: ", scanner);
//            Double ilosc = podajLiczbe("Podaj liczbe sztuk: ", scanner);
//            suma = suma + (ilosc * cena);
        }
//        sumaWydatkow(suma);
    }

    public static int podajLiczbe(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        int a = scanner.nextInt();
        return a;
    }

    public static ProduktV2 coKupujesz(String name, double price, double quantity) {
        ProduktV2 produktV2 = new ProduktV2();
        produktV2.name = name;
        produktV2.price = price;
        produktV2.quantity = quantity;
        return produktV2;
    }

//    public static Double sumaWydatkow(double suma) {
//        System.out.println("suma zakupow: " + suma);
//        return suma;
//    }
}
