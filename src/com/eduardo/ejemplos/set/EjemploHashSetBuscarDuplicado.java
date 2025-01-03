package com.eduardo.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String [] peces = {"Covina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado", "Pejerrey"};

        Set<String> unicos = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento duplicado " + pez);
            }
        }
        System.out.println(unicos.size() + " elementos no duplicado " + unicos);
    }
}
