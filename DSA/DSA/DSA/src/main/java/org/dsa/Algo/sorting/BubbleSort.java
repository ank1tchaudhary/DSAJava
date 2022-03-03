package org.dsa.Algo.sorting;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int arr[]={99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void sort(int[] arr){
        if(arr.length > 0){
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-i-1 ; j++) {
                    if(arr[j]>arr[j+1]){
                        int temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }

}
