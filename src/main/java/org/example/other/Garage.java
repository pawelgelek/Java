package org.example.other;

import java.util.ArrayList;

public class Garage {
    public static void main(String[] args) {
        var audi = utworzAudi("red", 2017, 52367);
        Skoda skoda = utworzSkoda("blue", 2018, 68716);

        ArrayList<Car> wszystkie = new ArrayList();
        wszystkie.add(audi);
        wszystkie.add(skoda);
        for (int i = 0; i < wszystkie.size(); i++) {
            Car car = wszystkie.get(i);
            System.out.println(car);

        }
    }

    public static Car utworzCar(String color, int year, int kilometre) {
        Car car = new Car();
        car.color = color;
        car.year = year;
        car.kilometre = kilometre;
        return car;
    }

    public static Audi utworzAudi(String color, int year, int kilometre) {
        Audi audi = new Audi();
//        Car audi = new Audi(); (Audi audi = new Audi(); - moje konkretne Audi, którym jeżdżę.); (Car audi = new Audi(); - Samochod dla Pani w urzedzie.)
        audi.color = color;
        audi.year = year;
        audi.kilometre = kilometre;
        return audi;
    }

    public static Skoda utworzSkoda(String color, int year, int kilometre) {
        Skoda skoda = new Skoda();
        skoda.color = color;
        skoda.year = year;
        skoda.kilometre = kilometre;
        return skoda;
    }
}
