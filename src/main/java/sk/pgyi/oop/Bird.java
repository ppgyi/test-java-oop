package sk.pgyi.oop;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    public void repeat(String sentence){
        System.out.println("Bird says: " + sentence);
    }
}
