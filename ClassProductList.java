package assignment515;
import java.util.*;
public class ClassProductList extends Reminder {

    ArrayList<String> list = new ArrayList<>();

    ClassProductList() {
        list.add("Beef");
        list.add("Pork");
        list.add("Mutton");

    }


    public Iterator createIterator() {
        return this.list.iterator();
    }

    public void accept(NodeVisitor nodeVisitor) {
        System.out.println("Product List Reminder ...");

    }
}
