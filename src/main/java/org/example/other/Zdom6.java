package org.example.other;

import java.util.Scanner;

public class Zdom6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zdanie = podaneZKonsoli("Podaj zdanie, ktore bedziemy sprawdzac: ", scanner);
        String wyraz = podaneZKonsoli("Podaj wyraz, ktory bedziemy szukac.", scanner);
        wyszukaj(zdanie, wyraz);
//        if (zdanie.contains(wyraz)) {
//            System.out.println("Tak, wyraz " + wyraz + " znajduje sie w podanym zdaniu.");
//        } else {
//            System.out.println("Nie, wyrazu " + wyraz + " nie ma w podanym zdaniu.");
//        }

//        String MyString = "Ala ma kota, czy kot ma Ale?";
//        if (MyString.contains("kot")) {
//            System.out.println("Tak");
//        }else {
//            System.out.println("Nie");
//        }
    }

    public static String podaneZKonsoli(String komunikat, Scanner scanner) {
        System.out.println(komunikat);
        String a = scanner.nextLine();
        return a;
    }

    public static void wyszukaj(String zdanie, String wyraz) {
        if (zdanie.contains(wyraz)) {
            System.out.println("Tak, wyraz " + wyraz + " jest w podanym zdaniu.");
        } else {
            System.out.println("Nie, wyrazu " + wyraz + " nie ma w podanym zdaniu.");
        }
    }
}
