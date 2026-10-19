package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {
    }

    public Dolphin(String fam, String name, int age, boolean isMam, String hab, float spd) {
        super(fam, name, age, isMam, hab);
        this.swimmingSpeed = spd;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float spd) {
        this.swimmingSpeed = spd;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed: " + swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This animal dolphin is swimming.");
    }
}
