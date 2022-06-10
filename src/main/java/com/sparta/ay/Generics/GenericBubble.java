package com.sparta.ay.Generics;

public class GenericBubble {

    private static <T extends Number> void bubbleSort(T[] sorting) {
        int al = sorting.length;


        for (int i = 0; i < al - 1; i++) {
            for (int x = 0; x < al - i - 1; x++) {
                //if (sorting[x + 1] < sorting[x]) {
                    T swapped = sorting[x];
                    sorting[x] = sorting[x + 1];
                    sorting[x + 1] = swapped;
                }
            }
        }
    //}


    public static void main(String[] args) {
            Integer[] arr = {50, 9, 230, 85, 120, 32, 18};
            int al = arr.length;
            bubbleSort(arr);

            for (int i = 0; i < al; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
