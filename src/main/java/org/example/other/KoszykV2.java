package org.example.other;

import java.util.Scanner;

public class KoszykV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ile = podajLiczbe("Podaj ilosc produktow w koszyku: ", scanner);
        for (int i = 0; i <ile; i++)

        System.out.println("Podaj nazwe produktu: ");

//        String nextLine = scanner.nextLine();
//        System.out.println("Podaj liczbe sztuk: ");
//        double a = scanner.nextDouble();
//        System.out.println("Podaj cene: ");
//        double b = scanner.nextDouble();
    }

    public static int podajLiczbe(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        int a = scanner.nextInt();
        return a;
    }

    public static Produkt utworzProdukt(String name, double quantity, double price) {
        Produkt produkt = new Produkt();
        produkt.name = name;
        produkt.quantity = quantity;
        produkt.price = price;
        return produkt;
    }
}
