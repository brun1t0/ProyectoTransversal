package proyecto_transversal.Vistas;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.Object;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return i1==2;
        }
    };
    public VistaCargaDeNotas() {
        initComponents();
        this.setSize(800 ,600);
        this.setTitle("Gestion de Notas");
        this.setResizable(false);
        llenarCombo();
        cargarTabla();
        crearModeloTabla();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboSelectorAlumno = new javax.swing.JComboBox<>();
        tbNotas = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        Cabecera = new javax.swing.JPanel();
        tituloPrincipal3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        logoULP3 = new javax.swing.JLabel();
        Botonera = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 51));
        setPreferredSize(new java.awt.Dimension(780, 580));

        jPanel1.setBackground(new java.awt.Color(74, 166, 134));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 900));
        jPanel1.setRequestFocusEnabled(false);

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

        Cabecera.setBackground(new java.awt.Color(74, 166, 134));

        tituloPrincipal3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloPrincipal3.setForeground(new java.awt.Color(0, 0, 0));
        tituloPrincipal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal3.setText("Carga de Notas");
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
                        .addGap(0, 0, Short.MAX_VALUE)
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

        Botonera.setBackground(new java.awt.Color(74, 166, 134));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/cerrarIcono.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/guardarIcono.png"))); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnGuardar1)
                .addGap(197, 197, 197)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbNotas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(127, 127, 127)
                        .addComponent(cboSelectorAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSelectorAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(tbNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void cboSelectorAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectorAlumnoActionPerformed

    }//GEN-LAST:event_cboSelectorAlumnoActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        try{
        guardarNota();
        }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "No se ha podido guardar la nota.");
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    

    private void cboSelectorAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
        limpiarTabla();
        cargarTabla();


    }
    
    public void cerrarVentana(){
     removeAll();
        repaint();
        setVisible(false);   
    }      
    
    public void llenarCombo(){
    for (Alumno listarAlumnos : aluData.listarAlumnos()) {
        cboSelectorAlumno.addItem(listarAlumnos);
        }
    }
    
    public void crearModeloTabla() {
        tablaNotas.setModel(modeloTabla);
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Nota");   
        cargarTabla();
    }
    
    
    public void limpiarTabla() {
        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }
    

    public void cargarTabla() {
        Alumno alu = (Alumno) cboSelectorAlumno.getSelectedItem();
        int fila = 0;
        
        HashMap<Integer, Double> nota = inscData.obtenerNota(alu.getIdalumno());
        
        for (Materia listarMateria : inscData.obtenerMateriasCursadas(alu.getIdalumno())) {
            int ID = listarMateria.getIdMateria();
            String nombre = listarMateria.getNombre();

            for (Map.Entry<Integer, Double> entry : nota.entrySet()) {
                Integer idMat = entry.getKey();
                Double valorNota = entry.getValue();

                if (idMat.equals(ID)) {
                    modeloTabla.addRow(new Object[]{ID, nombre, valorNota});
                }
            }
            
            
        }

//        for (Double nota : inscData.obtenerNota(alu.getIdalumno())) {
//            modeloTabla.setValueAt(nota, fila, 2);
//
//            fila++;
//        }
        
    }

    public void guardarNota() {
        Object columnaNota = tablaNotas.getValueAt(tablaNotas.getSelectedRow(), 2);
        Double notaMat = Double.parseDouble(columnaNota.toString());

        Object columnaId = tablaNotas.getValueAt(tablaNotas.getSelectedRow(), 0);
        Integer idMat = Integer.parseInt(columnaId.toString());

        Alumno alumnoSeleccionado = cboSelectorAlumno.getItemAt(cboSelectorAlumno.getSelectedIndex());

        inscData.actualizarNota(alumnoSeleccionado.getIdalumno(), idMat, notaMat);

        JOptionPane.showMessageDialog(this, "Nota actualizada con éxito.");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botonera;
    private javax.swing.JPanel Cabecera;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> cboSelectorAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logoULP3;
    private javax.swing.JTable tablaNotas;
    private javax.swing.JScrollPane tbNotas;
    private javax.swing.JLabel tituloPrincipal3;
    // End of variables declaration//GEN-END:variables
}
