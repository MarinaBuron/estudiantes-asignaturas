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
        System.out.println("Nota media del estudiante: " + notaMedia);
    }
    
    /**
     * Método que muestra la nota media
     */
    public void setNotaMedia(double nuevaNota){
        notaMedia = nuevaNota; //notaMedia es el atributo, nuevaNota es el parámetro
    
        String mensaje = ("AVISO: la nota media ha sido actualizada");
        System.out.println(mensaje);
    }
    
    /**
     * Método que verifica si un estudiante
     * ha aprobado o suspendido
     */
    public boolean estaAprobado(){
        boolean resultado = false;
        if (notaMedia >= 5.0){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}