package assignment515;

import java.util.Iterator;

public interface ListIterator {

    public boolean hasNext();
    public Object Next();
    public void MoveToHead();

    void MoveToHead(Iterator iterator);

    public void Remove();
}
