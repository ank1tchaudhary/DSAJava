package org.dsa.DataStructure.Array.Day1;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSortedArray {


    public static void main(String[] args) {

        int[] a={1,2,3,1,7};
        int[] b={4,5,6};
        Arrays.stream(mergeArray(a,b)).forEach(System.out::println);

    }


    public static int[] mergeArray(int[] arr1,int[] arr2){
        int[] output= new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i];
        }

        for(int j=0; j< arr2.length; j++){
            output[j+arr1.length]= arr2[j];
        }

        Arrays.sort(output);

        return output;
    }
}
