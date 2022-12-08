import java.util.Scanner;

public class Brudnopis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = getDouble(scanner, "Podaj pierwsza liczbe");
        double b = getDouble(scanner, "Podaj druga liczbe");
        String podaneZKonsoli = getString(scanner);
        obliczenia(a, b, podaneZKonsoli);
        wyswietlWynik(a,b,podaneZKonsoli);
    }

    private static void obliczenia(double a, double b, String podaneZKonsoli) {
        switch (podaneZKonsoli) {
            case "srednia": {
                double s = a + b / 2;
                break;
            }
            case "pierwiastek": {
                double p1 = Math.sqrt(a);
                double p2=Math.sqrt(b);
                break;
            }
            case "potegowanie": {
                double p3= Math.pow(a, b);
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
private static String wyswietlWynik(double a, double b, String obliczenia){
    System.out.println(obliczenia);
    return obliczenia;
}

}

    