package com.sparta.ay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class arrayPracticeTest {

    @Test
    @DisplayName("check that it returns a number")
    void checkNumberReturn() {

        int[] actual = {52, 68, 87, 14, 22, 2, 1};

        Assertions.assertEquals(68, arrayPractice.myMethod(actual));
    }

    @Test
    @DisplayName("check that it returns a number")
    void checkSecondHigh() {

        int[] actual = {52, 68, 87, 14, 22, 2, 1};

        Assertions.assertEquals(68, arrayPractice.myMethod(actual));
    }

}
