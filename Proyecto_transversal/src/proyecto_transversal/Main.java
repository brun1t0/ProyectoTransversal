/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_transversal;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import proyecto_transversal.AccesoDatos.AlumnoData;
import proyecto_transversal.AccesoDatos.Conexion;
import proyecto_transversal.AccesoDatos.MateriaData;
import proyecto_transversal.Entidades.Alumno;
import proyecto_transversal.Entidades.Materia;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("holaaaaaaaaa");
        
      //  Alumno alumno = new Alumno(12345678, "Suarez", "Alan", LocalDate.of(1999, Month.MARCH, 12), true);
       // AlumnoData alumnodata = new AlumnoData();
       // alumnodata.guardarAlumno(alumno);
        
        Materia materia = new Materia("Historia Universal", 2001,true);
        MateriaData materiadata = new MateriaData();
        materiadata.buscarMateria(5);
       // materiadata.guardarMateria(materia);
        
    }
    
}
