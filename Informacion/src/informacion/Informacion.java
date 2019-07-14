
package informacion;



public class Informacion {

    public static void main(String[] args) {
    Profesion educacion = new Profesion();
    educacion.setNombre("Franklin Caceres");
    educacion.setCodigo(3872);
    educacion.setClase("Matematicas");
    educacion.setHorario (1110);
    educacion.setSalida(1200);
    educacion.setAlumnos (25);

    System.out.println("Nombre Completo: " + educacion.getNombre() );
    System.out.println("Codigo: " + educacion.getCodigo() );
    System.out.println("Clase: " + educacion.getClase() );
    System.out.println("Horario Entrada: " + educacion.getHorario() + "AM" );
    System.out.println("Horario Salida: " + educacion.getSalida() + "PM" );
    System.out.println("Alumnos: " + educacion.getAlumnos() );

    }
} 
    
    

