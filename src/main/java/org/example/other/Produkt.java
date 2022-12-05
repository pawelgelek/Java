package org.example.other;

public class Produkt extends Object{
    String  name;
    double quantity;
    double price;

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
