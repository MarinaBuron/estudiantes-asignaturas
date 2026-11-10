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
    
        String mensaje = ("AVISO: la nota media ha sido actualizada.");
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
    
    /**
     * Método getter que devuelve el nombre
     * Necesario porque el atributo nombre es private
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Método getter que devuelve la edad
     * Necesario porque el atributo edad es private
     */
    public int getEdad(){
        return edad;
    }
    
    /**
     * Método getter que devuelve la nota media
     * Necesario porque el atributo notaMedia es private
     */
    public double getNotaMedia(){
        return notaMedia;
    }
    
    /**
     * Método setter para poder ver el nombre, pero no lo devuelve
     */
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    /**
     * Método setter para poder ver la edad, pero no lo devuelve
     */
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }
}
