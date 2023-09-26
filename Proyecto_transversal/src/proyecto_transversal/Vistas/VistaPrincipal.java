
package proyecto_transversal.Vistas;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Alumnos = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMGestionAlumnos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout AlumnosLayout = new javax.swing.GroupLayout(Alumnos);
        Alumnos.setLayout(AlumnosLayout);
        AlumnosLayout.setHorizontalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        AlumnosLayout.setVerticalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Alumno");

        jMGestionAlumnos.setText("Formulario de Alumno");
        jMGestionAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGestionAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jMGestionAlumnos);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Materia");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Formulario de Materia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(204, 204, 204));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Administación");

        jMenuItem3.setText("Manejo de Inscipciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

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
        jMenu4.setText("Consultas");

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
        jMenu8.setText("Salir");
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
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VistaInscripciones vistaIns = new VistaInscripciones(); 
        Alumnos.removeAll();
        Alumnos.repaint();
        vistaIns.setVisible(true);
        Alumnos.add(vistaIns);
        Alumnos.moveToFront(vistaIns);
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed



    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        VistaGestionMateria vistaMateria = new VistaGestionMateria();
       Alumnos.removeAll();
       Alumnos.repaint();
       vistaMateria.setVisible(true);
       Alumnos.add(vistaMateria);
       Alumnos.moveToFront(vistaMateria);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenuItem jMGestionAlumnos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
