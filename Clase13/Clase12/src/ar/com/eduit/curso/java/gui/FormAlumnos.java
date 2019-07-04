package ar.com.eduit.curso.java.gui;
import ar.com.eduit.curso.java.connectors.ConnectorMySQL;
import ar.com.eduit.curso.java.entidades.Alumno;
import ar.com.eduit.curso.java.entidades.Curso;
import ar.com.eduit.curso.java.repositories.interfaces.I_AlumnoR;
import ar.com.eduit.curso.java.repositories.interfaces.I_CursoR;
import ar.com.eduit.curso.java.repositories.jdbc.AlumnoR;
import ar.com.eduit.curso.java.repositories.jdbc.CursoR;
import ar.com.eduit.curso.java.utils.swing.Table;
import ar.com.eduit.curso.java.utils.swing.Validator;
import javax.swing.JOptionPane;
public class FormAlumnos extends javax.swing.JInternalFrame {
    private I_AlumnoR ar;
    private I_CursoR cr;
    public FormAlumnos() {
        super(
                "Formulario de Alumnos",    //title 
                false,                      //resizable 
                true,                       //closable 
                false,                      //maximizable 
                true                        //iconifiable
        );
        initComponents();
        ar=new AlumnoR(ConnectorMySQL.getConnection());
        cr=new CursoR(ConnectorMySQL.getConnection());
        cargar();
    }
    private void cargar(){
        //cargar elementos en cmbCursos
        cmbCursos.removeAllItems();
        cr.getAll().forEach(cmbCursos::addItem);
        
        //cargar elementos en tblAlumnos
        new Table<Alumno>().cargar(tblAlumnos, ar.getAll());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCursos = new javax.swing.JComboBox<>();
        spnEdad = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarApe = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Curso:");

        cmbCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        spnEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 110, 1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblInfo.setBorder(new javax.swing.border.MatteBorder(null));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        jLabel5.setText("Apellido:");

        txtBuscarApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarApeKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(70, 70, 70)
                                .addComponent(txtBuscarApe, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscarApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento Agregar
        if(validar()){
            Alumno alumno= new Alumno(
            txtNombre.getText(),
                    txtApellido.getText(),
                    (int)spnEdad.getValue(),
                    ((Curso)cmbCursos.getSelectedItem()).getId()
             );
            ar.save(alumno);
            lblInfo.setText("Se ingreso un alumno id: "+alumno.getId());
            limpiar();
        }else{
            lblInfo.setText("No se ingreso un alumno.");
        }
        cargar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarApeKeyReleased
        // Evento buscar
        new Table<Alumno>().cargar(tblAlumnos,ar.getLikeApellido(txtBuscarApe.getText()));
    }//GEN-LAST:event_txtBuscarApeKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Evento eliminar
        int x=tblAlumnos.getSelectedRow();
        if(x==-1)return;
        Alumno alumno= ar.getById((int)tblAlumnos.getValueAt(x,0));
        if(JOptionPane.showConfirmDialog(this,
                "Esta seguro que desea eliminar:"+alumno.getId()+" "
                        +alumno.getNombre()+" "+alumno.getApellido())==0)
        {
            ar.remove(alumno);
            lblInfo.setText("Se borro un alumno!");
        }
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed
private boolean validar(){
    //validar txtNombre longitud entre 2 y 20 caracteres.
    if(!new Validator(txtNombre).length(2, 20)) return false;
    //validar txtApellido longitud entre 2 y 20 caracteres.
    if(!new Validator(txtApellido).length(2, 20)) return false;
    return true;
    
}
private void limpiar(){
    txtNombre.setText("");
    txtApellido.setText("");
    spnEdad.setValue(18);
    cmbCursos.setSelectedIndex(0);
    txtNombre.requestFocus();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Curso> cmbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarApe;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
