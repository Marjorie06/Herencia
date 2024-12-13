/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia.Clase;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Coordinador extends Personas{
    private String id;
    private String titulo;
    private String cargo;

    public Coordinador(String id, String titulo, String cargo, String nombre, String apellido, String cedula, String genero, int edad) {
        super(nombre, apellido, cedula, genero, edad);
        this.id = id;
        this.titulo = titulo;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString()+"Coordinador{" + "id=" + id + ", titulo=" + titulo + ", cargo=" + cargo + '}';
    }
    
  
    
        
}
    
    

