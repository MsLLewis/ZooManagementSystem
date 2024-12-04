package abstracts;

import interfaces.ZooKeeper;

public abstract class Animal {
    public String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }



    // Abstract method
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println(name + " is eating.");
    }


}
