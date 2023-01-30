package org.example.konstruktory;

import java.util.HashSet;
import java.util.Scanner;

public class GarageV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = getNumber("Podaj liczbe samochodow w garazu: ", scanner);
        HashSet<String> cars = new HashSet<>();
        for (int i = 0; i < numberOfCars; i++) {
            String name = getName("Podaj marke samochodu: ", scanner);
            cars.add(name);
        }
        for (int j = 0; j < numberOfCars; j++) {
            String color = getName("Podaj kolor samochodu: ", scanner);
            cars.add(color);
        }
                System.out.println(cars);
    }


    public static int getNumber(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        int a = scanner.nextInt();
        return a;
    }

    public static String getName(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        String a = scanner.next();
        return a;
    }


    public static CarV3 carList(String name, String color) {
        CarV3 carV3 = new CarV3(name, color);
        return carV3;
    }
}
