package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private int nbrAquatics;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.nbrAnimals = 0;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
        this.nbrAquatics = 0;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
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

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public boolean addAnimal(Animal animal) {
        if (isFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
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
        nbrAnimals--;
        return true;
    }
    public boolean isFull() {
        return nbrAnimals >= nbrCages;
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
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquatics < aquaticAnimals.length) {
            aquaticAnimals[nbrAquatics] = aquatic;
            nbrAquatics++;
        } else {
            System.out.println("The aquatic animals section is full");
        }
    }
    public void displayAquaticsSwim() {
        for (int i = 0; i < nbrAquatics; i++) {
            aquaticAnimals[i].swim();
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Nombre de dauphins : " + nbrDolphins);
        System.out.println("Nombre de pingouins : " + nbrPenguins);
    }
    @Override
    public String toString() {
        return "Zoo: " + name + ", City: " + city + ", Cages: " + nbrCages + ", Animals: " + nbrAnimals;
    }
}
