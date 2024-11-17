package com.csc;

class ChainLink {
    public String color;
    ChainLink(String color) {
        this.color = color;
    }
}

class Node {
    ChainLink data;
    Node next;
    Node(ChainLink data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    public LinkedList() {
        this.head = null;
    }

    public void append(ChainLink newLink) {
        Node newNode = new Node(newLink);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ChainLink get(int index) {
        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                return current.data;
            }
            current = current.next;
            currentIndex++;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ChainLink linkOne = new ChainLink("red");
        ChainLink linkTwo = new ChainLink("blue");
        ChainLink linkThree = new ChainLink("green");
        list.append(linkOne);
        list.append(linkTwo);
        list.append(linkThree);

        ChainLink retrievedlink1 = list.get(0);
        if (retrievedlink1 != null) {
            System.out.println("Color at index 0: " + retrievedlink1.color);
        }
        ChainLink retrievedlink2 = list.get(1);
        if (retrievedlink2 != null) {
            System.out.println("Color at index 1: " + retrievedlink2.color);
        }
        ChainLink retrievedlink3 = list.get(2);
        if (retrievedlink3 != null) {
            System.out.println("Color at index 2: " + retrievedlink3.color);
        }
    }
}
