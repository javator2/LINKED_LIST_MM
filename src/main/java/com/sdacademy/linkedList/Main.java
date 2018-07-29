package com.sdacademy.linkedList;



public class Main {
    public static void main(String[] args) {

        LinkedList lista = new LinkedList(2);
        lista.add(22);
        lista.add(33);
        lista.add(44);
        lista.add(55);
        lista.add(66);
        lista.add(77);
        lista.add(78);
        lista.add(88);
        lista.add(89);
        lista.add(99);
        lista.add(90);
        lista.add(100);

        lista.addTale(122);
        lista.getObjectWithNumber(0);
        lista.getObjectWithNumber(2);
        lista.getObjectWithNumber(4);
        lista.getObjectWithNumber(8);


        lista.printList();
    }
}
