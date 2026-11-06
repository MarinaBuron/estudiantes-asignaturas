package com.instituto.gestion;


/**
 * Clase Estudiante creada para instituto,
 * dentro de gestión
 * @author Marina Burón
 */
public class Estudiante {
    //Esta es la definición de la clase
    private String nombre;
    private int edad;
    private double notaMedia; //la nota media puede ser decimal
    
    /**
     * Método para mostrar información
     */
    public void mostrarInformacion(){
    System.out.println("Nombre del estudiante: " + nombre);
    System.out.println("Edad del estudiante: " +  edad);
    }
}