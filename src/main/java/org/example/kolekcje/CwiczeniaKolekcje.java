package org.example.kolekcje;

import java.util.HashSet;
import java.util.Random;

public class CwiczeniaKolekcje {
    public static void main(String[] args) {
        HashSet<Integer> zadanie1 = new HashSet<>();
        zadanie1.add(new Random().nextInt());
        zadanie1.add(new Random().nextInt());
        zadanie1.add(new Random().nextInt());
        int suma = 0;
        for (Integer liczba: zadanie1){
            suma = suma + liczba;

        }
        System.out.println(suma);
    }
}
