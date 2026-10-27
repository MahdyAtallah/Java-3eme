package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String fam, String name, int age, boolean isMam, int legs) {
        super(fam, name, age, isMam);
        this.nbrLegs = legs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int legs) {
        this.nbrLegs = legs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs: " + nbrLegs;
    }
}
