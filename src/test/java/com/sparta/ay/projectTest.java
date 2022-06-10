package com.sparta.ay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class projectTest {

    @Test
    @DisplayName("check that it returns a number")
    void checkNumberReturn() {

        int var1 = ProjectSimulation.generateTrainees(1);
        int var2 = ProjectSimulation.generateTrainees(1);

        Assertions.assertEquals(false, var1 == var2);
    }


}
