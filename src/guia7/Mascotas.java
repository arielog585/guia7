/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import mascotas_entidades.Mascota;

import java.util.Scanner;
/**
 *
 * @author Maquina
 */
public class Mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        Mascota m1 = new Mascota("Lokiss", leer.nextInt(), "Perro");
//        m1.apodo= "Chiquito";
//        m1.nombre= "Chiquito Romero";
//        m1.tipo= "Perro";
//        m1.edad = 14;
//        m1.raza = "Doberman";
//        m1.cola= true;
//        m1.color= "Marron";
          m1.setNombre("Loki");
          m1.pasear(100);
          System.out.println(m1);
    }
    
}
