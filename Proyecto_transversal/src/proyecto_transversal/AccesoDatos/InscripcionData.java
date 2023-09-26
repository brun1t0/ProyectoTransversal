
package proyecto_transversal.AccesoDatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto_transversal.Entidades.Alumno;
import proyecto_transversal.Entidades.Inscripciones;
import proyecto_transversal.Entidades.Materia;

/**
 *
 * @author Usuario
 */
public class InscripcionData {
private Connection con = null;
private AlumnoData alumnodata = new AlumnoData();
private MateriaData materiadata = new MateriaData();
    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripciones insc) {
        String sql = "INSERT INTO `inscripcion`(`nota`, `idAlumno`, `idMateria`) "
                + "VALUES (" + insc.getNota() + "," + insc.getAlumno().getIdalumno() + "," + insc.getMateria().getIdMateria() + ")";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion realizada con exito. ID:" + rs.getInt(1));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
        }
    }
    
    public List<Inscripciones> obtenerInscripciones(){
        AlumnoData alumnodata = new AlumnoData();
        MateriaData materiadata = new MateriaData();
        
        List<Inscripciones> listaInscripciones = new ArrayList<>();
       
    String sql = "SELECT `idInscripto`, `nota`, `idAlumno`, `idMateria` "
            + "FROM `inscripcion` ";
     
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        
        ResultSet rs = ps.executeQuery();
        
        
        while (rs.next()){
            System.out.println(rs.getInt(1));
            
            
            Materia mat = materiadata.buscarMateria(rs.getInt(4));
            Alumno alumno = alumnodata.buscarAlumno(rs.getInt(3));
            Inscripciones insc = new Inscripciones(rs.getInt(1), alumno, mat, rs.getInt(2));
            listaInscripciones.add(insc);
         
        }
       
        ps.close();
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
    }
    return listaInscripciones;
    }
    
    
    
    public List<Inscripciones> obtenerInscripcionesPoralumno(int id) {
        List<Inscripciones> listaInscripcionesPorAlumno = new ArrayList<>();
        AlumnoData alumno = new AlumnoData();
        MateriaData materia = new MateriaData();

        String sql = "SELECT `idInscripto`, `nota`, `idAlumno`, `idMateria` FROM `inscripcion` WHERE idAlumno = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alum = alumno.buscarAlumno(rs.getInt(3));
                Materia mat = materia.buscarMateria(rs.getInt(4));
                Inscripciones insc = new Inscripciones(rs.getInt(1), alum, mat, rs.getInt(2));
                listaInscripcionesPorAlumno.add(insc);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
        }
        
        
        
        
        
    return listaInscripcionesPorAlumno;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> listaMateriasCursadas = new ArrayList<Materia>();
        

        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno =" + id;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia(rs.getInt(1), rs.getString(2), rs.getInt(3), true);   
                listaMateriasCursadas.add(materia);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
        }

        return listaMateriasCursadas;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id){
    List<Materia> listaMateriasNoCursadas= new ArrayList<Materia>();
     
    
    String sql = "SELECT * FROM materia \n" +
                 "WHERE materia.estado = 1 \n" +
                 "AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE inscripcion.idAlumno = "+id+")";
        
    try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
   
                materia = new Materia(rs.getInt(1), rs.getString(2), rs.getInt(3), true);
                listaMateriasNoCursadas.add(materia);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
        }

        return listaMateriasNoCursadas;
    }
    
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
    String sql = "DELETE FROM `inscripcion` WHERE idAlumno = "+ idAlumno +"  AND idMateria = "+ idMateria;
    


    alumnodata.eliminarAlumno(idAlumno);
    materiadata.eliminarMateria(idMateria);

    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al enviar la sentencia: " + ex.getMessage());
        }

    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
    String sql = "UPDATE `inscripcion` SET `nota`= "+nota+"WHERE idAlumno = "+idAlumno+" AND idMateria = "+ idMateria;
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
    }
    
    
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
    List<Alumno> listaAlumnosXMateria = new ArrayList<>();
    AlumnoData alumnodata = new AlumnoData();
    String sql = "SELECT `idAlumno` FROM `inscripcion` WHERE idMateria =" + idMateria;   
    try {
        
       
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
        Alumno alumno = alumnodata.buscarAlumno(rs.getInt(1));
        listaAlumnosXMateria.add(alumno);
            
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
    }
    return listaAlumnosXMateria;
    }
    

}
