package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;

public class ArrayList <T> implements List <T> {

    private static final int INITIAL_SIZE=50;

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
        if(index<0 || index>=nextValid){
            return;
        }

        if(nextValid>= array.length){
            increaseArrayCapacity();
        }

        for(int i=nextValid;i>index;i--){
            array[i]=array[i-1];
        }
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

/*
    public void add(T data){
        int i;

        if(last==size){
            arrCounter++;
            int newArr[]=new int[size*arrCounter];
            for(i=0;i<last;i++){
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        arr[last]=data;
        last++;
    }

    public void insert(int data, int index){
        int i;

        if(last==size){
            arrCounter++;
            int newArr[]=new int[size*arrCounter];
            for(i=0;i<last;i++){
                newArr[i]=arr[i];
            }
        }

        for(i=last;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=data;
        last++;
    }

    public void delete(int index){
        int i;

        for(i=index;i<last;i++){
            arr[i]=arr[i+1];
        }
        last--;
    }

    public int getSize(){
        return last;
    }

    public int getAt(int index){
        return arr[index];
    }

    public int getArrCounter() {
        return arrCounter;
    }*/
}
