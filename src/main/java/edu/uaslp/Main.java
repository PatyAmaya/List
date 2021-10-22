package edu.uaslp;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;
import edu.uaslp.list.linkedlist.LinkedList;
import edu.uaslp.list.arraylist.ArrayList;

public class Main {
    public static void main(String[] args){

        List<Integer> libros = new LinkedList<>();
        List<Integer> alumnos = new LinkedList<>();

        libros.add(1);
        libros.add(3);
        libros.add(20);
        libros.add(21);
        libros.add(23);
        libros.add(45);

        libros.insert(1,26);
        libros.insert(4,500);

        libros.delete(3);

        System.out.println("Libros size: "+libros.getSize());

        System.out.println("Datos de la iteración");

        Iterator<Integer> it= libros.getIterator();

        while (it.hasNext()){
            int dato=it.next();

            System.out.println(dato);
        }

    }
}
