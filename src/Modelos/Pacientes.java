/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author umg
 */
public class Pacientes {
    
    String Apellidos;
    String Nombre;
    String Edad;

    public Pacientes(String Apellidos, String Nombre, String Edad) {
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    
    
}
