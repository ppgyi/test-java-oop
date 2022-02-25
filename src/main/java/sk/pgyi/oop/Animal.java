package sk.pgyi.oop;

// Musim dat implements comparable + override compareTo!!
public abstract class Animal implements Comparable<Animal>{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    // Ak chceme aby sa to triedilo naopak tak dame minus:
    //  return -this.name.compareTo(o.name);
    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
