package org.dsa.DataStructure.Queue;

import lombok.ToString;

@ToString
public class Queue {

    Node head;
    int length;

    @ToString
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    //enque
    //deque

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node lastNode = this.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        this.length++;
    }

    public void dequeue(){
        if(this.length == 0){
            System.out.println("Queue is empty.");
            System.exit(1);
        }
        this.head = this.head.next;
        this.length--;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }

}
