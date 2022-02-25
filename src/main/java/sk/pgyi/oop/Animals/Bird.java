package sk.pgyi.oop.Animals;

public class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    public void repeat(String sentence){
        System.out.println("Bird says: " + sentence);
    }
}
