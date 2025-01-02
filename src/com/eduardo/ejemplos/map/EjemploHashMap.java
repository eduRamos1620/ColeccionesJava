package com.eduardo.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos " + !persona.isEmpty());
        persona.put(null, "1234");
        persona.put(null, "12345");
        persona.put("nombre", "isdh");
        persona.put("apellido", "dh");
        persona.put("apellidoPaterno", "dh");
        persona.put("edad", "26");
        persona.put("email", "isdhdhdh@correo.com");
        System.out.println("Persona = " + persona);

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        //String apellidoPaterno = persona.remove("apellidoPaterno)"
        boolean b = persona.remove("apellidoPaterno", "dh");
        System.out.println("eliminado " + b);
        System.out.println("persona = " + persona);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "la playa");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es: " + barrio);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("dh");
        System.out.println("b2 = " + b2);

        Collection<Object> valores = persona.values();
        for (Object v: valores){
            System.out.println(v);
        }

        Set<String> llaves = persona.keySet();
        for (String k : llaves){
            System.out.print(k);
        }

        for (Map.Entry<String, Object> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }
        System.out.println();
        for (String llave : persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            }else {
                System.out.println(llave + " => " + valor);
            }
        }

        System.out.println("total: " + persona.size());
        System.out.println("Contiene elementos " + !persona.isEmpty());
    }
}
