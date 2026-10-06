package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal monkey = new Animal("lion", "Kiki", 3, true);
        Animal parrot = new Animal("Bird", "Rio", 2, false);
        Animal elephant = new Animal("Eleph", "Dumbo", 8, true);
        Zoo zoo = new Zoo("MyZoo", "Tunis");
        System.out.println("=== add animals ===");
        System.out.println(zoo.addAnimal(lion));
        System.out.println(zoo.addAnimal(monkey));
        System.out.println(zoo.addAnimal(parrot));
        System.out.println("=== Animals disp ===");
        zoo.displayAnimals();
        System.out.println("=== recherche ===");
        int result = zoo.searchAnimal(lion);
        System.out.println("Lion pos: " + result);
        Animal newLion = new Animal("lion", "Simba", 5, true);
        result = zoo.searchAnimal(newLion);
        System.out.println("Second Simba pos: " + result);
        System.out.println("=== Duplicate test ===");
        System.out.println("Adding Simba again: " + zoo.addAnimal(newLion));
        System.out.println("=== Adding another animal ===");
        System.out.println(zoo.addAnimal(elephant));
        System.out.println("=== Zoo information ===");
        zoo.displayZoo();
        System.out.println("=== Full zoo test ===");
        System.out.println("Is the zoo full? " + zoo.isFull());
        System.out.println("=== Removing an animal ===");
        System.out.println("Lion removed: " + zoo.removeAnimal(lion));
        System.out.println("Animals after removal:");
        zoo.displayAnimals();
        System.out.println("=== Second zoo ===");
        Zoo zoo2 = new Zoo("Safari", "Sousse");
        zoo2.addAnimal(monkey);
        zoo2.addAnimal(parrot);
        System.out.println(zoo2);
        System.out.println("=== Comparing zoos ===");
        Zoo biggerZoo = Zoo.compareZoo(zoo, zoo2);
        System.out.println("The zoo with more animals is: " + biggerZoo.getName());
    }
}