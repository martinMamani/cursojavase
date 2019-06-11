// las clses ejecutable tiene motodo main
package clase05;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


public class PrimerForm extends javax.swing.JFrame {
    private ButtonGroup grupoEstado;
    /**
     * Creates new form Primerform
     */
    public PrimerForm() {
        initComponents();
        inicializar();
        
    }

    private void inicializar() {
        //inicializar el grupoEstado
        grupoEstado = new ButtonGroup();
        grupoEstado.add(radSoltero);
        grupoEstado.add(radCasado);
        grupoEstado.add(radViudo);
        grupoEstado.add(radDivorciado);
        radSoltero.setSelected(true);
        
        //inicializar cmbColores
        
        cmbColores.addItem("rojo");
        cmbColores.addItem("verde");
        cmbColores.addItem("negro");
        cmbColores.addItem("azul");
        cmbColores.addItem("amarrilo");
        cmbColores.setSelectedIndex(0);
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        chkAuto = new javax.swing.JCheckBox();
        chkMoto = new javax.swing.JCheckBox();
        chkBici = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radCasado = new javax.swing.JRadioButton();
        radSoltero = new javax.swing.JRadioButton();
        radDivorciado = new javax.swing.JRadioButton();
        radViudo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cmbColores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Primer Formulario");

        jLabel1.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        chkAuto.setText("Tiene Auto?");
        chkAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoActionPerformed(evt);
            }
        });

        chkMoto.setText("Tiene Moto?");

        chkBici.setText("Tiene Bicicleta?");

        txaTexto.setEditable(false);
        txaTexto.setColumns(20);
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        radCasado.setText("Casado");
        radCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCasadoActionPerformed(evt);
            }
        });

        radSoltero.setText("Soltero");

        radDivorciado.setText("Divorciado");

        radViudo.setText("Viudo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radCasado)
                    .addComponent(radSoltero)
                    .addComponent(radDivorciado)
                    .addComponent(radViudo))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(radSoltero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radViudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radDivorciado)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel2.setText("Color:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkMoto)
                            .addComponent(chkBici)
                            .addComponent(chkAuto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(chkBici)
                        .addGap(18, 18, 18)
                        .addComponent(chkMoto)
                        .addGap(18, 18, 18)
                        .addComponent(chkAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Evento aceptar
        
        System.out.println("se ejecuto un evento!");
        String nombre = txtNombre.getText();
        if (nombre.length()>=2){
            JOptionPane.showMessageDialog(this,"hola "+nombre);
            txtNombre.setText("");
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void chkAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // evento agregar
        
        String texto="";
        String nombre= txtNombre.getText();
        if(nombre.length()>2){
            texto+= "miNombre: "+nombre+".\n";
            if(chkBici.isSelected()) texto+="Tiene Bicicleta.\n";
             if(chkMoto.isSelected()) texto+="Tiene Moto.\n";
              if(chkAuto.isSelected()) texto+="Tiene Auto.\n";
              if(radSoltero.isSelected()) texto+="Estado civil Soltero.\n";
               if(radCasado.isSelected()) texto+="Estado civil casado.\n";
               if(radViudo.isSelected()) texto+="Estado civil viudo.\n";
               if(radDivorciado.isSelected()) texto+="Estado civil divorciado.\n";
              texto+="color: "+cmbColores.getSelectedItem()+".\n";
                limpiar();
        }
        
        txaTexto.setText(texto);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void radCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCasadoActionPerformed
    private void limpiar(){
        txtNombre.setText("");
        txtNombre.requestFocus();
        chkBici.setSelected(false);
        chkMoto.setSelected(false);
        chkAuto.setSelected(false);
        radSoltero.setSelected(true);
        cmbColores.setSelectedIndex(0) ;
}
    public static void main(String args[]) {
        new PrimerForm().setVisible(true);
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JCheckBox chkAuto;
    private javax.swing.JCheckBox chkBici;
    private javax.swing.JCheckBox chkMoto;
    private javax.swing.JComboBox<String> cmbColores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radCasado;
    private javax.swing.JRadioButton radDivorciado;
    private javax.swing.JRadioButton radSoltero;
    private javax.swing.JRadioButton radViudo;
    private javax.swing.JTextArea txaTexto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
