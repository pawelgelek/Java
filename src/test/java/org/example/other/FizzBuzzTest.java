package org.example.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void dlaJedynki() {
        String wynik = FizzBuzz.fizzBuzz(1);
        Assertions.assertEquals("1", wynik);
    }

    @Test
    void dlaTrojki() {
        String wynik = FizzBuzz.fizzBuzz(3);
        Assertions.assertEquals("Fizz", wynik);
    }

    @Test
    void dlaPiatki() {
        String wynik = FizzBuzz.fizzBuzz(5);
        Assertions.assertEquals("Buzz", wynik);
    }

    @Test
    void dlaPietnastki() {
        String wynik = FizzBuzz.fizzBuzz(15);
        Assertions.assertEquals("FizzBuzz", wynik);
    }

    @Test
    void dlaLiczbyPierwszej() {
        String wynik = FizzBuzz.fizzBuzz(7);
        Assertions.assertEquals("7", wynik);
    }

    @Test
    void dlaZera() {
        String wynik = FizzBuzz.fizzBuzz(0);
        Assertions.assertEquals("0", wynik); //tu cos nie dziala, w wyniku spodziewa sie "0" a jest "FizzBuzz"
    }

    @Test
    void dlaDziwnychWartosci() {
        Assertions.assertThrows(NullPointerException.class, () -> FizzBuzz.fizzBuzz(null));
    }

    @Test
    void dlaLiczbyUjemnej() {
        String wynik = FizzBuzz.fizzBuzz(-3);
        Assertions.assertEquals("Fizz", wynik);
    }
}
//    void czyMozenieDziala() {
//        Calculator calculator = new Calculator();
//        Integer wynik = calculator.multi(2, 2);
//        Assertions.assertEquals(4, wynik);
//    }