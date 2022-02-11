package org.dsa.DataStructure.LinkedList;

import com.google.gson.Gson;
import lombok.*;

@ToString
public class MyLinkedList {
    Node head;
    Node tail;
    int length;

    @ToString
   private static class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }



    public MyLinkedList append(MyLinkedList linkedList, Object value){
        Node newNode = new Node(value);
        if(linkedList.head == null){
            linkedList.head=newNode;
        }else {
            Node lastNode = linkedList.head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        linkedList.tail=newNode;
        linkedList.length++;
        return linkedList;
    }

    public MyLinkedList prepend(MyLinkedList linkedList, Object value){
        Node newNode = new Node(value);
        newNode.next=linkedList.head;
        linkedList.head=newNode;
        linkedList.length++;
        return linkedList;
    }

    public  MyLinkedList insert(MyLinkedList linkedList,int index, Object value){
        Node newNode = new Node(value);
        if(index >= linkedList.length){
            linkedList.append(linkedList,value);
        }else{
            Node currentNode = traverse(linkedList,index-1);
            Node nextToCurrentNode = currentNode.next;
            currentNode.next = newNode;
            newNode.next = nextToCurrentNode;
        }
        linkedList.length++;
        return linkedList;
    }

    public  MyLinkedList remove(MyLinkedList linkedList,int index){

        if(index < linkedList.length && index > 0){
            Node currentNode = traverse(linkedList,index-1);
            Node deletedNode = currentNode.next;
            currentNode.next=deletedNode.next;
            linkedList.length--;
        }
        return linkedList;
    }

    private static Node traverse(MyLinkedList linkedList,int index){
        Node currentNode = linkedList.head;
        int counter=0;
        while (index != counter){
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    public Node reverse(MyLinkedList linkedList){
        Node current = linkedList.head;
        Node prev = null;
        //null  <-- 1 --> 2 --> 3 --> 4 --> null
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        MyLinkedList linkedList= new MyLinkedList();
        linkedList.append(linkedList,1);//1st index
        linkedList.append(linkedList,5);//2nd index
        linkedList.prepend(linkedList, 2);//0th index
//        linkedList.append(linkedList,20);//3rd index
//        linkedList.insert(linkedList, 2,10);//4th index
//        linkedList.remove(linkedList, 5);//4th index
        System.out.println(new Gson().toJson(linkedList));
        System.out.println(new Gson().toJson(linkedList.reverse(linkedList)));
    }


}
