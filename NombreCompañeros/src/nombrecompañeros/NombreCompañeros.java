/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombrecompañeros;

/**
 *
 * @author COMPAQ
 */
public class NombreCompañeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[]personas=new String[10];
		int []edades=new int[8];
		boolean[] estados=new boolean[6];
		
		
		personas[0]="Eduardo Rivera";
		personas[1]="Jorge Tinoco";
                personas[2]="Mario Santos";
                personas[3]="Juan Carlos Rodriguez";
                personas[4]="David Mejia";
                personas[5]="Ana Chavez";
                personas[6]="Juan Argueta";
                personas[7]="Dany Cruz";
                personas[8]="Cristian Hernandez";
                personas[9]="Juan Angel Zuniga";
                
		
		for(int posicion =0;posicion< personas.length;posicion++){
			System.out.println("Persona["+posicion+"]="+personas[posicion]);
  }
 }
}
  
