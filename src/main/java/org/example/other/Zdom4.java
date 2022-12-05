package org.example.other;

import java.util.Scanner;

public class Zdom4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = getDouble(scanner, "Podaj pierwsza liczbe");
        double b = getDouble(scanner,"Podaj druga liczbe");
        String podaneZKonsoli = getString(scanner);
        obliczenia(a, b, podaneZKonsoli);
    }

    private static void obliczenia(double a, double b, String podaneZKonsoli) {
        switch (podaneZKonsoli) {
            case "srednia": {
                System.out.println((a + b) / 2 + " to jest srednia z podanych liczb");
                break;
            }
            case "pierwiastek": {
                System.out.println(Math.sqrt(a) + " to jest pierwiastek liczby " + a);
                System.out.println(Math.sqrt(b) + " to jest pierwiastek liczby " + b);
                break;
            }
            case "potegowanie": {
                System.out.println(Math.pow(a, b) + " to jest wynik podniesienia liczby " + a + " do potegi " + b);
                break;
            }
        }
    }

    private static String getString(Scanner scanner) {
        System.out.println("Podaj rodzaj wykonywanej operacji:");
        String podaneZKonsoli = scanner.next();
        return podaneZKonsoli;
    }

    private static double getDouble(Scanner scanner, String komunikat) {
        System.out.println(komunikat);
        return scanner.nextDouble();
    }


}
