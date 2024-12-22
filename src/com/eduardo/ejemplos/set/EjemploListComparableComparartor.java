package com.eduardo.ejemplos.set;

import com.eduardo.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparartor {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Juan", 5));
        sa.add(new Alumno("Pedro", 9));
        sa.add(new Alumno("Julia", 6));
        sa.add(new Alumno("Luna", 8));
        sa.add(new Alumno("Toño", 4));
        sa.add(new Alumno("Lupe", 5));
        sa.add(new Alumno("Lupe", 5));
        //Collections.sort(sa, (a, b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
        sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        System.out.println(sa);

        System.out.println("iterando usando Stream forEach ");
        sa.forEach(a -> System.out.println(a));
    }
}
