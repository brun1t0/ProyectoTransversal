package proyecto_transversal.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import proyecto_transversal.AccesoDatos.AlumnoData;
import proyecto_transversal.Entidades.Alumno;

public class VistaGestionAlumno extends javax.swing.JInternalFrame {

    public VistaGestionAlumno() {
        initComponents();
        this.setSize(800 ,600);
        this.setTitle("Gestion de Alumnos");
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();
        tituloPrincipal3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        logoULP3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFDni = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Botonera = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jDCfechaNac = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 255, 51));

        Contenido.setBackground(new java.awt.Color(74, 166, 134));

        Cabecera.setBackground(new java.awt.Color(74, 166, 134));

        tituloPrincipal3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloPrincipal3.setForeground(new java.awt.Color(0, 0, 0));
        tituloPrincipal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal3.setText("Alumno");
        tituloPrincipal3.setToolTipText("");

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));

        logoULP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/logoULP.png"))); // NOI18N

        javax.swing.GroupLayout CabeceraLayout = new javax.swing.GroupLayout(Cabecera);
        Cabecera.setLayout(CabeceraLayout);
        CabeceraLayout.setHorizontalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CabeceraLayout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CabeceraLayout.createSequentialGroup()
                        .addComponent(tituloPrincipal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoULP3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CabeceraLayout.setVerticalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoULP3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/buscarIcono.png"))); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de Nacimiento");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estado");

        jRBEstado.setText("Estado");
        jRBEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Documento");

        Botonera.setBackground(new java.awt.Color(74, 166, 134));

        jBnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/nuevoIcono.png"))); // NOI18N
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/eliminarIcono.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/guardarIcono.png"))); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/cerrarIcono.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addComponent(Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContenidoLayout.createSequentialGroup()
                                .addComponent(jRBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(301, 301, 301))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContenidoLayout.createSequentialGroup()
                                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDCfechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFDni, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(jTFApellido)
                                    .addComponent(jTFNombre))
                                .addGap(18, 18, 18)
                                .addComponent(jBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(58, 58, 58))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenidoLayout.createSequentialGroup()
                                .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jRBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115)
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        boolean estado = jRBEstado.isSelected();
        AlumnoData alumnoData = new AlumnoData();
        
        // Verificar si el alumno ya existe por su DNI
        int idAlumno = alumnoData.obtenerIdAlumnoPorDNI(dni);
        
        if (idAlumno != -1) {
            // El alumno ya existe, es una actualización
            Alumno alumno = new Alumno(idAlumno, dni, apellido, nombre, fechaNacimiento, estado);
            alumnoData.modificarAlumno(alumno);
            JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente.");
        } else {
            // El alumno no existe, es un nuevo alumno
            Alumno nuevoAlumno = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
            alumnoData.guardarAlumno(nuevoAlumno);
            JOptionPane.showMessageDialog(null, "Alumno guardado exitosamente.");
        }

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
    private javax.swing.JPanel Botonera;
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscar;
    private com.toedter.calendar.JDateChooser jDCfechaNac;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JLabel logoULP3;
    private javax.swing.JLabel tituloPrincipal3;
    // End of variables declaration//GEN-END:variables

 

}
