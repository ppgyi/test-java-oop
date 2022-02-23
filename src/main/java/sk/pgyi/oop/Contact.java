package sk.pgyi.oop;

public class Contact {

    String firstName;
    String surname;

    public Contact(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    // Ak zadame cele meno tak funkcia split nam ho rozdeli do String[]
    public Contact(String fullName){
        var parts = fullName.split(" ");
        firstName = parts[0];
        surname = parts[1];
    }
}
