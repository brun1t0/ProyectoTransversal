/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_transversal.AccesoDatos;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
     private static final String URL="jdbc:mariadb://localhost/";
     private static final String DB="universidadulp";
     private static final String USER="root";
     private static final String PASS="";
     private static Connection connection;
            
     private Conexion () {}
     
     public static Connection getConexion() {
     
         if (connection ==null) {
         
             try {
                 Class.forName("org.mariadb.jdbc.Driver");
                 connection = DriverManager.getConnection(URL+DB,USER,PASS);
                 
             } catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(null,"Error al cargar los drivers");
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"Error de conexion con la base de datos");
             }
         }
         return connection;
     }
}
