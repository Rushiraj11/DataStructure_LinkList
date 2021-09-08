package com.biz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linkedlist program");
        Node head;
        //  Node tail;
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);

        head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        // tail = thirdNode;

        Node temp = head; // creating temp to store key value of head
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;


        }
    }
}
