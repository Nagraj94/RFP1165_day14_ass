package com.bridgelabz;

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /*
        assigning values dynamically
         */
        list.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);
          /*
        pointing nodes to further nodes
         */
        list.head.next = second;
        second.next = third;
    }
}
