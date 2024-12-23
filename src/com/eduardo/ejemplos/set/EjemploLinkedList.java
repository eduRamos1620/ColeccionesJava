package com.eduardo.ejemplos.set;

import com.eduardo.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + " size: " + enlazada.size());
        System.out.println("esta vacia: " + enlazada.isEmpty());
        enlazada.add(new Alumno("Juan", 5));
        enlazada.add(new Alumno("Pedro", 9));
        enlazada.add(new Alumno("Julia", 6));
        enlazada.add(new Alumno("Luna", 8));
        enlazada.add(new Alumno("Toño", 4));
        System.out.println(enlazada + " size: " + enlazada.size());

        enlazada.addFirst(new Alumno("Chema", 6));
        enlazada.addLast(new Alumno("Pepe", 7));
        System.out.println(enlazada + " size: " + enlazada.size());

        System.out.println("Primer elemento: " + enlazada.getFirst());
        System.out.println("Ultimo elemento: " + enlazada.getLast());

        enlazada.removeFirst();
        enlazada.removeLast();

        System.out.println(enlazada + " size: " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }
        
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
