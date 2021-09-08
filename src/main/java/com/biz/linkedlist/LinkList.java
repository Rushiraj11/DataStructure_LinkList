package com.biz.linkedlist;

public class LinkList {
    Node head;
    Node tail;

    public Node push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode; // head is changing
            newNode.next = temp;
        }

        return newNode;
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

    public static void insertInBetween(Node previousNode ,Node newNode) {
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }



        public void print() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

}
