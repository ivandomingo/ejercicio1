/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.ejer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Persona> mapPersonas = new HashMap<String, Persona>();//map de persona clave string
        List<Persona> personas = new ArrayList<Persona>();



        personas.add(new Persona("123", "pepe", "uno", Sexo.HOMBRE));//añadir a la lista una persona
        personas.add(new Persona("456", "david", "dos", Sexo.HOMBRE));
        personas.add(new Persona("789", "jose", "tres", Sexo.HOMBRE));

        System.out.println(personas.size());

        for (Persona persona : personas) {//volcamos la lista de personas en el dnis de persona
            mapPersonas.put(persona.getDni(), persona);//introducimos la clave y el objeto
        }

        System.out.println(mapPersonas.get("123").getNombreCompleto());//imprimir clave y nombre
        System.out.println("----------");
        System.out.println("Todos los nombres de la lista con el map");

        //Set<String> dnis=mapPersonas.keySet();  //hacemos un set con los dnis que nos devuelve key set
        for (String dnis : mapPersonas.keySet()) {//directamente pasamos el keyset a la variable dni que le hemos pasado
            System.out.println(dnis + " " + mapPersonas.get(dnis).getNombreCompleto());
        }

        /*for (Persona persona:personas) {
         if (persona.getDni().equalsIgnoreCase("123")) {
         System.out.println(persona.getNombreCompleto());
         }
         }*/

        /*persona.setNombre("pepe");//
         persona.setAp1("garcia");
         persona.setSexo(Sexo.HOMBRE);*/


        /*System.out.println(persona.getNombre());
         System.out.println(persona.getNombreCompleto());*/
    }
}
