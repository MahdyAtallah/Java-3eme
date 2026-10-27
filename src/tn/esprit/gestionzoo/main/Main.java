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
        Zoo zoo = new Zoo(zooName, "Tunis");

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

        System.out.println("\n=== Test sous-classes Terrestrial, Dolphin, Penguin ===");
        Terrestrial terr = new Terrestrial("Canidae", "Dog", 4, true, 4);
        Dolphin dolph1 = new Dolphin("Delphinidae", "Flipper", 6, true, "Ocean", 25.5f);
        Dolphin dolph2 = new Dolphin("Delphinidae", "Echo", 4, true, "Ocean", 30.0f);
        Penguin peng1 = new Penguin("Spheniscidae", "Pingo", 2, false, "Antarctica", 15.0f);
        Penguin peng2 = new Penguin("Spheniscidae", "Skipper", 3, false, "Antarctica", 28.5f);

        System.out.println(terr);
        System.out.println(dolph1);
        System.out.println(peng1);

        // ================= Prosit 6 =================

        // Instruction 25: Ajout d'animaux aquatiques au zoo
        System.out.println("\n=== Instruction 25: Ajout animaux aquatiques ===");
        zoo.addAquaticAnimal(dolph1);
        zoo.addAquaticAnimal(dolph2);
        zoo.addAquaticAnimal(peng1);
        zoo.addAquaticAnimal(peng2);

        // Instruction 26: Parcours et appel de la méthode swim()
        System.out.println("\n=== Instruction 26: Appel de swim() pour tous les animaux aquatiques ===");
        zoo.displayAquaticsSwim();
        // Que remarquez-vous ?
        // On remarque que chaque animal appelle la méthode swim() de sa propre classe (Dolphin ou Penguin).
        // C'est le principe du polymorphisme par liaison dynamique (cours Chapitre 6 : le niveau le plus bas qui gagne).

        // Instruction 27: Profondeur maximale des pingouins
        System.out.println("\n=== Instruction 27: Profondeur maximale des pingouins ===");
        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("Profondeur maximale de nage des pingouins : " + maxDepth + " mètres");

        // Instruction 28: Affichage du nombre par type
        System.out.println("\n=== Instruction 28: Affichage du nombre par type ===");
        zoo.displayNumberOfAquaticsByType();

        // Instruction 31: Redéfinition et test de equals()
        System.out.println("\n=== Instruction 31: Test de equals() pour Aquatic ===");
        Dolphin dIdentique1 = new Dolphin("Delphinidae", "Flipper", 6, true, "Ocean", 25.5f);
        Dolphin dIdentique2 = new Dolphin("Delphinidae", "Flipper", 6, true, "Ocean", 35.0f);
        Dolphin dDifferent = new Dolphin("Delphinidae", "Flipper", 8, true, "Bassin", 25.5f);

        System.out.println("dIdentique1.equals(dIdentique2) [même nom, même age, même habitat]: " + dIdentique1.equals(dIdentique2)); // true
        System.out.println("dIdentique1.equals(dDifferent) [âge et habitat différents]: " + dIdentique1.equals(dDifferent));       // false
    }
}
