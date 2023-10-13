/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;
//documentacion
/**
 *
 * @author Urbano Meza Joseph Gael
 * Los atributos que contiene la clase persona
 */
public class Persona {
    private String nombre,direccion;
    private int edad;
    
    /**
     * Constructor vacio de persona
     */
    public Persona() {
    }
    
    /**
     * Constructor lleno de persona
     * @param nombre Indica el nombre de la persona en String
     * @param direccion La direccion de la persona en String
     * @param edad La edad de la persona representada en primitivo entero (int)
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    /**
     * Metodo getNombre
     * @return regresa el nombre de la persona
     */
    
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo getDireccion
     * @return regresa el nombre de la direccion que declaremos
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo getEdad
     * @return regresa la edad que decidamos poner a nuestra persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo setNombre
     * @param nombre Indica el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo setDireccion
     * @param direccion Indica la direccion que tendra nuestra persona
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    //Metodos objetivo
    /**
     * Metodo que nos permite modificar
     * para que la persona hable
     * @param mensaje lo que la persona esta diciendo
     */
    public void hablar(String mensaje){
        System.out.println(mensaje);
    }
     
    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return estamos regresando una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
   
    
    
    
}
