package com.instituto.gestion;


/**
 * Write a description of class Asignatura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asignatura {
    //Atributos de la clase
    private String nombre;
    private int creditos;
    
    /**
     * Método setter para guardar el nombre
     */
    public void setNombre(String elNombre){
        nombre = elNombre;
    }
    
    /**
     * Método setter para guardar los créditos
     */
    public void setCreditos(int losCreditos){
        creditos = losCreditos;
    }
    
    /**
     * Método para mostrar el nombre y los créditos de la asignatura
     */
    public void mostrarInfoAsignatura(){
        System.out.println(nombre + " tiene " + creditos + " créditos");
    }
}