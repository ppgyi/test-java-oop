package sk.pgyi.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcreteIndex {

    private Map<Character, List<Message>> index;

    public ConcreteIndex(){
        this.index = new HashMap<>();
    }

    public void add(Message m){
        Character firstChar = m.getContent().charAt(0);
        if (this.index.containsKey(firstChar)){
            this.index.get(firstChar).add(m);
        } else {
            List<Message> newList = new ArrayList<>();
            newList.add(m);
            this.index.put(firstChar, newList);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (var entry : this.index.entrySet()){
            builder.append("---------------");
            builder.append("Key: ").append(entry.getKey()).append("\n");
            for (Message m: entry.getValue()){
                builder.append("\tmessages: ").append(m.getContent()).append("\n");
            }
        }
        return builder.toString();
    }
}
