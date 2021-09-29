package edu.uaslp;

import edu.uaslp.list.arraylist.ArrayList;
import edu.uaslp.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args){

        LinkedList libros = new LinkedList();
        LinkedList alumnos = new LinkedList();

        libros.add(1);
        libros.add("CINCO");
        libros.add(20);
        libros.add(21);
        libros.add(23);
        libros.add(45);

        libros.insert(1,26);
        libros.insert(4,500);

        libros.delete(3);

        alumnos.add(22);
        alumnos.add(5);

        System.out.println("Libros size: "+libros.getSize());
        System.out.println("Alumnos size: "+alumnos.getSize());

        System.out.println("Lista de libros");
        libros.print();


    }

}
