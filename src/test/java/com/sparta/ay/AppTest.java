package com.sparta.ay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    @DisplayName("check that 5 is equal to 5")
    void simpleTest() {
        Assertions.assertEquals(true, 5 == 5);
    }
    @Test
    @DisplayName("check that we can return Good Morning")
    void checkTest() {
        Assertions.assertEquals("Good Morning", App.greeting(6));
    }

    @Test
    @DisplayName("check that we can return Good Afternoon")
    void checkTest2() {
        Assertions.assertEquals("Good Afternoon", App.greeting(15));
    }

    @Test
    @DisplayName("check that we can return Good Evening")
    void checkTest3() {
        Assertions.assertEquals("Good Evening", App.greeting(20));
    }

    @Test
    @DisplayName("check valid is equal to null")
    void checkTest4() {
        Assertions.assertEquals("Null", App.greeting(25));
    }
}
