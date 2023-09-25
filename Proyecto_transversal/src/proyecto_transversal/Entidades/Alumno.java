package proyecto_transversal.Entidades;

import java.time.LocalDate;

public class Alumno {
    private int idalumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechanac;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int idalumno, int dni, String apellido, String nombre, LocalDate fechanac, boolean estado) {
        this.idalumno = idalumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.estado = estado;
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechanac, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.estado = estado;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return dni + ", " + nombre + ", " + apellido;
    }
    
    
}
