package com.company;



public class Main {

    public static void main(String[] args) {
        LinkedList llist =  new LinkedList();

        llist.setHead(new Node(4));
        Node second = new Node(2);
        Node third = new Node(3);
        

        llist.getHead().next = second;
        second.next = third;

        llist.printList();
    }
}
