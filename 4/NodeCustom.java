package com.company;

import org.w3c.dom.Node;

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
            System.out.println(head.val);
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.val);
        }
    }
}
