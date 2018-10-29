/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Carrera;
import Clases.cmbEntidad;
import Clases.cmbModalidad;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author raul
 */
public class FrmCarrera extends javax.swing.JFrame {

    /**
     * Creates new form FrmCarrera
     */
    public FrmCarrera() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblCodigoEnt.setVisible(false);
        lblModalidad.setVisible(false);
        lblcodigoCa.setVisible(false);
        Carrera consulta= new Carrera();
        try{
                consulta.ConsultaCarrera(JTMostrar);
            } catch (SQLException e){
                System.out.println(e);
        }
        cmbEntidad entidades = new cmbEntidad();
        try{
            entidades.LLenarComboEntidad(cmbEnt);
            
        }catch (SQLException ex){
            System.out.println(ex);
        }
        cmbModalidad modalidad= new cmbModalidad();
        try{ 
            modalidad.LLenarComboModalidad(cmbModalidad);  
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTMostrar = new javax.swing.JTable();
        lblCodigoEnt = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbEnt = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbModalidad = new javax.swing.JComboBox<>();
        lblModalidad = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblcodigoCa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrera");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Carrera");

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1478727130_New.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1478727304_document_pencil.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1478724869_02_Recycle_16x16.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1478725125_floppy_disk_save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1478726956_Remove.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Decripcion:");

        txtDesc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDesc.setEnabled(false);
        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Año de creacion:");

        txtAnio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAnio.setEnabled(false);
        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioKeyTyped(evt);
            }
        });

        JTMostrar.setModel(new javax.swing.table.DefaultTableModel(
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
        JTMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTMostrarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(JTMostrar);

        lblCodigoEnt.setText("0");

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1478726914_Log Out.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Entidad:");

        cmbEnt.setEnabled(false);
        cmbEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEntActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Duracion:");

        txtDuracion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDuracion.setEnabled(false);
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Modalidad:");

        cmbModalidad.setEnabled(false);
        cmbModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModalidadActionPerformed(evt);
            }
        });

        lblModalidad.setText("0");

        txtEstado.setEditable(false);
        txtEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEstado.setEnabled(false);

        lblcodigoCa.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(2, 2, 2)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(22, 22, 22)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addGap(143, 143, 143)
                                .addComponent(lblCodigoEnt))
                            .addComponent(cmbModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbEnt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcodigoCa)
                .addGap(157, 157, 157)
                .addComponent(lblModalidad)
                .addGap(126, 126, 126)
                .addComponent(btnSalir)
                .addGap(39, 39, 39))
            .addComponent(txtEstado)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblCodigoEnt))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir)
                            .addComponent(lblModalidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcodigoCa)
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtDesc.setText("");
        txtAnio.setText("");
        txtDuracion.setText("");
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnSalir.setEnabled(false);
        txtDesc.setEnabled(true);
        txtAnio.setEnabled(true);
        txtDuracion.setEnabled(true);
        cmbEnt.setEnabled(true);
        cmbModalidad.setEnabled(true);
        txtDesc.requestFocus();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling ="code here:
        if (txtDesc.getText().length()==0){
            JOptionPane.showMessageDialog(null,
                "Debe de seleccionar un registro, para modificar",
                "Carrera", JOptionPane.INFORMATION_MESSAGE );
        }else{
            btnNuevo.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnSalir.setEnabled(false);
            txtAnio.setEnabled(true);
            txtDesc.setEnabled(true);
            txtDuracion.setEnabled(true);
            cmbEnt.setEnabled(true);
            cmbModalidad.setEnabled(true);
            txtDesc.requestFocus();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (txtDesc.getText().length()==0){
            JOptionPane.showMessageDialog(null,
                "Debe de seleccionar un registro, para eliminar",
                "Carrera", JOptionPane.INFORMATION_MESSAGE );
        }else{
            int confirmado = JOptionPane.showConfirmDialog(null,"Desea eliminar esta carrera","Carrera",JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == confirmado){
                int codigo;
                codigo=Integer.parseInt(lblcodigoCa.getText());
                Carrera eliminar=new Carrera();

                try{
                    eliminar.sql_EliminarCarrera(codigo);
                    btnNuevo.setEnabled(true);
                    btnModificar.setEnabled(true);
                    btnEliminar.setEnabled(true);
                    btnGuardar.setEnabled(false);
                    btnCancelar.setEnabled(false);
                    txtDesc.setText("");
                    txtAnio.setText("");
                    txtAnio.setEnabled(false);

                    JOptionPane.showMessageDialog(null,
                        "Carrera Eliminada",
                        "Carrera", JOptionPane.INFORMATION_MESSAGE );
                    try{
                        eliminar.ConsultaCarrera(JTMostrar);
                    } catch (SQLException e){
                        System.out.println(e);
                    }
                    
                }catch (SQLException e){
                    JOptionPane.showMessageDialog(null,
                        "No se puede Eliminar esta Entidad datos asociados",
                        "Entidad", JOptionPane.INFORMATION_MESSAGE );
                    System.out.println(e);
                    btnNuevo.setEnabled(true);
                    btnModificar.setEnabled(true);
                    btnEliminar.setEnabled(true);
                    btnGuardar.setEnabled(false);
                    btnCancelar.setEnabled(false);
                    txtDesc.setText("");
                    txtAnio.setText("");
                    txtAnio.setEnabled(false);
                }
            }else{
                btnNuevo.setEnabled(true);
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnCancelar.setEnabled(false);
                txtDesc.setText("");
                txtAnio.setText("");
                txtAnio.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Carrera nuevo=new Carrera();
        Integer anio,codigo,modalidad,codigoCa;
        String descrip, duracion;

        descrip=txtDesc.getText();
        duracion=txtDuracion.getText();
        anio=Integer.parseInt(txtAnio.getText());
        codigoCa=Integer.parseInt(lblcodigoCa.getText());
        codigo=Integer.parseInt(lblCodigoEnt.getText());
        modalidad=Integer.parseInt(lblModalidad.getText());

        try{
            nuevo.sql_IngresarActualizarCarrera(descrip,duracion,anio,modalidad,codigo,codigoCa);
            JOptionPane.showMessageDialog(null,
                "Datos ingresados correctamente",
                "Carrera", JOptionPane.INFORMATION_MESSAGE );

            btnNuevo.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnGuardar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnSalir.setEnabled(true);
            txtDesc.setText("");
            txtAnio.setText("");
            txtDuracion.setText("");
            txtAnio.setEnabled(false);
            txtDesc.setEnabled(false);
            txtDuracion.setEnabled(false);
            cmbEnt.setEnabled(false);
            cmbModalidad.setEnabled(false);
            try{
                nuevo.ConsultaCarrera(JTMostrar);
            } catch (SQLException e){
                System.out.println(e);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalir.setEnabled(true);
        txtDesc.setText("");
        txtAnio.setText("");
        txtDuracion.setText("");
        txtAnio.setEnabled(false);
        txtDesc.setEnabled(false);
        txtDuracion.setEnabled(false);
        cmbEnt.setEnabled(false);
        cmbModalidad.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyTyped
        // TODO add your handling code here:
        if (txtDesc.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtDescKeyTyped

    private void txtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyTyped
        // TODO add your handling code here:

        char c=evt.getKeyChar();

        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            txtEstado.setText("Ingrese Solo Numeros");
        }
        else{
            txtEstado.setText("");
        }
        if (txtAnio.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txtAnioKeyTyped

    private void JTMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTMostrarMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount()==1){
            lblcodigoCa.setText(JTMostrar.getValueAt(JTMostrar.getSelectedRow(), 0).toString());
            txtDesc.setText(JTMostrar.getValueAt(JTMostrar.getSelectedRow(), 1).toString());
            txtDuracion.setText(JTMostrar.getValueAt(JTMostrar.getSelectedRow(),2).toString());
            txtAnio.setText(JTMostrar.getValueAt(JTMostrar.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_JTMostrarMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        // TODO add your handling code here:
          if (txtDuracion.getText().length()>=25){
            evt.consume();
        }
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void cmbModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModalidadActionPerformed
        // TODO add your handling code here:
        String codigo;
        codigo=cmbModalidad.getItemAt(cmbModalidad.getSelectedIndex()).getCodigo();
        lblModalidad.setText(codigo);
    }//GEN-LAST:event_cmbModalidadActionPerformed

    private void cmbEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEntActionPerformed
        // TODO add your handling code here:
        String codigo;
        codigo=cmbEnt.getItemAt(cmbEnt.getSelectedIndex()).getCodigo();
        lblCodigoEnt.setText(codigo);
    }//GEN-LAST:event_cmbEntActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTMostrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<cmbEntidad> cmbEnt;
    private javax.swing.JComboBox<cmbModalidad> cmbModalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigoEnt;
    private javax.swing.JLabel lblModalidad;
    private javax.swing.JLabel lblcodigoCa;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEstado;
    // End of variables declaration//GEN-END:variables
}
