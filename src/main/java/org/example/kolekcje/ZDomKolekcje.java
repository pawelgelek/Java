package org.example.kolekcje;

import java.util.HashSet;
import java.util.Scanner;

public class ZDomKolekcje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = podaneZKonsoli("Podaj imie: ", scanner);
        String name2 = podaneZKonsoli("Podaj imie: ", scanner);
        String name3 = podaneZKonsoli("Podaj imie: ", scanner);
        String name4 = podaneZKonsoli("Podaj imie: ", scanner);
        String name5 = podaneZKonsoli("Podaj imie: ", scanner);

        HashSet<String> imie = new HashSet<>();
        imie.add(name1);
        imie.add(name2);
        imie.add(name3);
        imie.add(name4);
        imie.add(name5);
        System.out.println(imie);
    }

    public static String podaneZKonsoli(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        String a = scanner.nextLine();
        return a;
    }
}
