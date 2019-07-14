/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import helpers.UNAH;
import helpers.UNITEC;
import helpers.UTH;

/**
 *
 * @author COMPAQ
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           UNAH a= new UNAH();
            UNITEC b= new UNITEC();
            UTH c= new UTH();
         
            System.out.println(a.getUniversidad() + a.getRector() );
            System.out.println(b.getUniversidad() + b.getRector() );
            System.out.println(c.getUniversidad() + c.getRector() );




    }
    
}

    
    

