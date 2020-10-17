package com.cg.linkedlistimplementation;

public class Node<E extends Comparable> {
    E data;
    Node next;

    public Node(E data) {
        this.data = data;
        this.next=null;
    }
}
