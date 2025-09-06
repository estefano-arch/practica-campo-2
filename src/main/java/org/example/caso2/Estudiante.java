package org.example.caso2;

import java.math.BigDecimal;

public class Estudiante {

    private int edad;
    private String nombre;
    private String apellido;
    private String universidad;
    private String ciclo;
    private BigDecimal promedio;

    public Estudiante() {}

    public Estudiante(int edad, String nombre, String apellido, String universidad, String ciclo, BigDecimal promedio) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.universidad = universidad;
        this.ciclo = ciclo;
        this.promedio = promedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }
}
