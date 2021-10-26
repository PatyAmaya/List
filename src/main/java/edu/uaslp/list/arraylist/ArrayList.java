package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;

public class ArrayList <T> implements List <T> {

    private static final int INITIAL_SIZE=5;

    private Object[] array;
    private int nextValid;

    public ArrayList(){
        array= new Object[INITIAL_SIZE];
    }

    public void add(T data){

        if(nextValid >= array.length){
            increaseArrayCapacity();
        }

        array[nextValid]=data;
        nextValid++;
    }

    private void increaseArrayCapacity() {
        Object []newArray = new Object[array.length*2];

        System.arraycopy(array, 0, newArray, 0, array.length);

        array=newArray;
    }

    public int getListLength(){
        return array.length;
    }

    public void delete(int index){
        if(index<0 || index>=nextValid){
            return;
        }
        if (nextValid - 1 - index >= 0){
            System.arraycopy(array, index + 1, array, index, nextValid - 1 - index);
        }
        nextValid--;
    }

    public void insert(int index, T data){
        if(index<0 || index>nextValid){
            return;
        }

        if(nextValid>= array.length){
            increaseArrayCapacity();
        }

        if (nextValid - index >= 0) System.arraycopy(array, index, array, index + 1, nextValid - index);
        array[index]=data;
        nextValid++;
    }

    public int getSize(){
        return nextValid;
    }

    public T getAt(int index){
        if(index<0 || index>=nextValid){
            return null;
        }
        return (T)array[index];
    }

    @Override
    public Iterator<T> getIterator() {
        return new ArrayListIterator<>(this);
    }


}
