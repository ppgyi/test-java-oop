package sk.pgyi.oop;

import java.util.Arrays;

public class Contact {

    private String firstName;
    private String surname;

    private Contact[] friends;

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

    public static Contact parseFromFullName(String fullName){
        return new Contact(fullName);
    }

    public void setFriends(Contact... friends) {
        this.friends = friends;
        System.out.println(Arrays.toString(friends));
    }

    public String akoText(){
        return String.format("%s %s", this.firstName, this.surname);
    }
}
