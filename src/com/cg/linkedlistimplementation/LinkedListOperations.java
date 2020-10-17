package com.cg.linkedlistimplementation;

public class LinkedListOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to linked list program");
        SortedLinkedList linkedList=new SortedLinkedList();
        linkedList.add(70);

        linkedList.add(30);
        linkedList.add(56);
        linkedList.printList();
        System.out.println("-----");
        linkedList.insert(30,40);
        linkedList.printList();
        System.out.println("-----");
        linkedList.remove(40);
        linkedList.printList();
        System.out.println("Size of linked list is "+linkedList.size());


    }
}
