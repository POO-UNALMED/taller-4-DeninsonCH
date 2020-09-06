package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
   
    
    static{} 
    {
       
        cedula = 0; 
    }
    Persona(){
    	totalPersonas++;
    	this.cedula=0;
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        totalPersonas++;
        this.cedula=1;
    }
    
    long getCedula() {
        return cedula;
    }
    

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
