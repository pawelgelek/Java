package org.example.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Sortowanie {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 1000; i++) {
            int number = random.nextInt(10000);
            numbers.add(number);
        }
        System.out.println("Nieposortowane: " + numbers);
        Collections.sort(numbers);
        System.out.println("Posortowane rosnaco: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Posortowane malejaco: " + numbers);
//        int number1 = random.nextInt(10000);
//        int number2 = random.nextInt(10000);
//        int number3 = random.nextInt(10000);
//        int number4 = random.nextInt(10000);
//        int number5 = random.nextInt(10000);
//        int number6 = random.nextInt(10000);
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
//        System.out.println(number4);
//        System.out.println(number5);
//        System.out.println(number6);
    }

}
//     ArrayList<Integer> prices = new ArrayList<>();
//        prices.add(1); //,3,5,6,7,9,11,32,35,44
//        prices.add(3);
//        prices.add(7);
//        prices.add(8);
//        prices.add(5);
//        prices.add(44);
//        prices.add(9);
//        prices.add(6);
//        prices.add(11);
//        prices.add(35);
//        prices.add(32);
//        System.out.println("Nieposortowane: " + prices);
//        Collections.sort(prices);
//        System.out.println("Posortowane rosnaco: " + prices);
//        Collections.reverse(prices);
//        System.out.println("Posortowane malejaco: " + prices);
