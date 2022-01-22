package org.dsa.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Interview2 {

// Given 2 arrays, create a function that let's a user know (true/false)
// whether these two arrays contain any common items

//For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.


    public static void main(String[] args) {
        Character[] array1 = {'a', 'b', 1, 'c', 'x'};
        Character[] array2 = {'z', 'y', 1, 'i'};
        boolean element = findCommonElement(array1, array2);
        System.out.println(element);

    }

    public static boolean findCommonElement(Character[] arr1, Character[] arr2) {
        // space complexity :  O(n), because we are creating object map and filling its value
        // time complexity : O(n + n )= O(n), because of both operations are saperate insted of inner looping

        boolean result = false;
        Map<Character, Boolean> map = new HashMap<>();

        // op1
        Stream.of(arr1).forEach(ele -> {
            if (!map.containsKey(ele)) {
                map.put(ele, true);
            }
        });
//        System.out.println(map);

        //op2
//        Stream.of(arr2).forEach(ele -> {
//            if (map.containsKey(ele)){
//
//                System.out.println(ele + ":" + map.get(ele));
//            }
//
//        });
        for (int i = 0; i< arr2.length; i++){
            if (map.containsKey(arr2[i])){

//                System.out.println(arr2[i]+ ":" + map.get(arr2[i]));
                return true;
            }
        }

        return result;
    }

}
