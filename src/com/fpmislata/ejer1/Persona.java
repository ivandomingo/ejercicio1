/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.ejer1;

/**
 *
 * @author alumno
 */
public class Persona {

    private String nombre;
    private String ap1;
    private Sexo sexo;
    private String dni;

    public Persona(String dni,String nombre, String ap1, Sexo sexo){
        this.dni=dni;
        this.nombre=nombre;
        this.ap1=ap1;
        this.sexo=sexo;
    }
    public Persona(){
    }
      
    public String getNombre() {
        return this.nombre;
    }

    public String getAp1() {
        return this.ap1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public Sexo getSexo(){
        return this.sexo;
    }
    
    public void setSexo(Sexo sexo){
        this.sexo=sexo;
    }
    public String getNombreCompleto(){
        return this.nombre+" "+this.ap1;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
