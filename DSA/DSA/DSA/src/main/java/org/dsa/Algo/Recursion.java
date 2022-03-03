package org.dsa.Algo;

//1. identify the best case
//2. identity the recursive case
//3. get closer and return when needed

public class Recursion {

    public static void main(String[] args) {
        int i1 = factorialRecursion(5);
        System.out.println(i1);
//        int i = factorialIteration(5);
//        System.out.println(i);

    }

    public static int factorialRecursion(int value) {
            if(value == 2){
                return 2;
            }

         return (value * factorialRecursion(value-1));
    }


    public static int factorialIteration(int value) {
        int fact=1;
        for (int i = 1; i<=value; i++ ){

                fact=fact*i;
            }
        return fact;

    }

}
