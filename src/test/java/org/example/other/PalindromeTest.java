package org.example.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PalindromeTest {
    @Test
    void isPalindrome() {
        boolean wynik = Palindrome.isPalindrome("ala");
        Assertions.assertEquals(true, wynik);
    }

    @Test
    void isntPalindrome() {
        boolean wynik = Palindrome.isPalindrome("Pawel");
        Assertions.assertEquals(false, wynik);
    }

    @ParameterizedTest
    @MethodSource()
    void shouldCheckPalindrome(boolean expectedResult, String input) {
        boolean wynik = Palindrome.isPalindrome(input);
        Assertions.assertEquals(expectedResult, wynik);
    }
}
