package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String fam, String name, int age, boolean isMam, String hab) {
        super(fam, name, age, isMam);
        this.habitat = hab;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String hab) {
        this.habitat = hab;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat: " + habitat;
    }

    public void swim() {
        System.out.println("This animal is aqua swimming.");
    }
}
