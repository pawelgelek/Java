import java.util.Scanner;

public class Brudnopis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = getDouble(scanner, "Podaj pierwsza liczbe");
        double b = getDouble(scanner, "Podaj druga liczbe");
        String podaneZKonsoli = getString(scanner);
        obliczenia(a, b, podaneZKonsoli);
        wyswietlWynik(obliczenia(a,b,podaneZKonsoli));
//        System.out.println(obliczenia(a, b, podaneZKonsoli));
    }

    private static double obliczenia(double a, double b, String podaneZKonsoli) {
        switch (podaneZKonsoli) {
            case "srednia": {
                double s = (a + b) / 2;
                return s;
            }
            case "pierwiastek": {
                double p1 = Math.sqrt(a);
                double p2 = Math.sqrt(b);
                return p1;
                            }
            case "potegowanie": {
                double p3 = Math.pow(a, b);
                return p3;
            }
        }
        return obliczenia(a, b, podaneZKonsoli);
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

    private static double wyswietlWynik(double x) {
        System.out.println(x);
        return x;
    }

}

    