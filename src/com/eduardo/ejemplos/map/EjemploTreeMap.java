package com.eduardo.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        persona.put("nombre", "isdh");
        persona.put("apellido", "dh");
        persona.put("apellidoPaterno", "dh");
        persona.put("edad", "26");
        persona.put("email", "isdhdhdh@correo.com");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);
    }
}
