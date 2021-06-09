package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.time.Month;

public class Alumno {
    private String name;
    private String clave;
    private String claveDeCarrera ;
    private int anioDeIngreso ;
    private LocalDate fechaNacimiento;

    public static Alumno builder(){
        return new Alumno();
    }

    public String getNombre() {
        return name;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Alumno nombre(String name){
        this.name = name;
        return this;
    }

    public Alumno clave(String clave){
        this.clave = clave;
        return this;
    }
    public Alumno claveDeCarrera(String claveDeCarrera){
        this.claveDeCarrera = claveDeCarrera;
        return this;
    }
    public Alumno anioDeIngreso(int anioDeIngreso){
        this.anioDeIngreso = anioDeIngreso;
        return this;
    }
    public Alumno fechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }
    public Alumno build(){
        return this;
    }
}
