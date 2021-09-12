package com.biz.linkedlist;
import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linkedlist program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element at the start");
        System.out.println("Enter 2 to add element at the End");
        System.out.println("Enter 3 to insert element in Between");
        System.out.println("Enter 4 to delete element of First Node");
        System.out.println("Enter 5 to delete element of Last Node");
        switch (sc.nextInt()) {
            case 1:
                Operations.addElementAtStart();
                break;
            case 2:
                Operations.addElementAtEnd();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
            case 5:
                Operations.deleteLastNode();
                break;

        }

    }
}
