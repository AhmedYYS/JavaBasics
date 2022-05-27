package com.sparta.ay;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

//TDD - red, green, refactor
//1. The test will fail
//2. Write JUST enough code to make the test pass
//3. Refactor so that all tests still pass


public class TDDtest {

    @Test
    @DisplayName("check that {1} returns 1")
    void checkSingleReturn() {
        Assertions.assertEquals(1, TDDexample.getTotal(new int[]{1}));
    }

    @Test
    @DisplayName("check that {1, 2} returns 3")
    void checkTotal() {
        Assertions.assertEquals(3, TDDexample.getTotal(new int[]{1, 2}));
    }

    @Test
    @DisplayName("check that null returns zero")
    void checkZero() {
        Assertions.assertEquals(0, TDDexample.getTotal(null));
    }

    @Test
    @DisplayName("check that {-3, 2} returns negative")
    void checkNegative() {
        Assertions.assertEquals(-1, TDDexample.getTotal(new int[]{-3, 2}));
    }

    @Test
    @DisplayName("check that {-3, -4} returns negative")
    void checkDoubleNegative() {
        Assertions.assertEquals(-7, TDDexample.getTotal(new int[]{-3, -4}));
    }


    @Test
    @DisplayName("check that {MAX, MAX, 1} returns -1")
    void checkMAX() {
        Assertions.assertEquals(-1, TDDexample.getTotal(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 1}));
    }

}
