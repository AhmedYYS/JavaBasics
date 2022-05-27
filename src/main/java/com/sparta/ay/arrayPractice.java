package com.sparta.ay;

import java.lang.reflect.Array;

public class arrayPractice {

    static int myMethod(int[] numbers) {
        int nl = numbers.length;
        int result = 0;

        bubbleSort.bubbly(numbers);
        for (int i = 0; i < nl - 1; i++) {
            result = (int) Array.get(numbers, i);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] numbers = {500, 400, 52, 65, 1, 4, 72};
        System.out.println(myMethod(numbers));
    }

}
