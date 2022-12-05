package org.example.other;

import java.util.ArrayList;

public class Koszyk {
    public static void main(String[] args) {
        Produkt bulka = utworzProdukt("bulka", 5, 0.8);
        Produkt chleb = utworzProdukt("chleb", 1, 4.5);
        Produkt maslo = utworzProdukt("maslo", 1, 8.5);
        Produkt wedlina = utworzProdukt("wedlina", 1, 7.2);
        Produkt lody = utworzProdukt("lody", 1, 38);

        ArrayList<Produkt> wszystkie = new ArrayList();
        wszystkie.add(bulka);
        wszystkie.add(chleb);
        wszystkie.add(maslo);
        wszystkie.add(wedlina);
        wszystkie.add(lody);
        double suma = 0;
        for (int i = 0; i < wszystkie.size(); i++) {
            Produkt produkt = wszystkie.get(i);
            wypisz(produkt, i);
//            System.out.println("produkt[" + i + "]=" + produkt.name);
//            System.out.println("produkt[" + i + "]=" + produkt.quantity);
//            System.out.println("produkt[" + i + "]=" + produkt.price);
            suma = suma + (produkt.price * produkt.quantity);
        }
        System.out.println("suma: " + suma);


    }

    public static Produkt utworzProdukt(String name, double quantity, double price) {
        Produkt produkt = new Produkt();
        produkt.name = name;
        produkt.quantity = quantity;
        produkt.price = price;
        return produkt;
    }
    public static void wypisz(Produkt produkt, int i){
        System.out.println("produkt[" + i + "]=" + produkt.name);
        System.out.println("produkt[" + i + "]=" + produkt.quantity);
        System.out.println("produkt[" + i + "]=" + produkt.price);
//        System.out.println("produkt[" + i + "]=" + produkt);
    }
}
