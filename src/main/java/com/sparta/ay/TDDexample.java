package com.sparta.ay;

public class TDDexample {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(getTotal(numbers));
    }
    public static int getTotal(int[] values) {
        int totalValue = 0;

        if (values == null) {
            return totalValue;
        }

        for (int i = 0; i < values.length; i++) {
            totalValue += values[i];
        }
        return totalValue;
    }

}
