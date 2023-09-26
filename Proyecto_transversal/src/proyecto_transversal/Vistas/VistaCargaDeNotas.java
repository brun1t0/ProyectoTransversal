package proyecto_transversal.Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_transversal.AccesoDatos.AlumnoData;
import proyecto_transversal.AccesoDatos.InscripcionData;
import proyecto_transversal.AccesoDatos.MateriaData;
import proyecto_transversal.Entidades.Alumno;
import proyecto_transversal.Entidades.Materia;
import proyecto_transversal.Entidades.Inscripciones;

/**
 *
 * @author Lucas
 */
public class VistaCargaDeNotas extends javax.swing.JInternalFrame {
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();
    private InscripcionData inscData = new InscripcionData();
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };
    public VistaCargaDeNotas() {
        initComponents();
        
        for (Alumno listarAlumnos : aluData.listarAlumnos()) {
        cboSelectorAlumno.addItem(listarAlumnos);
        }
        crearModeloTabla();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloPrincipal = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        logoULP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboSelectorAlumno = new javax.swing.JComboBox<>();
        tbNotas = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 51));
        setPreferredSize(new java.awt.Dimension(780, 580));

        jPanel1.setBackground(new java.awt.Color(74, 166, 134));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 900));
        jPanel1.setRequestFocusEnabled(false);

        tituloPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("Carga de Notas");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        logoULP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/logoULP.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione un alumno");

        cboSelectorAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSelectorAlumnoItemStateChanged(evt);
            }
        });
        cboSelectorAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelectorAlumnoActionPerformed(evt);
            }
        });

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Short.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNotas.setViewportView(tablaNotas);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbNotas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(127, 127, 127)
                                .addComponent(cboSelectorAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(tituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addGap(146, 146, 146)
                        .addComponent(logoULP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator2)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoULP)
                    .addComponent(tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSelectorAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(tbNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSelectorAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectorAlumnoActionPerformed

    }//GEN-LAST:event_cboSelectorAlumnoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        removeAll();
        repaint();
        setVisible(false);    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboSelectorAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSelectorAlumnoItemStateChanged
        limpiarTabla();
//        mostrarMateriaSeleccionada();
//        cargarTabla();        // TODO add your handling code here:
    
    }//GEN-LAST:event_cboSelectorAlumnoItemStateChanged

    
    //Metodos
    
    public void crearModeloTabla() {
        tablaNotas.setModel(modeloTabla);
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Nota");
    
//        mostrarMateriaSeleccionada();

    }

//    public void mostrarMateriaSeleccionada() {
//       
//       
//        Alumno alu = (Alumno) cboSelectorAlumno.getSelectedItem();
//
//        for (Materia listarMateria : inscData.obtenerMateriasCursadas(alu.getIdalumno())) {
//
//            int ID = listarMateria.getIdMateria();
//            String nombre = listarMateria.getNombre();
//            int nota = listarMateria.();
//            
//            modeloTabla.addRow(new Object[]{ID, nombre, nota});       
//        } 
//    }
    
//    private void cargarTabla() {
//        String[] alumno = cboSelectorAlumno.getSelectedItem().toString().split(", ");
//        int dniAlumno = Integer.parseInt(alumno[0]);
//
//        limpiarTabla();
//
//        for (Inscripciones insc : inscData.obtenerInscripciones()) {
//            if (insc.getAlumno().getDni()== dniAlumno) {
//                modeloTabla.addRow(new Object[]{
//                    insc.getMateria().getIdMateria(),
//                    insc.getMateria().getNombre(),
//                    insc.getNota()
//                });
//            }
//
//        }
//    }
    


    
    
    public void limpiarTabla() {


        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> cboSelectorAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoULP;
    private javax.swing.JTable tablaNotas;
    private javax.swing.JScrollPane tbNotas;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
