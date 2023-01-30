package org.example.konstruktory;

public class CarV3 {
    String name;
    String color;

    @Override
    public String toString() {
        return "CarV3{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public CarV3(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
