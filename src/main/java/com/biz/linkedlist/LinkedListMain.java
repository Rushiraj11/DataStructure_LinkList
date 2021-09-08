package com.biz.linkedlist;
import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linkedlist program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element at the start");
        System.out.println("Enter 2 to add element at the End");
        switch (sc.nextInt()) {
            case 1:
                Operations.addElementAtStart();
                break;
            case 2:
                Operations.addElementAtEnd();
        }

    }
}
