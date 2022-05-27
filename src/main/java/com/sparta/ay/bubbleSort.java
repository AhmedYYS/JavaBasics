package com.sparta.ay;

 public class bubbleSort {
        public static void bubbly(int[] sorting) {
            int al = sorting.length;

            for (int i = 0; i < al - 1; i++) {
                for (int x = 0; x < al - i - 1; x++) {
                    if (sorting[x + 1] < sorting[x]) {
                        int swapped = sorting[x];
                        sorting[x] = sorting[x + 1];
                        sorting[x + 1] = swapped;
                    }
                }
            }
        }

        public static void main(String args[]) {
            int[] arr = {50, 9, 230, 85, 120, 32, 18};
            int al = arr.length;
            bubbly(arr);

            for (int i = 0; i < al; i++) {
                System.out.print(arr[i] + " ");
            }
        }
 }