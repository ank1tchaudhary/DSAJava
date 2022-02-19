package org.dsa.DataStructure.Stack;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stack {


    int[] arr;
    int top;
    int size;

    //push
    //pop
    //peek

    Stack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public void push(int value) {
        if(isFull()){
            System.out.println("Stack Overflow!!");
            System.exit(1);
        }
        arr[++top] = value;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack Empty!!");
            System.exit(1);
        }

      return arr[top--] = 0;
    }

    public boolean isEmpty(){
        return top == -1;
    }


    public boolean isFull(){
        return top == size - 1;
    }

    public int peek(){
        return arr[top];
    }

    public void printStack(){
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
        Arrays.stream(stack.arr).forEach(System.out::println);

        System.out.println(stack.peek());

    }

}
