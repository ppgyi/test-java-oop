package sk.pgyi.oop;

import java.util.Arrays;

public class Contact {

    private String firstName;
    private String surname;

    protected Contact[] friends;

    // Ak chcem zoznam Conatact ale chcem jeho kopiu, aby neodkazovala stale
    // na ten isty zoznam...Proste novy zoznam kde bude nakopirovany
    // povodny zoznam Contact tak musim to urobit len cez metodu:

    // public Contact[] getFriends(){
    //      var friendsClone = new Contact[this.friends.length];
    //      for(int i = 0; i<this.friends.length, i++){
    //          friendsClone[i] = new Contact(this.friends[i]);
    //      }
    //      return friendsClone;
    // }

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

    @Override
    public String toString() {
        return String.format("Volam sa %s", this.akoText());
    }

    // === ABSTRAKTNE TRIEDY ===

    // public abstract String getZnami();

    // Potom mozem ju pouzit priamo tu, aj ked este nevie co bude robit!!:

    //  @Override
    //  public String toString() {
    //    return String.format("Volam sa %s\n%s", this.akoText(), this.getZnami());
    //  }

    // Musi byt aj class abstract!!
    // Nemoze byt vytvorena instancia tejto triedy!!
    // Abstraktna trieda nemusi byt definovana
}
