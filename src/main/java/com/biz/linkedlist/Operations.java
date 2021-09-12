package com.biz.linkedlist;

public class Operations {
    public static LinkList addElementAtStart() {
        LinkList linkedList = new LinkList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();
        return linkedList;
    }

    public static void addElementAtEnd() {
       LinkList linkedList = new LinkList();
       linkedList.appened(56);
       linkedList.appened(30);
       linkedList.appened(70);

       linkedList.print();
    }

    public static void insertInBetween() {
        LinkList linkedList = new LinkList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        System.out.println("Before:");
        linkedList.print();
        Node newNode= new Node(30);
        linkedList.insertInBetween(firstNode, newNode); //inserting new key value after previousNode
        System.out.println("after:");
        linkedList.print();

    }
    public static void deleteFirstNode() {
        LinkList linkedList = addElementAtStart();
        linkedList.pop();
        linkedList.print();
    }

    public static void deleteLastNode() {
        LinkList linkedList = addElementAtStart();
        linkedList.popLast();
        linkedList.print();

    }

    public static void findNodeBasedOnValue() {
        LinkList linkedList = addElementAtStart();
        linkedList.searchNode(30);
    }
}

