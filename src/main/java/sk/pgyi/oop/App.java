package sk.pgyi.oop;

import java.util.*;

public class App {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>(List.of(new Dog("Rex"),
                new Dog("Luna"), new Bird("Polly"),
                new Bird("Orol")));

        // LAMBDA - anonymna f-cia, cez sipku, teraz nemusim mat
        // AnimalComparator tiedu! Staci takto:
        animals.sort((o1, o2) -> {
            return o1.toString().compareTo(o2.toString());
        });
        // Jednoduchy zapis:
        animals.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));

        // Preddefinovana metoda: (to iste ako prve a druhe)
        animals.sort(Comparator.comparing(Animal::toString));

        System.out.println(animals.toString());
    }
}
