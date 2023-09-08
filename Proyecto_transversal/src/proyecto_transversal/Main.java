/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_transversal;

import java.sql.Connection;
import proyecto_transversal.AccesoDatos.Conexion;

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
        
        Connection con=Conexion.getConexion();
    }
    
}
