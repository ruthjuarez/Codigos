/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanciar;

import java.util.Scanner;

/**
 *
 * @author COMPAQ
 */
public class Instanciar {

   
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        resources hola= new resources();
        hola.Saludo();
        int numero;
        hola.Nota();
        hola.Division();
        hola.Conteo();
        
    }
  }
   
    

