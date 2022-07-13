package com.bridgelabz;

import java.util.ArrayList;
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
    public void delAtFirst() {
        if(head==null) {
            System.out.println("List is empty");
        }
        else {
            Node temp= head.next;
            head.next=null;
            head=temp;
        }
    }
    public void delLast() {
        if(head==null) {
            System.out.println("List is empty");
        }
        else {
            Node temp =head;
            Node prev=head;
            while(temp.next!=null) {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }
    }
    public void findEle() {
        if(head==null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Enter the element to search");
            int e = Linked.sc.nextInt();
            Node temp=head;
            while(temp.next!=null) {
                if(temp.data==e) {
                    System.out.println("Data found");
                    break;
                }
                temp=temp.next;
            }
            if(temp.next==null) {
                System.out.println("No data found");
            }
        }
    }
    public void sort() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println("Enter no of elements to add :");
        int n = Linked.sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++) {
            int ele = Linked.sc.nextInt();
            list.add(ele);
        }
        int temp1=0;
        while(list.size()!=1) {
            temp1 =list.get(0);
            for(int i=0; i<list.size(); i++) {
                if(temp1>list.get(i)) {
                    temp1=list.get(i);
                }
            }
            list1.add(temp1);
            list.remove(Integer.valueOf(temp1));
        }
        list1.add(list.get(0));
        for(int i=0;i<list1.size();i++) {
            Node newNode= new Node(list1.get(i));
            if(head==null) {
                head=newNode;
            }
            else {
                Node temp=head;
                while(temp.next!=null) {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
        }
        System.out.println("Sorted linked list is created");
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
        Linked list = new Linked();
        while (true){
            System.out.println("1. Add element.\n2. Add element at last.\n3. Add element in between.\n4. Delete element from last." +
                    "\n5. Delete element from last.\n6. Search element.\n7. Sorting elements");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter no of element to add at first: ");
                list.add();
            } else if (choice ==2) {
                System.out.print("Enter no of element to add at first: ");
                list.addFirst();
            } else if (choice == 3) {
                list.addBetween();
            } else if (choice == 4) {
                list.delAtFirst();
            } else if (choice == 5) {
                list.delLast();
            }else if (choice == 6) {
                list.findEle();
            } else if (choice == 7) {
                list.sort();
            } else {
                System.out.println(" ");
            }
            list.display();
        }
    }
}