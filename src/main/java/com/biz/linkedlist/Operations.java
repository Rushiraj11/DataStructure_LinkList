package com.biz.linkedlist;

public class Operations {
    public static void addElementAtStart() {
        LinkList linkedList = new LinkList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();

    }

    public static void addElementAtEnd() {
       LinkList linkedList = new LinkList();
       linkedList.appened(56);
       linkedList.appened(30);
       linkedList.appened(70);

       linkedList.print();
    }
}
