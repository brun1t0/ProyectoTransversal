
package proyecto_transversal.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "INSERT INTO materia (nombre, año, estado)" 
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
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
        
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia(id, rs.getString("nombre"),rs.getInt("año"), rs.getBoolean("estado"));
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al ejecutar la sentencia");
        }
        
        return materia;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getAnioMateria());
            ps.setBoolean(4, materia.isEstado());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            }else{
                 JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+ ex.getMessage());
        }
    }
    
    public void eliminarMateria(int id){
        try{
            String sql = "UPDATE materia SET  estado = 0 WHERE idMateria = ?" ;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            
            if (filas > 0){
            JOptionPane.showMessageDialog(null, "Se elimino la materia");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+ ex.getMessage());
        }
    }


    public List<Materia> listarMaterias(){
        List<Materia> materias = new ArrayList<>();
        try{
            String sql = "SELECT * FROM materia WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Materia  materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+ ex.getMessage());
        }
        return materias;
    }
}
