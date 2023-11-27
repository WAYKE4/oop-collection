package com.company;

public class Main {
    public static void main(String[] args) {
        NodeCustom head = new NodeCustom(1, null);
       head.next = new NodeCustom(2,null);
       head.next.next = new NodeCustom(3,null);
        head.add(4, head);
        head.add(5,head);
        head.add(6,head);
        head.add(5,head);
        head.add(4,head);
        head.add(3,head);
        head.add(2,head);
        head.add(1,head);
        head.print(head);
       if(head.isPalindrome(head)){
           System.out.println();
           System.out.println("Yes , it's a palindrome");
       }else {
           System.out.println();
           System.out.println("No , it's not a palindrome");
       }

    }
}
//1,2,3,4,5,6,5,4,3,2,1