package org.example.other;

public class ProduktV2 {
    String name;
    double price;
    double quantity;

    public ProduktV2(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProduktV2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Uwaga! Cena musi byc wieksza niz 0!");
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setQuantity(Double quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Uwaga! Ilosc produktu musi byc wieksza niz 0!");
        }
    }

    public Double getQuantity() {
        return quantity;
    }
}
