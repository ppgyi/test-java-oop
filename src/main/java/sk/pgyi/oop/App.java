package sk.pgyi.oop;

import java.util.*;

public class App {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>(List.of(new Dog("Rex"),
                new Dog("Luna"), new Bird("Polly"),
                new Bird("Orol")));

        // Sortovanie - zoradenie prva moznost
        animals.sort(null);

        System.out.println(animals.toString());

        // [Luna, Orol, Polly, Rex]

        // pri druhom sposobe:
        animals.sort(new AnimalComparator());
        System.out.println(animals.toString());
    }
}
