package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String fam, String name, int age, boolean isMam, String hab, float depth) {
        super(fam, name, age, isMam, hab);
        this.swimmingDepth = depth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float depth) {
        this.swimmingDepth = depth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth: " + swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
