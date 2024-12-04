package model;

import abstracts.Animal;

public class Elephant extends Animal{

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpets!");
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
