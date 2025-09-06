package org.example;

import org.example.caso2.Estudiante;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = new Estudiante(27, "Lizbeth", "Morales Quiñe", "UPN", "Ciclo 5", new BigDecimal("19.0"));
        Estudiante estudiante2 = new Estudiante(35, "Jorge", "Autori Davalos", "UPN", "Ciclo 5", new BigDecimal("13.3"));
        Estudiante estudiante3 = new Estudiante(27, "Jessica", "Azurri Zavala", "UPC", "Ciclo 5", new BigDecimal("15.0"));
        List<Estudiante> listaEstudiante = new ArrayList<>();
        listaEstudiante.add(estudiante);
        listaEstudiante.add(estudiante2);
        listaEstudiante.add(estudiante3);

        System.out.println("Ingrese el número de la posición del estudiante que desee ver:");
        int index = sc.nextInt();

        System.out.println("Nombres: "+ listaEstudiante.get(index).getNombre());
        System.out.println("Apellidos: "+ listaEstudiante.get(index).getApellido());
        System.out.println("Edad: "+listaEstudiante.get(index).getEdad());
        System.out.println("Universidad: "+listaEstudiante.get(index).getUniversidad());
        System.out.println("Ciclo: "+listaEstudiante.get(index).getCiclo());
        System.out.println("Promedio: " + listaEstudiante.get(index).getPromedio());
    }
    }
