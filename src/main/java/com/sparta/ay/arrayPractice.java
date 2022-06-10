package com.sparta.ay;

import com.sparta.ay.SortManager.BubbleSorter.bubbleSort;
import com.sparta.ay.logging.LogConfiguration;

import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;

public class arrayPractice {
    public static final Logger aLog = Logger.getLogger("my logger");
    static int myMethod(int[] numbers) {

        int nl = numbers.length;
        int result = 0;

        bubbleSort.bubbly(numbers);
        for (int i = 0; i < nl - 1; i++) {
            aLog.setLevel(Level.ALL);
            aLog.log(Level.INFO, "this is being looped in green");
            aLog.log(Level.WARNING, "this is being looped in yellow");
            aLog.log(Level.FINE, "this is being looped in grey");
            result = (int) Array.get(numbers, i);
        }
        return result;
    }

    public static void main(String[] args) {
        LogConfiguration.logConfig();


        int [] numbers = {500, 400, 52, 65, 1, 4, 72};
        System.out.println(myMethod(numbers));
    }

}
