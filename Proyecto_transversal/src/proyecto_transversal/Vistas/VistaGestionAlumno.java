package proyecto_transversal.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import proyecto_transversal.AccesoDatos.AlumnoData;
import proyecto_transversal.Entidades.Alumno;

public class VistaGestionAlumno extends javax.swing.JInternalFrame {

    public VistaGestionAlumno() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTFDni = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jTFNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jTFApellido = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jBnuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDCfechaNac = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alumno");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jRBEstado.setText("Estado");

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Documento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addGap(56, 56, 56))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addGap(90, 90, 90)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(jTFNombre)
                                            .addComponent(jTFApellido)
                                            .addComponent(jTFDni))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(jBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTFApellido)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jRBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
       
        try {
        int dni = Integer.parseInt(jTFDni.getText());
        AlumnoData alumnoData = new AlumnoData();
        Alumno alumno = alumnoData.buscarAlumnoPorDni(dni);            
        if (alumno != null) {
            jTFNombre.setText(alumno.getNombre());
            jTFApellido.setText(alumno.getApellido());
            if (alumno.isEstado() == true){
                jRBEstado.setEnabled(true);
                jRBEstado.setSelected(alumno.isEstado());
            }else{
                jRBEstado.setEnabled(false);
                jRBEstado.setSelected(alumno.isEstado());
            }
            // Convertir LocalDate a Date
            LocalDate localDate = alumno.getFechanac();
            java.sql.Date fechaNacimiento = java.sql.Date.valueOf(localDate);
            
            // Establecer la fecha de nacimiento en el JDateChooser
            jDCfechaNac.setDate(fechaNacimiento);
       // } else {
        //    JOptionPane.showMessageDialog(null, "No existe el alumno");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo de documento.");
    }
             
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
       try {
      
        int dni = Integer.parseInt(jTFDni.getText());
        
        AlumnoData alumnoData = new AlumnoData();
       
        int idAlumno = alumnoData.obtenerIdAlumnoPorDNI(dni);

        // Verifica si se encontró el idAlumno
        if (idAlumno != -1) {
            // Llamada al método para eliminar el alumno por su id
            alumnoData.eliminarAlumno(idAlumno);
            //JOptionPane.showMessageDialog(null, "Se eliminó el alumno con ID: " + idAlumno);
        //} else {
        //    JOptionPane.showMessageDialog(null, "No se encontró un alumno con el DNI proporcionado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo de documento.");
    }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        
        limpiarpantalla();
      
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
      
        int dni = Integer.parseInt(jTFDni.getText());
        String apellido = jTFApellido.getText();
        String nombre = jTFNombre.getText();
        LocalDate fechaNacimiento = jDCfechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = jRBEstado.isSelected();  // true si está seleccionado, false si no
        Alumno alumno = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
        AlumnoData alumnoData = new AlumnoData();
        alumnoData.guardarAlumno(alumno);
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo de documento.");
    }
    }//GEN-LAST:event_jBguardarActionPerformed

void limpiarpantalla(){
            jTFDni.setText("");
            jTFNombre.setText("");
            jTFApellido.setText("");
            jRBEstado.setSelected(false);
            jDCfechaNac.setDate(null);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDCfechaNac;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables

 

}
