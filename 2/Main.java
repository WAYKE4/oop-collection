package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(new LinkedList<>());
        animal.addAnimal("Cat");
        System.out.println(animal);
        animal.addAnimal("Dog");
        System.out.println(animal);
        animal.addAnimal("Rabbit");
        System.out.println(animal);
        animal.removeAnimal();
        System.out.println(animal);
        animal.removeAnimal();
        System.out.println(animal);
    }
}
