
package org.example.caso1;
import java.util.Scanner;

public class UsuarioSimple {

    public static void main(String[] args) {
        /*  CASO 1: Lectura de datos simples con Scanner
Consigna: Desarrolla un programa en Java que solicite datos por teclado usando la clase
Scanner. El programa debe ser guardado en la carpeta `caso1/` y subido al repositorio con
commits explicativos */ 
        
        Scanner miEntrada = new Scanner (System.in);
       
        String nombre, apellido, facultad, carrera, id;  
        int edad,ciclo;
        
        System.out.println("-----BIENBENIDO ESTUDIANTES DE LA UPN-----");
        
        System.out.println("- Ingresa tu nombre completo: ");
        nombre = miEntrada.nextLine();
        
         System.out.println("ingresa tus apellidos: ");
        apellido = miEntrada.nextLine();
        
        System.out.println("- Ingresa tu ID: ");
       id = miEntrada.nextLine();
       
        System.out.println("- Ingresa tu edad: ");
       edad= miEntrada.nextInt();
       miEntrada.nextLine();
       
       System.out.println("- Ingresa tu facultad: ");
       facultad= miEntrada.nextLine();
       
       System.out.println("- Ingresa tu carrea: ");
       carrera = miEntrada.nextLine();
       
       System.out.println("- Ingresa el ciclo en el que te encuentras: ");
       ciclo = miEntrada.nextInt();
       
       System.out.println("-----GRACIAS POR TU VISTA-----");
        
        
    }
    
}
