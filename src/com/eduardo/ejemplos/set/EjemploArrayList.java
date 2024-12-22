package com.eduardo.ejemplos.set;

import com.eduardo.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + " size: " + al.size());
        System.out.println("esta vacia: " + al.isEmpty());
        al.add(new Alumno("Juan", 5));
        al.add(new Alumno("Pedro", 9));
        al.add(new Alumno("Julia", 6));
        al.add(2, new Alumno("Luna", 8));
        al.set(3, new Alumno("Toño", 4));
        System.out.println(al + " size: " + al.size());

        al.remove(new Alumno("Luna", 8));
        //al.remove(3);
        System.out.println(al + " size: " + al.size());

        boolean b = al.contains(new Alumno("Luna", 8));
        System.out.println("La lista contiene a Luna = " + b);

        Object a[] = al.toArray();
        for (int i=0; i<a.length; i++){
            System.out.println("Desde el arreglo = " + a);
        }
    }
}
