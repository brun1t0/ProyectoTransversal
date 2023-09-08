/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_transversal.AccesoDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import proyecto_transversal.Entidades.Alumno;

/**
 *
 * @author Usuario
 */
public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData(){
   con = Conexion.getConexion();
}
    
    public void guardarAlumno(Alumno alumno){
    String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) "
     + "VALUES ("+ alumno.getDni() +", '"+ alumno.getApellido()+"' , '"+ alumno.getNombre()+"' , '"+Date.valueOf(alumno.getFechanac()) +"' ,"+ alumno.isEstado()+")";
 try {                                                                                                                                  
 PreparedStatement ps = con.prepareStatement(sql);



 ps.executeUpdate();
 ResultSet rs = ps.getGeneratedKeys();
 if (rs.next()) {
 alumno.setIdalumno(rs.getInt("idAlumno"));
 JOptionPane.showMessageDialog(null, "Alumno añadido con exito. ID:" + rs.getInt("idAlumno") );
}
 ps.close();

 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage()); 

}
    }
    
}
