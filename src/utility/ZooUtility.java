package utility;

import abstracts.Animal;
import model.Elephant;
import model.Lion;
import model.ZooKeeper;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooUtility {

    ArrayList<Animal>  animals =  new ArrayList<>();

    public ZooUtility(){}

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals(){
        return animals;
    }

    public void displayAnimals(){
        for(Animal animal: animals){
            System.out.println(animal);
        }
    }

    public void enterAnimals(){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Zoo Management System!");
        System.out.println("How many animals would you like to add?");
        int numberOfAnimals = input.nextInt();
        input.nextLine();

           for(int i = 0; i< numberOfAnimals; i++){
               System.out.println("Enter animal type (Lion/Elephant):");
               String animalType = input.nextLine();

               System.out.println("Enter animal name:");
               String name = input.nextLine();

               System.out.println("Enter animal age:");
               int age = input.nextInt();
               input.nextLine();

               if(animalType.equalsIgnoreCase(("Lion"))){
                   addAnimal(new Lion(name, age));
               }else if (animalType.equalsIgnoreCase("Elephant")){
                   addAnimal(new Elephant(name, age));
               }else{
                   System.out.println("Invalid animal type:  Skipping...");
               }

           }

           System.out.println("\nAnimals in the Zoo:");
           displayAnimals();

    }

    //Overloaded methods
    public void performanceAction(Animal animal){
        animal.makeSound();
    }

    public void performanceAction(ZooKeeper zooKeeper, String action){
        System.out.println(zooKeeper.name + " is " + action + " .");
    }


}