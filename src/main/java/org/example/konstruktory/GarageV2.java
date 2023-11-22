package org.example.konstruktory;

import java.util.ArrayList;
import java.util.Scanner;

public class GarageV2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int howMany = getNumber("Podaj liczbe samochodow w garazu: ", scanner);
    ArrayList<CarV2> wszystkie = new ArrayList();
    double suma = 0;
    for (int i = 0; i < howMany; i++) {
        String name = getName("Podaj marke pojazdu: ", scanner);
        int year = getNumber("Podaj rocznik pojazdu: ", scanner);
        double price = getNumber2("Podaj wartosc pojazdu: ", scanner);
        CarV2 carV2 = coWGarazu(name, year, price);
        wszystkie.add(carV2);
    }
        System.out.println(wszystkie);
}

    public static int getNumber(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        int a = scanner.nextInt();
        return a;
    }

    public static String getName(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        String a = scanner.nextLine();
        return a;
    }

    public static double getNumber2(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        double a = scanner.nextDouble();
        return a;
    }

    public static CarV2 coWGarazu(String name, int year, double price) {
        CarV2 carV2 = new CarV2(name, year, price);
        return carV2;
    }
}
