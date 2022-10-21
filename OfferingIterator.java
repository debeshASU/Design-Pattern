package assignment515;

import java.util.Iterator;

public class OfferingIterator implements ListIterator{


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object Next() {
        return null;
    }

    @Override
    public void MoveToHead() {
        System.out.println("Head has been Moved ");

    }

    @Override
    public void MoveToHead(Iterator iterator) {

    }

    @Override
    public void Remove() {


    }




}
