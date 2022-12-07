package org.example.other;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Dog amstaff = utworzDog("Amstaff", "brazowy", 4);
        Dog germanShepard = utworzDog("GermanShepard", "czarny", 10);
        Dog chowChow = utworzDog("ChowChow", "niebieski", 12);
        var chihuahua = utworzDog("Chihuahua", "rudy", 15);
        var beagle = utworzDog("Beagle", "cetkowany", 14);
        Cat ragdoll = utworzCat("Ragdoll", "czarny", 2);
        Elephant afrykanski = utworzElephant("afrykanski", "szary", 60);


        ArrayList<Animals> wszystkie = new ArrayList();
        wszystkie.add(amstaff);
        wszystkie.add(germanShepard);
        wszystkie.add(chowChow);
        wszystkie.add(chihuahua);
        wszystkie.add(beagle);
        wszystkie.add(ragdoll);
        wszystkie.add(afrykanski);
        for (int i = 0; i < wszystkie.size(); i++) {
            Animals animals = wszystkie.get(i);
            System.out.println(animals);
        }
    }

    public static Dog utworzDog(String rasa, String kolor, int wiek) {
        Dog dog = new Dog();
        dog.rasa = rasa;
        dog.kolor = kolor;
        dog.wiek = wiek;
        return dog;
    }

    public static Cat utworzCat(String rasa, String kolor, int wiek) {
        Cat cat = new Cat();
        cat.rasa = rasa;
        cat.kolor = kolor;
        cat.wiek = wiek;
        return cat;
    }

    public static Elephant utworzElephant(String rasa, String kolor, int wiek) {
        Elephant elephant = new Elephant();
        elephant.rasa = rasa;
        elephant.kolor = kolor;
        elephant.wiek = wiek;
        return elephant;
    }
}
