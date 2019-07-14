/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import helpers.Estudiante;

/**
 *
 * @author COMPAQ
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante();
        
      
        
        estudiante.establecerNombre("Marbely Juarez");
        estudiante.establecerEdad(22);
        estudiante.establecerExperiencia(4);
        
        System.out.println("Nombre: " + estudiante.obtenerNombre());
        
        System.out.println("Edad: " + estudiante.obtenerEdad() + " años");
        
        System.out.println("Años de experiencia: " + estudiante.obtenerExperiencia());
    }
    
}

 
