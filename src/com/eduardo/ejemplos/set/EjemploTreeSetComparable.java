package com.eduardo.ejemplos.set;

import com.eduardo.ejemplos.modelo.Alumno;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("juan", 5));
        sa.add(new Alumno("Pedro", 9));
        sa.add(new Alumno("julia", 6));
        sa.add(new Alumno("luna", 8));
        sa.add(new Alumno("toño", 4));
        sa.add(new Alumno("lupe", 5));

        System.out.println(sa);
    }
}
