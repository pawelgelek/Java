package org.example.other;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = utworzDog("Amstaff", "brazowy", 4);
        Dog dog1 = utworzDog("GermanShepard", "czarny", 10);
        Dog dog2 = utworzDog("ChowChow", "niebieski", 12);
        Dog dog3 = utworzDog("Chihuahua", "rudy", 15);
        Dog dog4 = utworzDog("Beagle", "cetkowany", 14);
        Cat cat = utworzCat("Ragdoll", "czarny", 2);
        Elephant elephant = utworzElephant("afrykanski", "szary", 60);


        ArrayList<Animals> wszystkie = new ArrayList();
        wszystkie.add(dog);
        wszystkie.add(dog1);
        wszystkie.add(dog2);
        wszystkie.add(dog3);
        wszystkie.add(dog4);
        wszystkie.add(cat);
        wszystkie.add(elephant);
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
