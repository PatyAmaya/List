package edu.uaslp.list;

public interface List <T>{

    void add(T data);

    void insert(int index, T data);

    int getSize();

    T getAt(int index);

    void delete(int index);

    void print();

    Iterator<T> getIterator();
}
