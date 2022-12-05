package org.example.other;

public class SwithApp {
    public static void main(String[] args) {
//        String name = "Pawel";
        String name = "Andrzej";

        switch (name) {
            case "Pawel": {
                System.out.println("znalazlem Pawel");
                break;
            }
            // if (name.equals("Andrzej") || name.equals("Asia")
            case "Andrzej":
            case "Asia": {
                System.out.println("znalazlem Asia lub Andrzej");
            }
        }
    }
}
