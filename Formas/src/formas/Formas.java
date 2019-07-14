/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Lineas;
import helpers.Triangulo;

/**
 *
 * @author COMPAQ
 */
public class Formas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Lineas linea = new Lineas();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
       
        circulo.Dibujar();
        System.out.println("");
        linea.Dibujar();
        System.out.println("");
        triangulo.Dibujar();
        System.out.println("");
        cuadrado.Dibujar();
        
    }
    

    }
    

    

