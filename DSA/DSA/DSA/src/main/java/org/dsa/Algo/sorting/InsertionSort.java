package org.dsa.Algo.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
                 //0   1   2  3  4  5  6   7   8   9   10
        int arr[]={99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void sort(int[] arr){
        if(arr.length > 0){
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j > 0; j--) {
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
