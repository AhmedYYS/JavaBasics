package com.sparta.ay;

public class fibonacci {

//    public static void main(String[] args) {
//        System.out.println(getFibonacci(50));
//    }

    public static int getFibonacci(int fibNum) {

        if (fibNum <= -1) {
            return 0;
        }

        if (fibNum <= 1)
            return fibNum ;

        return getFibonacci(fibNum - 1) + getFibonacci(fibNum - 2);
    }
}
