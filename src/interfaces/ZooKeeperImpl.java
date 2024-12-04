package interfaces;

import abstracts.Animal;

public class ZooKeeperImpl implements ZooKeeper{



    @Override
    public void feedAnimals() {
        System.out.println("Feeding all animals.");
    }

    @Override
    public void cleanEnclosure() {
        System.out.println("Cleaning animal enclosures.");

    }

    @Override
    public void recordAnimalHealth() {
        System.out.println("Recording health data for all animals.");

    }
    
}
