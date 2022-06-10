package com.sparta.ay.NestedClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class SpartanApp {
    public static void main(String[] args) {
        ArrayList<String> turtles = new ArrayList<>(
                Arrays.asList("Leonardo", "Donatello", "Michelangelo", "Raphael")
        );

        ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(
                new Spartan("Manish", "Java"),
                new Spartan("Stephen", "SQL"),
                new Spartan("Danny", "Agile")
        ));

        Spartan spartan = new Spartan("Ahmed", "Java");
        //Spartan.SpartanComparator comparator = new Spartan.SpartanComparator();

        System.out.println(turtles);
        System.out.println(spartans);


    }
}
