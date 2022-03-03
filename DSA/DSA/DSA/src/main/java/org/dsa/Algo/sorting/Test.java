package org.dsa.Algo.sorting;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr= {2,65,34,2,1,7,8,12};

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
