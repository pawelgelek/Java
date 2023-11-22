package org.example.kolekcje;
//utworz mape Pesel:User(imie, wiek), wypisz wszystkie pesele i osoby(toString)


import java.util.HashMap;
import java.util.Map;

public class ZDomMapa1 {
    public static void main(String[] args) {
        HashMap<String, Mapa1User> map = new HashMap<>();
        Mapa1User user1 = new Mapa1User();
        user1.wiek = 34;
        user1.name = "Pawel";
        map.put("88010103756",user1);
        Mapa1User user2 = new Mapa1User();
        user2.wiek = 48;
        user2.name = "Ala";
        map.put("78111203798",user2);
        Mapa1User user3 = utworzUser("Jan",55);

//        map.put("Sylwia", "85050502159");
        for (Map.Entry<String, Mapa1User> entry : map.entrySet()) {
            System.out.println("PESEL: " + entry.getKey());
            System.out.println("User: " + entry.getValue());
        }

    }
    public static Mapa1User utworzUser(String name, int wiek) {
        Mapa1User user = new Mapa1User();
        user.wiek = wiek;
        user.name = name;
        return user;
    }
}
