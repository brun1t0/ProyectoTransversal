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

    public AlumnoData() {
        con = Conexion.getConexion();
    }
//    
//    public void guardarAlumno(Alumno alumno){
//    String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) "
//     + "VALUES ("+ alumno.getDni() +", '"+ alumno.getApellido()+"' , '"+ alumno.getNombre()+"' , '"+Date.valueOf(alumno.getFechanac()) +"' ,"+ alumno.isEstado()+")";
// try {                                                                                                                                  
// PreparedStatement ps = con.prepareStatement(sql);
//
//
//
//    ResultSet rs = ps.executeQuery();
//     System.out.println("Recuperar clave");
//    rs = ps.getGeneratedKeys();
// 
//     System.out.println("Se ha recuperado la clave");
// if (rs.next()) {
// alumno.setIdalumno(rs.getInt("idAlumno"));
// JOptionPane.showMessageDialog(null, "Alumno añadido con exito. ID:" + rs.getInt("idAlumno") );
//}
// ps.close();
//
// } catch (SQLException ex) {
// JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage()); 
//
//}
//    }
//    
//}

//public void guardarAlumno(Alumno alumno) {
//        String comandoSql = "INSERT INTO alumno (dni, nombre, apellido, "
//                + "fechaNacimiento, estado) VALUES (?,?,?,?,?)";
//
//        PreparedStatement prepStat;
//        System.out.println("guardar alumno: " + alumno);
//        try {
//            // Consulta para verificar si el valor ya existe
//            String consulta = "SELECT COUNT(*) FROM alumno WHERE dni = " + alumno.getDni();
//            prepStat = con.prepareStatement(consulta);
//            ResultSet resultSet = prepStat.executeQuery();
//            
//
//            if (resultSet.next()) {
//                int count = resultSet.getInt(1);
//                if (count == 0) {
//                    // El valor no existe, puedes insertarlo
//                    prepStat = con.prepareStatement(comandoSql);
//                    resultSet = prepStat.executeQuery();
//                    prepStat.setInt(1, alumno.getDni());
//                    prepStat.setString(2, alumno.getNombre());
//                    prepStat.setString(3, alumno.getApellido());
//                    prepStat.setDate(4, Date.valueOf(alumno.getFechanac()));
//                    prepStat.setBoolean(5, alumno.isEstado());
//
//                    prepStat.executeUpdate();
//                } else {
//                    // El valor ya existe, realiza alguna acción apropiada
//                    System.out.println("El valor ya existe en la tabla.");
//                }
//            }
//
//            resultSet = prepStat.getGeneratedKeys(); //recupero el Id
//
//            if (resultSet.next()) {
//                alumno.setIdalumno(resultSet.getInt("idAlumno"));
//            }
//
//            prepStat.close();
//
//        } catch (SQLException ex) {
//            System.out.println("Error al insertar");
//        }
//    }
    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechanac()));
            ps.setBoolean(5, alumno.isEstado());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    alumno.setIdalumno(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Alumno añadido con éxito. ID: " + alumno.getIdalumno());
                }
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        
        }
    }  
}

