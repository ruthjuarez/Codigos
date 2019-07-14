
package instancia;

import java.util.Scanner;

public class resources {
    public void Saludo(){

        System.out.println("Estoy aprendiendo, pero seré el mejor\n" +
         "programador");
    }
    public void Nota(){
        int numero;
       Scanner c= new Scanner (System.in);
       System.out.println("Por favor ingrese su nota");
       numero=c.nextInt();
       if(numero >=70){
       System.out.println("Aprobado");
       }else if (numero< 70){
       System.out.println("Reprobado");
       }
    }
    
    public void Division(){
    int entero;
    int dividir;
    double resultado;
    System.out.println("Por favor ingrese el primer numero");
    Scanner d= new Scanner (System.in);
    entero=d.nextInt();
    System.out.println("Por favor ingrese el segundo numero");
    dividir=d.nextInt();
    
    if(dividir==0){
         System.out.println("No se permite dividir entre este numero");
    }else {
         resultado=entero/dividir;
         System.out.println("El resultado es:"+resultado);
         
    
            }

    
    }public void Conteo(){
       Scanner t=new Scanner(System.in);
     int x;
       System.out.println("Por favor ingrese el numero:");
        x=t.nextInt();
       int sumador;
      for(sumador = 0; sumador <= x; sumador++){
      
      System.out.println(sumador);
     
      }    
    }  
} 

