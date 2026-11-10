package com.instituto.gestion;


/**
 * Clase principal que ejecutará el programa
 * contiene el método main
 */
public class Principal {
    public static void main(String[] args){
        System.out.println("El sistema se ha iniciado");
        
        //Creando un objeto usando la clase (molde) Estudiante
        Estudiante estudiante1 = new Estudiante();
        //Asignando los datos nombre y edad son los setters
        estudiante1.setNombre("Ana García");
        estudiante1.setEdad(20);
        
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Luis Martos");
        estudiante2.setEdad(22);
        
        //Llamada a los métodos de la clase Estudiante
        System.out.println("Mostrar los datos del estudiante 1");
        estudiante1.mostrarInformacion();
        
        System.out.println("Mostrar los datos del estudiante 2");
        estudiante2.mostrarInformacion();
        
        //Usando los otros métodos
        System.out.println("Actualizando notas...");
        estudiante1.setNotaMedia(7.5);
        estudiante2.setNotaMedia(4.2);
        
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        
        System.out.println("¿Ha aprobado " + estudiante1.getNotaMedia() + "? " + estudiante1.estaAprobado());
        System.out.println("¿Ha aprobado " + estudiante2.getNotaMedia() + "? " + estudiante2.estaAprobado());
    }
}