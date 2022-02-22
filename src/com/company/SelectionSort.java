package com.company;

public class SelectionSort implements Sorting {
    public void sort(int[] arr) {

        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = tmp;
                }
            }
        }
    }
}