public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimals;
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
        animals = new Animal[nbrCages];
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

            if (animals[i].name.equals(animal.name)) {
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
        return "Zoo: " + name + ", City: " + city + ", Cages: " + nbrCages + ", Animals: " + nbrAnimals;
    }
}