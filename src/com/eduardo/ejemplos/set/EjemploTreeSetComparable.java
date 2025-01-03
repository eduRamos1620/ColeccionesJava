package com.eduardo.ejemplos.set;

import com.eduardo.ejemplos.modelo.Alumno;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
        sa.add(new Alumno("Juan", 5));
        sa.add(new Alumno("Pedro", 9));
        sa.add(new Alumno("Julia", 6));
        sa.add(new Alumno("Luna", 8));
        sa.add(new Alumno("Toño", 4));
        sa.add(new Alumno("Lupe", 5));

        System.out.println(sa);
    }
}
