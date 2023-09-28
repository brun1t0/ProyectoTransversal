
package proyecto_transversal.Vistas;

import java.awt.Dimension;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        this.setMinimumSize(new Dimension(800, 600));
        this.setSize(1024 ,768);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Gestion ULP");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Alumnos = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMGestionAlumnos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        Alumnos.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AlumnosLayout = new javax.swing.GroupLayout(Alumnos);
        Alumnos.setLayout(AlumnosLayout);
        AlumnosLayout.setHorizontalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        AlumnosLayout.setVerticalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/usuarioIcono.png"))); // NOI18N
        jMenu1.setText("Alumno");

        jMGestionAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/accederIcono.png"))); // NOI18N
        jMGestionAlumnos.setText("Formulario de Alumno");
        jMGestionAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGestionAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jMGestionAlumnos);

        jMenuBar1.add(jMenu1);

        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/libroIcono.png"))); // NOI18N
        jMenu5.setText("Materia");
        jMenu5.setOpaque(false);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/accederIcono.png"))); // NOI18N
        jMenuItem2.setText("Formulario de Materia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        jMenu3.setBackground(new java.awt.Color(204, 204, 204));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/administracionIcono.png"))); // NOI18N
        jMenu3.setText("Administación");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/accederIcono.png"))); // NOI18N
        jMenuItem3.setText("Manejo de Inscipciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/accederIcono.png"))); // NOI18N
        jMenuItem4.setText("Manipulacion de Notas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(204, 204, 204));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/consultasIcono.png"))); // NOI18N
        jMenu4.setText("Consultas");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/accederIcono.png"))); // NOI18N
        jMenuItem5.setText("Alumnos por Materia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu8.setBackground(new java.awt.Color(204, 204, 204));
        jMenu8.setForeground(new java.awt.Color(0, 0, 0));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_transversal/Recursos/img/cerrarIcono.png"))); // NOI18N
        jMenu8.setText("Salir");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Alumnos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Alumnos)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VistaInscripciones vistaIns = new VistaInscripciones(); 
        Alumnos.removeAll();
        Alumnos.repaint();
        vistaIns.setVisible(true);
        Alumnos.add(vistaIns);
        Alumnos.moveToFront(vistaIns);
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed



    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    VistaConsultaAlumnosPorMateria consultaAlumsMateria = new VistaConsultaAlumnosPorMateria();
    Alumnos.removeAll();
    Alumnos.repaint();
    consultaAlumsMateria.setVisible(true);
    Alumnos.add(consultaAlumsMateria);
    Alumnos.moveToFront(consultaAlumsMateria);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    VistaCargaDeNotas cargaDeNotas = new VistaCargaDeNotas();
    Alumnos.removeAll();
    Alumnos.repaint();
    cargaDeNotas.setVisible(true);
    Alumnos.add(cargaDeNotas);
    Alumnos.moveToFront(cargaDeNotas);    }//GEN-LAST:event_jMenuItem4ActionPerformed


    private void jMGestionAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGestionAlumnosActionPerformed
        Alumnos.removeAll();
        Alumnos.repaint();
        VistaGestionAlumno pr = new VistaGestionAlumno();
        pr.setVisible(true);
        Alumnos.add(pr);
        Alumnos.moveToFront(pr);
    }//GEN-LAST:event_jMGestionAlumnosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       Alumnos.removeAll();
        Alumnos.repaint();
        
        
        VistaGestionMateria vgm = new VistaGestionMateria();
        vgm.setVisible(true);
        Alumnos.add(vgm);
        Alumnos.moveToFront(vgm);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu8ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Alumnos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMGestionAlumnos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
