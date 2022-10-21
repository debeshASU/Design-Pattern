package assignment515;

import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {

    ArrayList<String> list = new ArrayList<>();

    OfferingList() {
        list.add("Tomato");
        list.add("Onion");

    }

    @SuppressWarnings("rawtypes")
    public Iterator createIterator() {
        return this.list.iterator();
    }
}
