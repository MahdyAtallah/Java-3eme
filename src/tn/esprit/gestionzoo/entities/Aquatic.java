package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
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

    public abstract void swim();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic) {
            Aquatic other = (Aquatic) obj;
            return this.age == other.age
                    && (this.name != null ? this.name.equals(other.name) : other.name == null)
                    && (this.habitat != null ? this.habitat.equals(other.habitat) : other.habitat == null);
        }
        return false;
    }
}
