package com.sparta.ay.Generics;

public class GenericFinder {

    private static <T> boolean findInArray(T[] arrayToCheck, T objectToFind) {
        boolean answer = false;

        for (T element: arrayToCheck) {
            if (objectToFind.equals(element)) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] letters = {"a", "h", "m", "e", "d"};

        System.out.println(findInArray(numbers,3));
    }
}
