package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.nbrAnimals = 0;
        animals = new Animal[nbrCages];
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrCages() {
        return nbrCages;
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }
    public boolean addAnimal(Animal animal) {
        if (isFull()) {
            return false;
        }
        if (searchAnimal(animal) != -1) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals = nbrAnimals + 1;
        return true;
    }
    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int position = searchAnimal(animal);
        if (position == -1) {
            return false;
        }
        for (int i = position; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals = nbrAnimals - 1;
        return true;
    }
    public boolean isFull() {
        if (nbrAnimals == nbrCages) {
            return true;
        }
        return false;
    }
    public static Zoo compareZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.nbrAnimals > zoo2.nbrAnimals) {
            return zoo1;
        }
        return zoo2;
    }
    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Cages: " + nbrCages);
        System.out.println("Animals: " + nbrAnimals);
    }
    public String toString() {
        return "Zoo: " + name
                + ", City: " + city
                + ", Cages: " + nbrCages
                + ", Animals: " + nbrAnimals;
    }
}