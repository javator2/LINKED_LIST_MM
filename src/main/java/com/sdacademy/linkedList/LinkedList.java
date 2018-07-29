package com.sdacademy.linkedList;

public class LinkedList {

    private static Node head;
    private static int size;


    public LinkedList(Object data) {
        head = new Node(data);
    }

    public void add(Object data) {
        Node copy = head;
        head = new Node(data);
        head.next = copy;
        size++;
    }

    public void addTale(Object data) {
        Node copy = head;
        while (copy.next != null) {
            copy = copy.next;
        }
        copy.next = new Node(data);
        size++;
    }

    public void getObjectWithNumber(int index) {
        Node temp = head;
        int counter = 0;
        while (counter != index) {
            counter++;
            temp = temp.next;
        }
        System.out.println("number with index " +index+ ": " +temp.getData());

    }


    public static void printList() {
        Node temp = head;
        System.out.println(" ");
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }


    class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
