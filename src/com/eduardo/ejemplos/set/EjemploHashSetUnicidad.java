package com.eduardo.ejemplos.set;

import com.eduardo.ejemplos.modelo.Alumno;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Juan", 5));
        sa.add(new Alumno("Pedro", 9));
        sa.add(new Alumno("Julia", 6));
        sa.add(new Alumno("Luna", 8));
        sa.add(new Alumno("Toño", 4));
        sa.add(new Alumno("Lupe", 5));
        sa.add(new Alumno("Lupe", 5));

        System.out.println(sa);

        System.out.println("Iterndo usando foreach");
        for (Alumno a : sa){
            System.out.println(a);
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println("iterando usando Stream forEach ");
        sa.forEach(a -> System.out.println(a));
    }
}
