package proyecto_transversal.Vistas;

import java.util.ArrayList;
import java.util.List;
import proyecto_transversal.AccesoDatos.AlumnoData;
import proyecto_transversal.AccesoDatos.InscripcionData;
import proyecto_transversal.Entidades.Alumno;
import proyecto_transversal.Entidades.Inscripciones;
import proyecto_transversal.Entidades.Materia;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_transversal.AccesoDatos.MateriaData;

/**
 *
 * @author Lucas
 */
public class VistaInscripciones extends javax.swing.JInternalFrame {

    private InscripcionData inscripciondata = new InscripcionData();
    private AlumnoData alumnosdata = new AlumnoData();
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };
    private int botonSeleccionado = 0;

    public VistaInscripciones() {
        
        initComponents();
        for (Alumno listarAlumno : alumnosdata.listarAlumnos()) {
            cbAlumnos.addItem(listarAlumno);
        }
        InsertarModeloATabla();
        rowCount.setText(modeloTabla.getRowCount() + "");
        bInscribir.setEnabled(false);
        bAnularInscripcion.setEnabled(false);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupBotones = new javax.swing.ButtonGroup();
        rbMateriasInscriptas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bAnularInscripcion = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bInscribir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rbMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tTablaInscripciones = new javax.swing.JTable();
        rowCount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        grupBotones.add(rbMateriasInscriptas);
        rbMateriasInscriptas.setText("Materias Inscriptas");
        rbMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMateriasInscriptasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de Materias");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        bAnularInscripcion.setText("Anular inscripción");
        bAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnularInscripcionActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bInscribir.setText("Inscribir");
        bInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInscribirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno");

        cbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAlumnosItemStateChanged(evt);
            }
        });
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });
        cbAlumnos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbAlumnosPropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Formulario de Inscripcion");

        grupBotones.add(rbMateriasNoInscriptas);
        rbMateriasNoInscriptas.setText("Materias no inscriptas");
        rbMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMateriasNoInscriptasActionPerformed(evt);
            }
        });

        tTablaInscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Short.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tTablaInscripciones);
        if (tTablaInscripciones.getColumnModel().getColumnCount() > 0) {
            tTablaInscripciones.getColumnModel().getColumn(0).setHeaderValue("ID");
            tTablaInscripciones.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            tTablaInscripciones.getColumnModel().getColumn(2).setHeaderValue("Año");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(rowCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(rbMateriasInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbMateriasNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bAnularInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(bSalir))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                .addGap(87, 87, 87)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(32, 32, 32)))))))
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMateriasNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMateriasInscriptas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bInscribir)
                            .addComponent(bSalir)
                            .addComponent(bAnularInscripcion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rowCount)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void bAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnularInscripcionActionPerformed
        try {
            Alumno alumno = cbAlumnos.getItemAt(cbAlumnos.getSelectedIndex());
            int IDAlumno = alumno.getIdalumno();
            int IDMateria = (int) modeloTabla.getValueAt(tTablaInscripciones.getSelectedRow(), 0);

            inscripciondata.borrarInscripcionMateriaAlumno(IDAlumno, IDMateria);

            eliminarTodosLosElementosDeLaTabla();
            actualizarMateriasInscriptas();

        } catch (ArrayIndexOutOfBoundsException aibe) {
            JOptionPane.showMessageDialog(null, "¡Debes escoger almenos una materia!");
        }catch(NullPointerException np ){
            JOptionPane.showMessageDialog(this, "La tabla está vacía. Debe ingresar almenos una materia");
        }
    }//GEN-LAST:event_bAnularInscripcionActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        
        removeAll();
        repaint();
        setVisible(false);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInscribirActionPerformed
        try {
            Alumno alumno = cbAlumnos.getItemAt(cbAlumnos.getSelectedIndex());

            int ID = (int) modeloTabla.getValueAt(tTablaInscripciones.getSelectedRow(), 0);
            String nombre = (String) modeloTabla.getValueAt(tTablaInscripciones.getSelectedRow(), 1);
            int anio = (int) modeloTabla.getValueAt(tTablaInscripciones.getSelectedRow(), 2);

            Materia materia = new Materia(ID, nombre, anio, true);

            Inscripciones insc = new Inscripciones(ID, alumno, materia);

            inscripciondata.guardarInscripcion(insc);
            eliminarTodosLosElementosDeLaTabla();
            actualizarMateriasNoInscriptas();
        } catch (ArrayIndexOutOfBoundsException aibe) {
            JOptionPane.showMessageDialog(null, "¡Debes escoger almenos una materia!");
        }catch(NullPointerException np ){
            JOptionPane.showMessageDialog(this, "La tabla está vacía. Debe ingresar almenos una materia");
        }
    }//GEN-LAST:event_bInscribirActionPerformed

    private void rbMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMateriasNoInscriptasActionPerformed
        bInscribir.setEnabled(true);
        bAnularInscripcion.setEnabled(false);
        eliminarTodosLosElementosDeLaTabla();
        actualizarMateriasNoInscriptas();

    }//GEN-LAST:event_rbMateriasNoInscriptasActionPerformed

    private void rbMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMateriasInscriptasActionPerformed
        bInscribir.setEnabled(false);
        bAnularInscripcion.setEnabled(true);
        eliminarTodosLosElementosDeLaTabla();
        actualizarMateriasInscriptas();
    }//GEN-LAST:event_rbMateriasInscriptasActionPerformed

    private void cbAlumnosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbAlumnosPropertyChange

    }//GEN-LAST:event_cbAlumnosPropertyChange

    private void cbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAlumnosItemStateChanged
        if (rbMateriasNoInscriptas.isSelected()) {
            eliminarTodosLosElementosDeLaTabla();
            actualizarMateriasNoInscriptas();
        } else if (rbMateriasInscriptas.isSelected()) {
            eliminarTodosLosElementosDeLaTabla();
            actualizarMateriasInscriptas();
        }
    }//GEN-LAST:event_cbAlumnosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnularInscripcion;
    private javax.swing.JButton bInscribir;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.ButtonGroup grupBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbMateriasInscriptas;
    private javax.swing.JRadioButton rbMateriasNoInscriptas;
    private javax.swing.JLabel rowCount;
    private javax.swing.JTable tTablaInscripciones;
    // End of variables declaration//GEN-END:variables

    public void InsertarModeloATabla() {
        tTablaInscripciones.setModel(modeloTabla);
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Año");

    }

    public void eliminarTodosLosElementosDeLaTabla() {
//    modeloTabla.getDataVector().removeAllElements();
//    tTablaInscripciones.updateUI();

        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    public void actualizarMateriasNoInscriptas() {
        try{
        Alumno alum = (Alumno) cbAlumnos.getSelectedItem();

        for (Materia listarMateria : inscripciondata.obtenerMateriasNoCursadas(alum.getIdalumno())) {

            int ID = listarMateria.getIdMateria();
            String nombre = listarMateria.getNombre();
            int anio = listarMateria.getAnioMateria();

            modeloTabla.addRow(new Object[]{ID, nombre, anio});

            rowCount.setText(modeloTabla.getRowCount() + "");
        }
        }catch(NullPointerException np){
        JOptionPane.showMessageDialog(this, "Debe ingresar almenos un alumno/materia en la base de datos.");
        }
    }

    public void actualizarMateriasInscriptas() {
       try{
        Alumno alum = (Alumno) cbAlumnos.getSelectedItem();

        for (Materia listarMateria : inscripciondata.obtenerMateriasCursadas(alum.getIdalumno())) {

            int ID = listarMateria.getIdMateria();
            String nombre = listarMateria.getNombre();
            int anio = listarMateria.getAnioMateria();
            
            modeloTabla.addRow(new Object[]{ID, nombre, anio});
            
        }
    }catch(NullPointerException np ){
    JOptionPane.showMessageDialog(this, "Debe ingresar almenos un alumno/materia en la base de datos.");
}
    }
}
