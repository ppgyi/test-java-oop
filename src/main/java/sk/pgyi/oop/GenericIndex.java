package sk.pgyi.oop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericIndex<KEY, VALUE> {

    private Map<KEY, List<VALUE>> index;

    public GenericIndex() {
        this.index = new HashMap<>();
    }
}
