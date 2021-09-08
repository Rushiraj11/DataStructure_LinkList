package com.biz.linkedlist;

public class LinkList {
    Node head;
    Node tail;

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode; // head is changing
            newNode.next = temp;
        }

    }
      public  void appened(int data){
         Node newNode = new Node(data);
          if (head == null) {
              head = newNode;
              tail = newNode;
          } else {
              this.tail.next = newNode; // tail is changing
              tail = newNode;
          }

      }


    public void print() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

}
