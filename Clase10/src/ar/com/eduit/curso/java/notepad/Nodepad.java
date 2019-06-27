
package ar.com.eduit.curso.java.notepad;

import ar.com.eduit.curso.java.utils.file.FileText;
import ar.com.eduit.curso.java.utils.file.I_File;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Nodepad extends javax.swing.JFrame {

   
    public Nodepad() {
        initComponents();
        //setExtendedState(6);pantalla completa
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.setBounds(100,100, 600, 200);//elegimos el tamaño
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mniNuevo = new javax.swing.JMenuItem();
        mniAbrir = new javax.swing.JMenuItem();
        mniGuardar = new javax.swing.JMenuItem();
        mnuOpciones = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloc de Notas");

        txaTexto.setColumns(20);
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        mnuArchivo.setText("Archivo");

        mniNuevo.setText("Nuevo");
        mniNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniNuevo);

        mniAbrir.setText("Abrir");
        mniAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbrirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniAbrir);

        mniGuardar.setText("Guardar");
        mniGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniGuardar);

        jMenuBar1.add(mnuArchivo);

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

        jMenuBar1.add(mnuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbrirActionPerformed
        // Evento abrir
        JFileChooser fc = new JFileChooser();//devuelve un elemento file
        fc.setFileFilter(new FileNameExtensionFilter("texto","txt"));
        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        if(file==null)return;
        //I_File fileText= new FileText(file);
        //txaTexto.setText(fileText.getText());
        txaTexto.setText(new FileText(file).getText());
        
    }//GEN-LAST:event_mniAbrirActionPerformed

    private void mniAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaActionPerformed
        // Evento acerca
        JOptionPane.showMessageDialog(this,"Bloc de notas.\nCurso de java se.\njunio 2019");
    }//GEN-LAST:event_mniAcercaActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        // Evento salir
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoActionPerformed
        // evento Nuevo
        if(txaTexto.getText().isEmpty())return ;
        if(JOptionPane.showConfirmDialog(this,"Desea borrar el texto?")==0)
            txaTexto.setText("");
    }//GEN-LAST:event_mniNuevoActionPerformed

    private void mniGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarActionPerformed
        // Evento guardar
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("texto","txt"));
        fc.showSaveDialog(this);
        File file = fc.getSelectedFile();
        if(file==null)return ;
        new FileText(file).setText(txaTexto.getText());
    }//GEN-LAST:event_mniGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Nodepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nodepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nodepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nodepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nodepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mniAbrir;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniGuardar;
    private javax.swing.JMenuItem mniNuevo;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JTextArea txaTexto;
    // End of variables declaration//GEN-END:variables
}
