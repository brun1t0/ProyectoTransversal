
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

/**
 *
 * @author Usuario
 */
public class InscripcionData {
private Connection con = null;
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
   
        List<Inscripciones> listaInscripciones = new ArrayList<>();
       
    String sql = "SELECT `idInscripto`, `nota`, `idAlumno`, `idMateria` "
            + "FROM `inscripcion` ";
     
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        
        ResultSet rs = ps.executeQuery();
        
        
        while (rs.next()){
            System.out.println(rs.getInt(1));
            Alumno alumno = new Alumno();
            
            alumno = alumnodata.buscarAlumno(rs.getInt(3));
            
            
            Inscripciones insc = new Inscripciones(rs.getInt(1), alumno, rs.getDouble(2));
            
            listaInscripciones.add(insc);
            System.out.println(insc.toString());
        }
        
        for (Inscripciones ins : listaInscripciones) {
           
        }
        
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al enviar la sentencia: " + ex.getMessage());
    }
    return listaInscripciones;
    }

}
