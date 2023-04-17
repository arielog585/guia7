/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas_entidades;

/**
 *
 * @author Maquina
 */
    public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private String raza;
    private int edad;
    private boolean cola;
    private int energia;

    public Mascota(){
        this.energia=1000;
    }
    
    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.energia=1000;
        
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    public String getNombre(){
        return nombre;
    }
    
  
    public int pasear(int energiaRestar) {
    energia= energia-energiaRestar;
    return energia;
    }
    
    /**
     * funcion para pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia 
     */
    public int pasear(int energiaRestar, int vueltas) {
        for (int i = 0; i < vueltas; i++) {
            energia= energia-energiaRestar;
        } 
    return energia;
    }
    
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }
    
    
    }
   
