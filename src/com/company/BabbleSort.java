package com.company;

public class BabbleSort implements Sorting{
    public void sort(int[] arr){
        for (int barier=arr.length-1;barier>=0;barier--){
            for (int i=0;i<barier;i++){
                if(arr[i]>arr[i+1]){
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
        }
    }
}