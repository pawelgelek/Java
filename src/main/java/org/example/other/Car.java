package org.example.other;

public class Car {
    String color;
    int year;
    int kilometre;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", kilometre=" + kilometre +
                '}';
    }
}
class Audi extends Car{
    String marka = "Audi";

    @Override
    public String toString() {
        return "Audi{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", kilometre=" + kilometre +
                '}';
    }
}
class Skoda extends Car{
    String marka = "Skoda";

    @Override
    public String toString() {
        return "Skoda{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", kilometre=" + kilometre +
                '}';
    }
}