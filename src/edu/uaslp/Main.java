package edu.uaslp;

import edu.uaslp.list.arraylist.ArrayList;
import edu.uaslp.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args){

        ArrayList libros = new ArrayList();
        ArrayList alumnos = new ArrayList();

        libros.add(1);
        libros.add(14);
        libros.add(20);
        libros.add(21);
        libros.add(23);
        libros.add(45);
        libros.add(56);
        libros.add(76);
        libros.add(234);
        libros.add(567);
        libros.add(55555);
        libros.add(11111);

        System.out.println("Numero de arreglos utilizados: "+libros.getArrCounter());

        alumnos.add(22);
        alumnos.add(5);

        System.out.println("Libros size: "+libros.getSize());
        System.out.println("Alumnos size: "+alumnos.getSize());

        System.out.println("Lista de libros");
        System.out.println("Libro en posición 0: "+libros.getAt(0));
        System.out.println("Libro en posición 1: "+libros.getAt(1));
        System.out.println("Libro en posición 2: "+libros.getAt(2));
        System.out.println("Libro en posición 3: "+libros.getAt(3));
        System.out.println("Libro en posición 4: "+libros.getAt(4));
        System.out.println("Libro en posición 5: "+libros.getAt(5));
        System.out.println("Libro en posición 6: "+libros.getAt(6));
        System.out.println("Libro en posición 7: "+libros.getAt(7));
        System.out.println("Libro en posición 8: "+libros.getAt(8));
        System.out.println("Libro en posición 9: "+libros.getAt(9));
        System.out.println("Libro en posición 10: "+libros.getAt(10));
        System.out.println("Libro en posición 11: "+libros.getAt(11));

        libros.insert(39,2);

        System.out.println("");
        System.out.println("Se insertó un libro en la posición 2");
        System.out.println("Libro en posición 0: "+libros.getAt(0));
        System.out.println("Libro en posición 1: "+libros.getAt(1));
        System.out.println("Libro en posición 2: "+libros.getAt(2));
        System.out.println("Libro en posición 3: "+libros.getAt(3));
        System.out.println("Libro en posición 4: "+libros.getAt(4));

        libros.delete(3);

        System.out.println("");
        System.out.println("Se eliminó un libro en la posición 3");
        System.out.println("Libro en posición 0: "+libros.getAt(0));
        System.out.println("Libro en posición 1: "+libros.getAt(1));
        System.out.println("Libro en posición 2: "+libros.getAt(2));
        System.out.println("Libro en posición 3: "+libros.getAt(3));
        System.out.println("Libro en posición 4: "+libros.getAt(4));
        System.out.println("Libro en posición 5: "+libros.getAt(5));
        System.out.println("Libro en posición 6: "+libros.getAt(6));
    }

}
