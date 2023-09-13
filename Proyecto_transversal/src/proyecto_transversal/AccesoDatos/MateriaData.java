
package proyecto_transversal.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto_transversal.Entidades.Materia;

public class MateriaData {
    
    private Connection con = null;

    public MateriaData() {
        
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSER INTO materia (nombre, año, estado)" 
                + "VALUES (" + materia.getNombre()+", "+ materia.getAnioMateria()+", "+materia.isEstado()+")";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+ ex.getMessage());
        }
        
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = " + materia.getIdMateria()+"AND estado = 1";
        
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia(id, rs.getString("nombre"),rs.getInt("año"), rs.getBoolean("estado"));
            }else {
                JOptionPane.showMessageDialog(null, "No existe materia con este id");
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al ejecutar la sentencia");
        }
        
        return materia;
    }
}
