package org.dsa.DataStructure.LinkedList;

import com.google.gson.Gson;
import lombok.ToString;

@ToString
public class MyDLL {

    Node head;
    Node tail;
    int length;

    @ToString
   private static class Node{
        Object data;
        Node next;
        Node prev;
        Node(Object data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    //append
    //prepend
    //insert
    //remove
    //reverse

    public MyDLL append(MyDLL linkedList, Object value){
        Node newNode = new Node(value);
        if(linkedList.head == null){
            linkedList.head = newNode;
            linkedList.tail = linkedList.head;
        }else {
            Node currentNode = linkedList.tail;
            while (linkedList.tail.next != null){
                linkedList.tail = linkedList.tail.next;
            }
            linkedList.tail.next = newNode;
            linkedList.tail=newNode;
        }
        linkedList.tail.prev = linkedList.head.next;
        linkedList.length++;
        return  linkedList;
    }

    public MyDLL prepend(MyDLL linkedList, Object value){
        Node newNode = new Node(value);
        newNode.next = linkedList.head;
        linkedList.head=newNode;
        linkedList.length++;
        return  linkedList;
    }



    //need to fix
    public MyDLL insert(MyDLL linkedList,int index, Object value){
        Node newNode = new Node(value);
        Node from = traverse(linkedList,index-1);
        Node next = from.next;
        from.next = newNode;
        newNode.next = next;
        linkedList.length++;
        return linkedList;
    }

    private Node traverse(MyDLL linkedList,int index){
        Node currentNode = linkedList.head;
        int counter = 0;
        while (index != counter){
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    public Node reverse(MyDLL linkedList){
        Node current = linkedList.head;

        return null;
    }


    public static void main(String[] args) {
        MyDLL doublyLinkedList = new MyDLL();
        doublyLinkedList.append(doublyLinkedList,5);
        doublyLinkedList.append(doublyLinkedList,10);
        doublyLinkedList.prepend(doublyLinkedList,1);
        doublyLinkedList.insert(doublyLinkedList,1,3);
        System.out.println("main    :  "+new Gson().toJson(doublyLinkedList));
        System.out.println("reverse :  "+new Gson().toJson(doublyLinkedList.reverse(doublyLinkedList)));

    }
}
