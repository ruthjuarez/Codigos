
package aprobacion;

import java.util.Scanner;

public class Aprobacion {

    public static void main(String[] args) {
        String nombre;
       int nota;
       String resultado;
       
       Scanner teclado=new Scanner(System.in);
       
       System.out.println("Por favor Ingrese su Nombre:");
       nombre=teclado.nextLine();
       System.out.println("Calificacion:");
       nota=teclado.nextInt();
      
       if(nota>=70){
       System.out.println("APROBADO");
    }else if(nota < 70){
        System.out.println("REPROBADO");
    } 
   } 
}

    
    

