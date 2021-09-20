package edu.uaslp;

import edu.uaslp.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args){

        LinkedList libros = new LinkedList();
        LinkedList alumnos = new LinkedList();

        libros.add(1);
        libros.add(14);
        libros.add(20);
        libros.add(21);

        alumnos.add(22);
        alumnos.add(5);

        System.out.println("Libros size: "+libros.getSize());
        System.out.println("Alumnos size: "+alumnos.getSize());

        System.out.println("Libros en posicion 0: "+libros.getAt(0));
        System.out.println("Libros en posicion 1: "+libros.getAt(1));
        System.out.println("Libros en posicion 2: "+libros.getAt(2));
        System.out.println("Libros en posicion 3: "+libros.getAt(3));
        System.out.println("");

        libros.delete(2);
        System.out.println("--Lista libros con un elemento borrado en la posicion 2--");

        System.out.println("Libros en posicion 0: "+libros.getAt(0));
        System.out.println("Libros en posicion 1: "+libros.getAt(1));
        System.out.println("Libros en posicion 2: "+libros.getAt(2));
        System.out.println("Libros en posicion 3: "+libros.getAt(3));
        System.out.println("");
        System.out.println("Libros size: "+libros.getSize());
        System.out.println("");

        libros.insert(2021,2);

        System.out.println("--Lista libros con un elemento insertado en la posicion 2--");

        libros.printList();

        alumnos.add(123456789);

        System.out.println("--Lista alumnos con un elemento insertado en la posicion 2--");

        alumnos.printList();

        System.out.println("Libros size: "+libros.getSize());
        System.out.println("Alumnos size: "+alumnos.getSize());


        //Me permití crear un método para imprimir las listas para no tener que imprimir de uno en uno, pero
        //dejé dos escritos línea por línea y dos con el método para poder visualizarlo de las dos maneras

    }

}
