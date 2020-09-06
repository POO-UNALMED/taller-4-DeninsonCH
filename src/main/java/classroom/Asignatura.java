package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;
    

    Asignatura() {
        this("Sin nombre");

        this.codigoInterno=0;
        this.codigoExterno=0;
    }

    Asignatura(int codigoInterno, int codigoExterno) {
        this("Sin nombre", codigoInterno, codigoExterno);
    }


    Asignatura(String nombre) {
        this.nombre=nombre;
        
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatosI(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
