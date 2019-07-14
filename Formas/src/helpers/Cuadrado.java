/*
 * To change this license header, choose License Headers /**
 *
 * @author COMPAQ
in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

 
public class Cuadrado extends Forma{
     public Cuadrado(){
        setNombre("Cuadrado");
        setDato("Area");
        setCalculo(calculo);
    }
    private void setCalculo(double d) {
        calculo = 5*2/2;
  }
}

