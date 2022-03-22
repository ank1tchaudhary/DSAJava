package org.dsa.Algo.sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int arr[] = {5,6,0,1};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void sort(int[] arr) {
        if(arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
                int min=i;
                int temp= arr[i];
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] < arr[min]){
                        min=j;
                    }
                }
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }


}
