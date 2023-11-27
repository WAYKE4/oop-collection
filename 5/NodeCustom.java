package com.company;

import java.util.Stack;

public class NodeCustom {
    public Integer val;
    public NodeCustom next;

    public NodeCustom(Integer val, NodeCustom next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeCustom{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public void add(int data, NodeCustom head) {
        NodeCustom NewNode = new NodeCustom(data, null);
        NodeCustom currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = NewNode;
    }

    public void remove(int data, NodeCustom head) {
        NodeCustom currentNode = head;
        NodeCustom previousNode = null;

        while (currentNode.next != null) {
            if (currentNode.val == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;

        }
    }

    public void print(NodeCustom head) {
        NodeCustom currentNode = head;
        if (head != null) {
            System.out.print(head.val+ " ");
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.val + " ");
        }
    }

    public boolean isPalindrome(NodeCustom head) {
        Stack<Integer> stack = new Stack<>();
        NodeCustom Node = head;
        while (Node != null) {
            stack.push(Node.val);
            Node = Node.next;
        }
        Node = head;
        while (Node != null) {
            int top = stack.pop();
            if (top != Node.val) {
                return false;
            }
            Node = Node.next;
        }
        return true;
    }
}
