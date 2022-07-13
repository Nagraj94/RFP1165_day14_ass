package com.bridgelabz;

import java.util.Scanner;

public class Linked{
    Node head;
    static Scanner sc = new Scanner(System.in);

    public void add() {
        int n = Linked.sc.nextInt();
        for(int i=0; i<n; i++) {
            int e = Linked.sc.nextInt();
            Node newNode = new Node(e);
            if(head==null) {
                head=newNode;
            }
            else {
                System.out.println("Enter no of element to add at first");
                Node temp=head;
                while(temp.next!=null) {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
        }
        display();
    }

    public void addFirst() {
        if(head==null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Enter no of element to add at first");
            int n = Linked.sc.nextInt();
            for(int i=0; i<n; i++) {
                int e = Linked.sc.nextInt();
                Node newNode = new Node(e);
                newNode.next=head;
                head=newNode;
            }
        }
    }

    public void addBetween() {
        if(head==null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Enter the element after which you want to insert new element");
            int ele = Linked.sc.nextInt();
            System.out.println("Enter the new element to be added");
            int ele1= Linked.sc.nextInt();
            Node temp = head;
            while(temp.next!=null) {
                if(temp.data==ele) {
                    Node newNode = new Node(ele1);
                    newNode.next=temp.next;
                    temp.next=newNode;
                    System.out.println("Node inserted at between successfully");
                    break;
                }
                temp=temp.next;
            }
        }
    }
    public void display() {
        if(head==null) {
            System.out.println("List is empty");
        }
        else {
            Node temp=head;
            while(temp.next!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }


    public static void main(String[] args) {
        while (true){
            System.out.println("1. Add element.\n2. Add element at last.\n3. Add element in between");
            int choice = sc.nextInt();
            Linked list = new Linked();
            if (choice == 1) {
                list.add();
            } else if (choice ==2) {
                list.addFirst();
            } else if (choice == 3) {
                list.addBetween();
            } else {
                System.out.println(" ");
            }
            list.display();
        }
    }
}