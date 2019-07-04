package ar.com.eduit.curso.java.gui;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class FormPrincipal extends javax.swing.JFrame {
    public FormPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        bar = new javax.swing.JMenuBar();
        mnuVentanas = new javax.swing.JMenu();
        mniAlumnos = new javax.swing.JMenuItem();
        mniCursos = new javax.swing.JMenuItem();
        mnuOpciones = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Colegio");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        mnuVentanas.setText("Ventanas");

        mniAlumnos.setText("Alumnos");
        mniAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAlumnosActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniAlumnos);

        mniCursos.setText("Cursos");
        mniCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCursosActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniCursos);

        bar.add(mnuVentanas);

        mnuOpciones.setText("Opciones");

        mniAcerca.setText("Acerca");
        mniAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniAcerca);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniSalir);

        bar.add(mnuOpciones);

        setJMenuBar(bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCursosActionPerformed
        // Evento Cursos
        FormCursos form=new FormCursos();
        desktop.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_mniCursosActionPerformed

    private void mniAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaActionPerformed
        // Evento Acerca
        JOptionPane.showMessageDialog(this, "Sistema de colegio.\nCurso de Java Julio 2019.");
    }//GEN-LAST:event_mniAcercaActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        // Evento salir
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAlumnosActionPerformed
        // Evento Alumnos
        FormAlumnos form=new FormAlumnos();
        desktop.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_mniAlumnosActionPerformed
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniAlumnos;
    private javax.swing.JMenuItem mniCursos;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenu mnuVentanas;
    // End of variables declaration//GEN-END:variables
}
