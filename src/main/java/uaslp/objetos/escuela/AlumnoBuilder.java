package uaslp.objetos.escuela;

import java.time.LocalDate;

public class AlumnoBuilder {

    private String nombre;
    private String clave;
    private int anioDeNacimiento;
    private String claveDeCarrera;
    private LocalDate fechaDeNacimiento;


    public AlumnoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }


    public AlumnoBuilder clave(String clave) {
        this.clave = clave;
        return this;
    }

    public AlumnoBuilder claveDeCarrera(String claveDeCarrera) {
        this.claveDeCarrera = claveDeCarrera;
        return this;
    }

    public AlumnoBuilder anioDeIngreso(int anioDeNacimiento) {
        this.anioDeNacimiento = anioDeNacimiento;
        return this;
    }

    public AlumnoBuilder fechaNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        return this;
    }

    public Alumno build() {
        return new Alumno(nombre,clave,anioDeNacimiento,claveDeCarrera,fechaDeNacimiento);
    }
}