package main;

import java.util.Comparator;

public class Persona{

    String rfc;
    String nombre;
    int edad;
    String direccion;

    public Persona(String rfc, String nombre, int edad, String direccion) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "RFC: " + rfc + ", Nombre: " + nombre + ", Edad: " + edad + ", Direccion: " + direccion+"\n";
    }
    

}

