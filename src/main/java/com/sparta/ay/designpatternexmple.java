package com.sparta.ay;

public class designpatternexmple {
    private designpatternexmple(){


    }




    public static void main(String[] args) {
        //designpatternexmple jane = new designpatternexmple();

        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[100]);
        }   catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("You have entered something crazy");
        }

    }








}
