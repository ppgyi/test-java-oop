package sk.pgyi.oop;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        // === GENERICKE TYPY ===
        ArrayList<Message> messages = new ArrayList<>();

        messages.add(new Message("Hello"));
        messages.add(new Message("world"));

        for (Message m:messages){
            System.out.println(m.getContent());
        }

        // Rozne objekty v generickom type (Charac..., List<>) a Map a HashMap
        ConcreteIndex concreteIndex = new ConcreteIndex();
        concreteIndex.add(new Message("Hello"));
        concreteIndex.add(new Message("world"));
        concreteIndex.add(new Message("Hello world"));
        System.out.println(concreteIndex.toString());
    }
}
