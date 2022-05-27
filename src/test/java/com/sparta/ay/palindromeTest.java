package com.sparta.ay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class palindromeTest {

    @Test
    @DisplayName("check that a string is returned")
    void checkStringReturn() {
        Assertions.assertEquals((false), palindrome.isPalindrome(""));
    }

    @Test
    @DisplayName("check that a string is 3 or more")
    void checkThreeOrMore() {
        Assertions.assertEquals((true), palindrome.isPalindrome("madam"));
    }

    @Test
    @DisplayName("check that a palindrome is returned")
    void checkPalindrome() {
        Assertions.assertEquals("Eye is the longest Palindrome", palindrome.palindromeChecker("Eye"));
    }

    @Test
    @DisplayName("check that a palindrome is returned")
    void checkNotPalindrome() {
        Assertions.assertEquals("Ahmed isn't a Palindrome", palindrome.palindromeChecker("Ahmed"));
    }

    @Test
    @DisplayName("check that a palindrome is returned from a sentence")
    void checkSentence() {
        Assertions.assertEquals( "racecar radar ", palindrome.longestPalindrome("I have a fast racecar that has a radar"));
    }

}
