package org.example.other;

public class Animals {
    String rasa;
    String kolor;
    int wiek;

    @Override
    public String toString() {
        return "Animals{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
class Dog extends Animals{
        String rasa = "Dog";

    @Override
    public String toString() {
        return "Dog{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
class GermanShepard extends Dog{
String rasa = "GermanShepard";

    @Override
    public String toString() {
        return "GermanShepard{" +
                ", rasa='" + rasa + '\'' +
                ", rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
class ChowChow extends Dog{
    String rasa= "ChowChow";

    @Override
    public String toString() {
        return "ChowChow{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

class Chihuahua extends Dog{
    String rasa = "Chihuahua";

    @Override
    public String toString() {
        return "Chihuahua{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

class Beagle extends Dog{
    String rasa = "Beagle";

    @Override
    public String toString() {
        return "Beagle{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
class Cat extends Animals{
    String rasa = "Cat";

    @Override
    public String toString() {
        return "Cat{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
class Elephant extends Animals{
    String rasa = "Elephant";

    @Override
    public String toString() {
        return "Elephant{" +
                "rasa='" + rasa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
