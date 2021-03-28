package com.company;

public class LinkedList {
    private Node head;

    public void printList() {
        Node n = this.head;
        while(n != null) {
            System.out.println(n.data + " " + "hi");
            n = n.next;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAfter(Node prevNode, int newData) {
        if(prevNode == null) {
            System.out.println("Given previous node cannot be null");
            return;
        }

        // 3, 4, 5, 6
        // 7

        // 7 --> 4-->5
        // 7 --> 5
        // 3,4,7,5,6

        // 7 points to 5
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;

        // 4 points to 7 now
        prevNode.next = newNode;

    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        if(this.head == null) {
            this.head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node last = this.head;
        while(last.next != null) {
            last = last.next;
            last.next = newNode;
            return;
        }
    }


    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return this.head;
    }
}
