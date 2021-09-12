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
               if(temp.next != null)
                    System.out. print(temp.data + " --> ");
                else System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }
    public void pop() {

        this.head = this.head.next;
    }

    public void popLast() {
        Node tempNode= head;
        while(!tempNode.next.equals(tail)){
            tempNode=tempNode.next;
        }
        this.tail = tempNode;
        tempNode.next =null;

    }

    public void searchNode(int value) {

        Node tempNode = head;
        int index = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    flag = true;
                    break;
                }
                index++;
                tempNode = tempNode.next;
            }
        }
        if (flag == true) {
            System.out.println("Value:" + value + " is present at Index:" + index);
        } else {
            System.out.println("Element no present");
        }
    }
}
