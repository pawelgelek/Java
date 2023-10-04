package org.example.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @Test
    void isPalindromeNumbers() {
        boolean wynik = Palindrome.isPalindrome("1");
        Assertions.assertEquals(true, wynik);
    }

    @ParameterizedTest
    @MethodSource("provideTestsForPalindrome")
    void shouldCheckPalindrome(String input, boolean expectedResult) {
        boolean wynik = Palindrome.isPalindrome(input);
        Assertions.assertEquals(expectedResult, wynik);
    }

    private static Stream<Arguments> provideTestsForPalindrome() {
        return Stream.of(
                Arguments.of("1", true),
                Arguments.of("12", false),
                Arguments.of("5", true)
        );
    }


}
