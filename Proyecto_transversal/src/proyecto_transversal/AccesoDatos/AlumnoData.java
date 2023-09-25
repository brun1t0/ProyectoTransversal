/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_transversal.AccesoDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    
    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) "
                + "VALUES (" + alumno.getDni() + ", '" + alumno.getApellido() + "' , '" + alumno.getNombre() + "' , '" + Date.valueOf(alumno.getFechanac()) + "' ," + alumno.isEstado() + ")";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.executeUpdate();
            System.out.println("Recuperar clave");
            ResultSet rs = ps.getGeneratedKeys();

            System.out.println("Se ha recuperado la clave");
            if (rs.next()) {
                alumno.setIdalumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito. ID:" + rs.getInt(1));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());

        }
    }
    public Alumno buscarAlumno(int id){
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = true";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
       
            if (rs.next()) {
                alumno=new Alumno();
                alumno.setIdalumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("Apellido"));
                alumno.setNombre(rs.getString("Nombre"));
                alumno.setFechanac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                
         /*      Esta linea de codigo es solo para comprobar si busca el alumno
            System.out.println("Alumno encontrado:");
            System.out.println("ID: " + alumno.getIdalumno());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Fecha de Nacimiento: " + alumno.getFechanac());
            System.out.println("Estado: " + alumno.isEstado());
         */   
            }else{
                  JOptionPane.showMessageDialog(null,"No existe el alumno");
                 
            } ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }
      return alumno;
    }   
    
    public Alumno buscarAlumnoPorDni(int dni){
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = true";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()) {
                alumno=new Alumno();
                alumno.setIdalumno(rs.getInt("idAlumno"));
                alumno.setDni (rs.getInt("dni"));
                alumno.setApellido(rs.getString("Apellido"));
                alumno.setNombre(rs.getString("Nombre"));
                alumno.setFechanac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                
         //      Esta linea de codigo es solo para comprobar si busca el alumno
            System.out.println("Alumno encontrado:");
            System.out.println("ID: " + alumno.getIdalumno());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Fecha de Nacimiento: " + alumno.getFechanac());
            System.out.println("Estado: " + alumno.isEstado());
           
            }else{
                  JOptionPane.showMessageDialog(null,"No existe el alumno");
                 
            } ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }
        return alumno;
    }
    public List<Alumno> listarAlumnos(){
            ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            String sql ="SELECT * FROM alumno  WHERE estado = 1";
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdalumno(rs.getInt("idAlumno"));
                alumno.setDni (rs.getInt("dni"));
                alumno.setApellido(rs.getString("Apellido"));
                alumno.setNombre(rs.getString("Nombre"));
                alumno.setFechanac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
               ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }
        return alumnos;
        
    }
    public void modificarAlumno (Alumno alumno){
        String sql ="UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNac = ? WHERE IdAlumno =?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechanac()));
            ps.setInt(5, alumno.getIdalumno());
            int exito = ps.executeUpdate();
            if (exito == 1){
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "Error Alumno no existe");
            }
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        
    }
    
    public void eleminarAlumno(int id){
        try{
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno =?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int filas = ps.executeUpdate();
            if (filas > 0){
            JOptionPane.showMessageDialog(null,"Se elimino el alumno");
            }            
            ps.close();
            
        
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno: " + e.getMessage());
             
        }
        
    }
    
    }