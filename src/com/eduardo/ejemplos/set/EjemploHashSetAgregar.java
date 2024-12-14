package com.eduardo.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs);
        boolean duplicado = hs.add("tres");
        System.out.println("Se puede duplicar un elemento" + duplicado);
        System.out.println(hs);
    }
}
