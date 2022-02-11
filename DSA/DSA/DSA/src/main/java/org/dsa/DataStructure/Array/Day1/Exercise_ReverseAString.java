package org.dsa.DataStructure.Array.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise_ReverseAString {

    public static void main(String[] args) {
        String input = "tiknA";
        System.out.println(reverseString(input));

    }


    public static String reverseString(String str) {
        String output= "";
        for (int i = str.length() - 1; i >= 0 ; i--) {

            output=output+str.charAt(i);

        }
        return new String(output);

    }

}
