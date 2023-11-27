package com.company;

public class Main {
    public static void main(String[] args) {
        NodeCustom head = new NodeCustom(1, null);
       head.next = new NodeCustom(2,null);
       head.next.next = new NodeCustom(3,null);
        head.add(4, head);
        head.add(10,head);
        head.remove(4,head);
        head.print(head);
    }
}
