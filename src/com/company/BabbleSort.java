package com.company;

import java.util.Arrays;


public class BabbleSort implements Sorting{
    public void sort(int[] arr){
        System.out.println("Sort - пузырьком");
        System.out.println("до:\t"+ Arrays.toString(arr));
        for (int barier=arr.length-1;barier>=0;barier--){
            for (int i=0;i<barier;i++){
                if(arr[i]>arr[i+1]){
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
        }
        System.out.println("после:\t"+Arrays.toString(arr));
    }
}