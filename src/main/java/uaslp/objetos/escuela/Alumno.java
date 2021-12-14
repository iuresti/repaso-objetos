package uaslp.objetos.escuela;


import java.time.LocalDate;

public class Alumno {

    private final String nombre;
    private final String clave;
    private final int anioDeIngreso;
    private final String claveDeCarrera;
    private final LocalDate fechaNacimiento;


    public Alumno(String nombre, String clave, int anioDeIngreso, String claveDeCarrera, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.clave = clave;
        this.anioDeIngreso = anioDeIngreso;
        this.claveDeCarrera = claveDeCarrera;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre(){
        return nombre;
    }

    public String getClave(){
        return clave;
    }

    public int getAnioDeIngreso(){
        return anioDeIngreso;
    }

    public String getClaveDeCarrera(){
        return claveDeCarrera;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public static AlumnoBuilder builder() {
        return new AlumnoBuilder();
    }
}