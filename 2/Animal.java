package com.company;

import java.util.LinkedList;

public class Animal {
    LinkedList<String> linkedList;

    public Animal(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    void addAnimal(String animal) {
        linkedList.addFirst(animal);
    }

    void removeAnimal() {
        linkedList.removeLast();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "linkedList=" + linkedList +
                '}';
    }
}
