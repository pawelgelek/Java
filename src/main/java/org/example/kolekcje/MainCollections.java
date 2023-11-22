package org.example.kolekcje;

import org.example.company.Pracownik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainCollections {
    public static void main(String[] args) {
        przypadkiListy();
        przypadkiSet();
        przypadkiMapy();
    }

    private static void przypadkiMapy() {
        // pesel1: Andrzej
        // pesel2: Pawel
        HashMap<String, String> map = new HashMap<>();
        // dodawania
        map.put("123", "Andrzej");
        map.put("234", "Pawel");
        System.out.println(map);

        String wyszukane = map.get("234"); // wyszukiwanie
        System.out.println("wyszukane: " + wyszukane);
        // petla
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
//            entry.getKey() -> "123"
//            entry.getValue() -> "Andrzej"
        }
        // usuwanie
        map.remove("234");
        System.out.println(map);

        // co jak wrzucimy istniejaca wartosc
        // to nadpiszemy ja
        map.put("123", "Stefan");
        System.out.println(map);
    }

    private static void przypadkiSet() {
        // te same operacje co lista, ale unikalne elementy
        HashSet<String> sets = new HashSet<>();
        sets.add("jeden");
        sets.add("jeden");
        System.out.println(sets);
    }

    private static void przypadkiListy() {
        ArrayList<String> list = new ArrayList();
        list.add("jeden");
        list.add("dwa");
        System.out.println(list);

        list.remove("jeden"); //list.remove(1);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println(element);
//            list.remove(i); // tutaj mozemy usunac
        }

        for (String element : list) { // forma skrocona
            System.out.println(element);
        }
    }


}

/*
https://www.javatpoint.com/collections-in-java
https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

 */