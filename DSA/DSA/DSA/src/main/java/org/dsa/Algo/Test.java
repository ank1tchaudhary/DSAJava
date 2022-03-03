package org.dsa.Algo;

public class Test  {

    public static void main(String[] args)
    {
//        printnum(1,5,0);
//
//        System.out.println("Fact : "+printFectorial(5));

//        long a=0;
//        long b=1;
//        long n=5;
//        System.out.println(a);
//        System.out.println(b);
//        printFibonacci(a,b,n-2);

        String value="Ankit Kumar Chaudhary";
        int length=value.length();
        //reverseStringRecursion1(value,length);
        reverseStringRecursion(value);



//        printSquareTillStack(5);

    }


    public static void printnum(int i,int n,int sum) {
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printnum(i+1,n,sum);
//        System.out.println(i+" "+sum);
    }

    public static int printFectorial(int n){
        if(n==1 || n==0){
            return 1;
        }
       int fact_rec=printFectorial(n-1);
        int fact = n * fact_rec;
        return fact;
    }

    public static void printFibonacci(long a,long b,long n){
        if(n==0){
            return;
        }
        long c=a+b;
        System.out.println(c);
        printFibonacci(b,c,n-1);
    }

    public static void reverseStringRecursion1(String value,int length){
        if(length<=1){
            return;
        }
        System.out.print(value.charAt(--length));
        reverseStringRecursion1(value,length);
    }

    public static void reverseStringRecursion(String value){
        if(value.length()==0){
            return;
        }
        System.out.print(value.charAt(value.charAt(value.length()-1)));
        reverseStringRecursion(value.substring(1));
    }

    public static void reverseString(String value){

        char[] myArr=value.toCharArray();
        for (int i = myArr.length-1; i >=0 ; i--) {
            System.out.print(myArr[i]);
        }

    }
}
