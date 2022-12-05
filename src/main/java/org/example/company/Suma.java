package org.example.company;


import java.util.ArrayList;
import java.util.List;

public class Suma {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c=1;
       int suma = (a+b+c);
        System.out.println(suma);


        ArrayList<Integer> liczby = new ArrayList();
        liczby.add(a);
        liczby.add(b);
        liczby.add(c);
        int suma2 = 0;
        for (int i = 0; i <liczby.size() ; i++) {
            int l= liczby.get(i);
            suma2 = (suma2+l);
                   }

        System.out.println(suma2);
    }
}