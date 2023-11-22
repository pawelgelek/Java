package org.example.kolekcje;

import java.util.HashMap;
import java.util.Map;

//utworz mape wiek:imie, (np. 35:Andrzej, 40:Jozef,...)
//        -- wypisz uzytkownikow, ktorzy sa pelnoletni -> if
public class ZDomMapa2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(35, "Krzysztof");
        map.put(14, "Pawel");
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            if (entry.getKey()>=18){
                System.out.println(entry.getValue());
            }
        }

    }
}
