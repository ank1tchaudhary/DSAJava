package org.dsa.DataStructure.Array.Day1;

import java.util.Arrays;

public class MyArray{


    public static void main(String[] args) {

        int[] arr = new int[5];
        int[] arrayEleAtTheEnd = insertAtTheEnd(arr,6);
        int[] arrayEleAtTheFront = insertAtFront(arrayEleAtTheEnd,1);
        int[] arrayEleAtMiddle = insertMiddle(arrayEleAtTheFront,4,3);
        int[] deleteAtEnd = deleteAtTheEnd(arrayEleAtMiddle);
        int[] deleteAtFront = deleteAtTheFront(new int[]{1,2,3,4,5});
        int[] deleteMiddle = deleteAtTheMiddle(new int[]{1,2,3,4,5,6},3);
        boolean find = find(new int[]{1,2,3,4,5,6},6);
        Arrays.stream(deleteMiddle).forEach(System.out::println);
        System.out.println(find);



    }

    public static int[] insertAtTheEnd(int[] arr, int value){
        arr[arr.length-1] = value;
        return arr;
    }


    public static int[] insertAtFront(int[] arr, int value){
        int[] myArr = new int[arr.length + 1];

        if(arr == null){
            myArr[0] = value;
        }else{
            for (int i = 0; i < arr.length; i++) {
                myArr[i+1] = arr[i];
            }
            myArr[0] = value;
        }

        return myArr;
    }

    public static int[] insertMiddle(int[] arr, int value, int index){
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if(i == index){
                newArray[i] = value;
            }
            else if (i < index){
                newArray[i] = arr[i];
            }
            else {
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }

    public static int[] update(int[] arr, int value, int index){

        arr[index] = value;

        return arr;
    }

    public static int[] deleteAtTheEnd(int[] arr){
        int[] newArr = Arrays.copyOf(arr,arr.length-1);
        return newArr;
    }

    public static int[] deleteAtTheFront(int[] arr){
        int[] newArr = new int[arr.length - 1];
        if(arr != null){
            for (int i = 0; i < newArr.length; i++) {
                newArr[i]= arr[i+1];
            }
        }
        return newArr;
    }

    public static int[] deleteAtTheMiddle(int[] arr, int index){
        int[] newArr = new int[arr.length - 1];
        if(arr != null){
            for (int i = 0; i < newArr.length; i++) {
                if(i == index){
                    newArr[i] = arr[i+1];
                }
                else if(i < index) {
                    newArr[i] = arr[i];
                }
                else {
                    newArr[i] = arr[i+1];
                }
            }
        }

        return newArr;
    }

    public static boolean find(int[] arr, int value){

        boolean result = false;
        if(arr != null){
            int i = Arrays.binarySearch(arr, value);
            result = i >= 0 ? true:false;
        }

        return result;
    }



}