package com.eduardo.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put(null, "12345");
        persona.put("nombre", "isdh");
        persona.put("apellido", "dh");
        persona.put("apellidoPaterno", "dh");
        persona.put("edad", "26");
        persona.put("email", "isdhdhdh@correo.com");
        System.out.println("Persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);
    }
}
