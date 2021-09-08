package com.biz.linkedlist;
import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linkedlist program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element at the start");

        switch (sc.nextInt()) {
            case 1:
                Operations.addElementAtStart();
        }

    }
}
