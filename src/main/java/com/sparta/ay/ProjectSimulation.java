package com.sparta.ay;

public class ProjectSimulation {

    public static void main(String[] args) {
        System.out.println(generateTrainees(16));

    }

    public static int generateTrainees(int x) {
        int randomTrainees = 0;
        int randomSum = 50 + (int)(Math.random() * ((100 - 50) + 1));

        for(int i = 0; i < x; i++) {
            randomTrainees += randomSum;
        }
        return randomTrainees;
    }

}
