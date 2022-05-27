package com.sparta.ay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class fibonacciTest {
    @Test
    @DisplayName("check that it returns int")
    void checkPosInt() {
        int testNumber = 1;
        Assertions.assertEquals(testNumber, fibonacci.getFibonacci(1));
    }

    @Test
    @DisplayName("check that it returns 5")
    void checkFive() {
        int testNumber = 5;
        Assertions.assertEquals(testNumber, fibonacci.getFibonacci(5));
    }

    @Test
    @DisplayName("check that it returns 144")
    void check144() {
        int testNumber = 144;
        Assertions.assertEquals(testNumber, fibonacci.getFibonacci(12));
    }

    @Test
    @DisplayName("check that it returns 0")
    void checkMinus() {
        int testNumber = 0;
        Assertions.assertEquals(testNumber, fibonacci.getFibonacci(-5));
    }

    @Test
    @DisplayName("check that it returns 0")
    void checkZero() {
        int testNumber = 0;
        Assertions.assertEquals(testNumber, fibonacci.getFibonacci(0));
    }

//    @Test
//    @DisplayName("check that the string returns an int")
//    void checkString() {
//          String testNumber = "5";
//        Assertions.assertEquals(testNumber, fibonacci.getFibonacci(5));
//    }
}