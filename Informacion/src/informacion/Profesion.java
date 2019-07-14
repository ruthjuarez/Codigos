
package informacion;

public class Profesion {
     private String nombre;
    private int codigo;
    private  String clase;
    private int horario;
    private int salida;
    private int alumnos;
   
    public String getNombre(){
        return nombre;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getClase(){
        return clase;
    }
    public int getHorario(){
        return horario;
    }
    public int getSalida(){
    return salida;
    } 
    public int getAlumnos(){
        return alumnos;
    }
       
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    public void setClase(String clase){
        this.clase =clase;
    }
    public void setHorario(int horario){
        this.horario = horario;
    }
    public void setSalida(int salida){
        this.salida=salida;
    }
    public void setAlumnos(int alumnos){
        this.alumnos =alumnos;
   }
}
  

