package assignment515;

import java.util.Iterator;

public class ProductIterator implements ListIterator{
    @Override
    public  boolean hasNext() {
        return false;
    }

    @Override
    public Object Next() {
        return null;
    }

    @Override
    public void MoveToHead() {

    }

    @Override
    public void Remove() {

    }
    @SuppressWarnings("rawtypes")
    public static boolean HasNext(Iterator iterator) {
        return iterator.hasNext();
    }

    @SuppressWarnings("rawtypes")
    public void MoveToHead(Iterator iterator) {
        System.out.println("Head Moved..");
    }

    @SuppressWarnings("rawtypes")
    public String Next(Iterator iterator) {
        if (this.HasNext(iterator)) {
            return (String) iterator.next();
        } else {
            return null;
        }
    }

    @SuppressWarnings("rawtypes")
    public void Remove(Iterator iterator) {
        if (this.HasNext(iterator)) {
            iterator.next();
        }

    }
}
