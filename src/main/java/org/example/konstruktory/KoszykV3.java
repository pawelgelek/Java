package org.example.konstruktory;


public class KoszykV3 {
    public static void main(String[] args) {
        ProduktV3 produktV3 = new ProduktV3();
        double suma = 0;
        produktV3.setName("chleb");
        produktV3.setPrice(4.0);
        produktV3.setQuantity(3.0);
        System.out.println("Nazwa produktu: " + produktV3.getName());
        System.out.println("Cena produktu: " + produktV3.getPrice());
        System.out.println("Ilosc produktu: " + produktV3.getQuantity());
        suma = suma + (produktV3.price * produktV3.quantity);
        System.out.println("Rachunek: " + suma + " PLN");
    }
}

