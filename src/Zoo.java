public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(nbrCages);
    }
    public String toString() {
        return name + " " + city + " " + nbrCages;
    }
}