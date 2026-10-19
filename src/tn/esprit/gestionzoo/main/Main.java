package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        Animal lion = new Animal("Cat", "Lion", 5, true);
        Animal monkey = new Animal("Monkey", "Monkey", 3, true);
        Animal parrot = new Animal("Bird", "Bird", 2, false);
        Animal elephant = new Animal("Elephant", "Elephant", 8, true);
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
        Animal newLion = new Animal("Cat", "Lion", 5, true);
        result = zoo.searchAnimal(newLion);
        System.out.println("Second Lion pos: " + result);
        System.out.println("=== Duplicate test ===");
        System.out.println("Adding Lion again: " + zoo.addAnimal(newLion));
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

        System.out.println("\n=== test constructeur defaut ===");
        Aquatic aqDef = new Aquatic();
        Terrestrial terDef = new Terrestrial();
        Dolphin dolDef = new Dolphin();
        Penguin pengDef = new Penguin();

        System.out.println("\n=== test sous classes ===");
        Aquatic aqua = new Aquatic("Fish", "Fish", 3, false, "Ocean");
        Terrestrial terr = new Terrestrial("Dog", "Dog", 4, true, 4);
        Dolphin dolph = new Dolphin("Dolphin", "Dolphin", 6, true, "Sea", 25.5f);
        Penguin peng = new Penguin("Penguin", "Penguin", 2, false, "Sea", 12.0f);

        System.out.println(aqua);
        System.out.println(terr);
        System.out.println(dolph);
        System.out.println(peng);

        System.out.println("\n=== test swim ===");
        aqua.swim();
        dolph.swim();
        peng.swim();
    }
}