package org.example.kolekcje;

import java.util.HashMap;
import java.util.Map;

public class CwiczeniaMapy {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("123", 18);
        map.put("456", 76);
        map.put("789", 55);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Pesel: "+entry.getKey());
            System.out.println("Wiek: "+entry.getValue());
        }
    }
}

