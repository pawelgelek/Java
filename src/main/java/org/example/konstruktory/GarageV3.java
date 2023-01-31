package org.example.konstruktory;

import java.util.HashSet;
import java.util.Scanner;
//zadanie 2:
//        - utworz set z lista samochodow uzytkownika Car(name, color)
//        -- pobierze name i color z konsoli
//        -- korzystaj z konsturktorow, gettery i settery
public class GarageV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = getNumber("Podaj liczbe samochodow w garazu: ", scanner);
        HashSet<CarV3> cars = new HashSet<>();
        for (int i = 0; i < numberOfCars; i++) {
            String name = getName("Podaj marke samochodu: ", scanner);
            String color = getName("Podaj kolor samochodu: ", scanner);
            CarV3 carV3 = createCar(name, color);
            cars.add(carV3);
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


    public static CarV3 createCar(String name, String color) {
        CarV3 carV3 = new CarV3(name, color);
        return carV3;
    }
}
