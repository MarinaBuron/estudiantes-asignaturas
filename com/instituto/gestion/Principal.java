package com.instituto.gestion;


/**
 * Clase principal que ejecutará el programa
 * contiene el método main
 */
public class Principal {
    public static void main(String[] args){
        System.out.println("El sistema se ha iniciado");
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Ana García");
        estudiante1.setEdad(20);
        
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Luis Martos");
        estudiante2.setEdad(22);
        
    }
}