package org.dsa.Algo;

import java.util.Arrays;

public class Fibonacchi {
    public static void main(String[] args) {
//        int fib = fib(5);
//        System.out.println("output : "+ fib);

        int fibRecursion = fibRecursion(5);
        System.out.println("output : "+ fibRecursion);
    }

    public static int fibRecursion(int val){
            if(val < 2){
                return  val;
            }
           return fibRecursion(val - 1) + fibRecursion(val - 2);
    }

//    public static int fib(int val){
//        int j=0;
//        int k=1;
//        int sum=0;
//        System.out.println(j);
//        System.out.println(k);
//        for (int i=0;i<val-2;i++){
//            sum = j+k;
//            System.out.println(sum);
//            j=k;
//            k=sum;
//        }
//        return sum;
//    }
}
