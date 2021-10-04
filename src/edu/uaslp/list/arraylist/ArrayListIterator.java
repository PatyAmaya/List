package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;

public class ArrayListIterator <T> implements Iterator<T> {

    private int currentIndex=0;
    private final ArrayList<T> arrayList;

    ArrayListIterator(ArrayList<T> arrayList){
        this.arrayList=arrayList;
    }

    @Override
    public T next() {
        return arrayList.getAt(currentIndex++);
    }

    @Override
    public boolean hasNext() {
        return currentIndex< arrayList.getSize();
    }
}
