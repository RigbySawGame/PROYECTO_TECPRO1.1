package Pack_forms;

import Pack_classes.PELICULAS;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class REGISTRO_PELICULA extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    private void clear_table(){
        
        for (int i = 0; i < tblReport.getRowCount(); i++) {
        model.removeRow(i);
        i-=1;
        }
        
    }
    
    private void add_columns(){
    
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Sinopsis");
        model.addColumn("Duracion");
        model.addColumn("Edad Min.");
        model.addColumn("Angamos");
        model.addColumn("Bellavista");
        model.addColumn("Jockey Plaza");
        model.addColumn("Megaplaza");
        model.addColumn("Plaza Lima Sur");
        model.addColumn("San Miguel");
        model.addColumn("2D");
        model.addColumn("3D");
        model.addColumn("2D XD");
        model.addColumn("3D XD");
        model.addColumn("DBOX 2D");
        model.addColumn("DBOX 3D");
        model.addColumn("DBOX 2D XD");
        model.addColumn("DBOX 3D XD");
        
         tblReport.setModel(model);
        
        TableColumnModel columnModel = tblReport.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(50);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(40);
        columnModel.getColumn(4).setPreferredWidth(40);
        columnModel.getColumn(5).setPreferredWidth(20);
        columnModel.getColumn(6).setPreferredWidth(20);
        columnModel.getColumn(7).setPreferredWidth(20);   
        columnModel.getColumn(8).setPreferredWidth(20);
        columnModel.getColumn(9).setPreferredWidth(10);
        columnModel.getColumn(10).setPreferredWidth(10);
        columnModel.getColumn(11).setPreferredWidth(20);
        columnModel.getColumn(12).setPreferredWidth(20);
        columnModel.getColumn(13).setPreferredWidth(20);
        columnModel.getColumn(14).setPreferredWidth(20);
        columnModel.getColumn(15).setPreferredWidth(40);   
        columnModel.getColumn(16).setPreferredWidth(40);
        columnModel.getColumn(17).setPreferredWidth(50);
        columnModel.getColumn(18).setPreferredWidth(50);     
       
    }
    
    private void Limpieza(){
        txtNombre.setText(null);
        txtSinopsis.setText(null);
        txtDuracion.setText(null);
        txtEdadMin.setText(null);
        
        chkPlazaLimaSur.setSelected(false);
        chkJokeyPlaza.setSelected(false);
        chkAngamos.setSelected(false);
        chkBellavista.setSelected(false);
        chkMegaPlaza.setSelected(false);
        chkSanMiguel.setSelected(false);
        
        chk2D.setSelected(false);
        chk3D.setSelected(false);
        chk2Dxd.setSelected(false);
        chk3Dxd.setSelected(false);
        chkDBOX2D.setSelected(false);
        chkDBOX3D.setSelected(false);
        chkDBOX2Dxd.setSelected(false);
        chkDBOX3Dxd.setSelected(false);
    }
    
    
    private void EnviarFichero(){
        /*atrapar posibles errores*/
        try{
            FileWriter fw;
            PrintWriter pw;
            
            //crear el archivo
            fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\RegistroPeliculas.txt", true);
            //escribir el archivo
            pw = new PrintWriter(fw);
            //enviar datos al archivo
            PELICULAS obj = new PELICULAS();            
            obj.setPeliNombre(txtNombre.getText());
            obj.setPeliSinopsis(txtSinopsis.getText());
            obj.setPeliDuracion(Integer.parseInt(txtDuracion.getText()));
            obj.setPeliEdadMinima(Integer.parseInt(txtEdadMin.getText()));
            
            obj.setPlazaLimaSur(chkPlazaLimaSur.isSelected());
            obj.setJokeyPlaza(chkJokeyPlaza.isSelected());
            obj.setAngamos(chkAngamos.isSelected());
            obj.setMegaPlaza(chkMegaPlaza.isSelected());
            obj.setBellavista(chkBellavista.isSelected());
            obj.setSanMiguel(chkSanMiguel.isSelected());
            
            obj.setPeli2D(chk2D.isSelected());
            obj.setPeli3D(chk3D.isSelected());
            obj.setPeli2DXD(chk2Dxd.isSelected());
            obj.setPeli3DXD(chk3Dxd.isSelected());
            obj.setPeliDBOX2D(chkDBOX2D.isSelected());
            obj.setPeliDBOX3D(chkDBOX3D.isSelected());
            obj.setPeliDBOX2DXD(chkDBOX2Dxd.isSelected());
            obj.setPeliDBOX3DXD(chkDBOX3Dxd.isSelected());
            
            pw.println(obj.GeneracionCodigo() + ";" + 
                    obj.getPeliNombre()+ ";" + 
                    obj.getPeliSinopsis()+ ";" +
                    obj.getPeliDuracion()+ ";" +
                    obj.getPeliEdadMinima()
            );        
            
            //liberar buffer
            pw.close();
            //envia mensaje de exito
            JOptionPane.showMessageDialog(null, "Pelicula Registrado");             
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error Fichero:\n" +
                    ex.getMessage() );
        }
        
        
    }
    
    
    public REGISTRO_PELICULA() {
        initComponents();
        add_columns();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopsis = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        txtEdadMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PanelUbicacion = new javax.swing.JPanel();
        chkPlazaLimaSur = new javax.swing.JCheckBox();
        chkAngamos = new javax.swing.JCheckBox();
        chkJokeyPlaza = new javax.swing.JCheckBox();
        chkMegaPlaza = new javax.swing.JCheckBox();
        chkBellavista = new javax.swing.JCheckBox();
        chkSanMiguel = new javax.swing.JCheckBox();
        PanelTipoSala = new javax.swing.JPanel();
        chk2D = new javax.swing.JCheckBox();
        chk3D = new javax.swing.JCheckBox();
        chk2Dxd = new javax.swing.JCheckBox();
        chk3Dxd = new javax.swing.JCheckBox();
        chkDBOX2D = new javax.swing.JCheckBox();
        chkDBOX3D = new javax.swing.JCheckBox();
        chkDBOX2Dxd = new javax.swing.JCheckBox();
        chkDBOX3Dxd = new javax.swing.JCheckBox();
        btnGrabarUsuario = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE PELICULAS");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Sinopsis:");

        txtSinopsis.setColumns(20);
        txtSinopsis.setRows(5);
        jScrollPane1.setViewportView(txtSinopsis);

        jLabel3.setText("Duracion (minutos):");

        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });

        txtEdadMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadMinKeyTyped(evt);
            }
        });

        jLabel4.setText("Edad minima:");

        PanelUbicacion.setBorder(javax.swing.BorderFactory.createTitledBorder("UBICACION:"));

        chkPlazaLimaSur.setText("Plaza Lima Sur");
        chkPlazaLimaSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlazaLimaSurActionPerformed(evt);
            }
        });

        chkAngamos.setText("Angamos");

        chkJokeyPlaza.setText("Jokey Plaza");

        chkMegaPlaza.setText("Mega Plaza");

        chkBellavista.setText("Bellavista");

        chkSanMiguel.setText("San Miguel");

        javax.swing.GroupLayout PanelUbicacionLayout = new javax.swing.GroupLayout(PanelUbicacion);
        PanelUbicacion.setLayout(PanelUbicacionLayout);
        PanelUbicacionLayout.setHorizontalGroup(
            PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPlazaLimaSur)
                    .addComponent(chkMegaPlaza))
                .addGap(18, 18, 18)
                .addGroup(PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkJokeyPlaza)
                    .addComponent(chkBellavista))
                .addGap(18, 18, 18)
                .addGroup(PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAngamos)
                    .addComponent(chkSanMiguel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelUbicacionLayout.setVerticalGroup(
            PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPlazaLimaSur)
                    .addComponent(chkAngamos)
                    .addComponent(chkJokeyPlaza))
                .addGap(18, 18, 18)
                .addGroup(PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkSanMiguel)
                    .addGroup(PanelUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkBellavista)
                        .addComponent(chkMegaPlaza)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        PanelTipoSala.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO SALA:"));

        chk2D.setText("2D");
        chk2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2DActionPerformed(evt);
            }
        });

        chk3D.setText("3D");

        chk2Dxd.setText("2D XD");

        chk3Dxd.setText("3D XD");

        chkDBOX2D.setText("DBOX 2D");

        chkDBOX3D.setText("DBOX 3D");

        chkDBOX2Dxd.setText("DBOX 2D XD");

        chkDBOX3Dxd.setText("DBOX 3D XD");

        javax.swing.GroupLayout PanelTipoSalaLayout = new javax.swing.GroupLayout(PanelTipoSala);
        PanelTipoSala.setLayout(PanelTipoSalaLayout);
        PanelTipoSalaLayout.setHorizontalGroup(
            PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTipoSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk2D)
                    .addComponent(chkDBOX2D))
                .addGap(18, 18, 18)
                .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk3D)
                    .addComponent(chkDBOX3D))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkDBOX2Dxd)
                    .addComponent(chk2Dxd))
                .addGap(18, 18, 18)
                .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk3Dxd)
                    .addComponent(chkDBOX3Dxd))
                .addContainerGap())
        );
        PanelTipoSalaLayout.setVerticalGroup(
            PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTipoSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTipoSalaLayout.createSequentialGroup()
                        .addComponent(chk3D)
                        .addGap(18, 18, 18)
                        .addComponent(chkDBOX3D))
                    .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelTipoSalaLayout.createSequentialGroup()
                            .addComponent(chk2Dxd)
                            .addGap(18, 18, 18)
                            .addComponent(chkDBOX2Dxd))
                        .addGroup(PanelTipoSalaLayout.createSequentialGroup()
                            .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chk2D)
                                .addComponent(chk3Dxd))
                            .addGap(18, 18, 18)
                            .addGroup(PanelTipoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chkDBOX2D)
                                .addComponent(chkDBOX3Dxd)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnGrabarUsuario.setText("Grabar");
        btnGrabarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarUsuarioActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtDelete.setText("Eliminar");

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383)
                        .addComponent(txtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadMin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PanelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PanelTipoSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelTipoSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdadMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabarUsuario)
                    .addComponent(txtDelete)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPlazaLimaSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlazaLimaSurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPlazaLimaSurActionPerformed

    private void chk2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2DActionPerformed

    private void btnGrabarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarUsuarioActionPerformed

        EnviarFichero();
        Limpieza();
        
    }//GEN-LAST:event_btnGrabarUsuarioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        int opc = JOptionPane.showConfirmDialog(null, "¿Esta seguro de cerrar?");

        if(opc==0){
        
        INICIO_SESION_ADMIN_SUB close = new INICIO_SESION_ADMIN_SUB();
        close.setVisible(true);
        this.dispose();
        
        
        }
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
         char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtEdadMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadMinKeyTyped
         char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }
    }//GEN-LAST:event_txtEdadMinKeyTyped

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
            java.util.logging.Logger.getLogger(REGISTRO_PELICULA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_PELICULA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_PELICULA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_PELICULA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO_PELICULA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTipoSala;
    private javax.swing.JPanel PanelUbicacion;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGrabarUsuario;
    private javax.swing.JCheckBox chk2D;
    private javax.swing.JCheckBox chk2Dxd;
    private javax.swing.JCheckBox chk3D;
    private javax.swing.JCheckBox chk3Dxd;
    private javax.swing.JCheckBox chkAngamos;
    private javax.swing.JCheckBox chkBellavista;
    private javax.swing.JCheckBox chkDBOX2D;
    private javax.swing.JCheckBox chkDBOX2Dxd;
    private javax.swing.JCheckBox chkDBOX3D;
    private javax.swing.JCheckBox chkDBOX3Dxd;
    private javax.swing.JCheckBox chkJokeyPlaza;
    private javax.swing.JCheckBox chkMegaPlaza;
    private javax.swing.JCheckBox chkPlazaLimaSur;
    private javax.swing.JCheckBox chkSanMiguel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblReport;
    private javax.swing.JButton txtDelete;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEdadMin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSinopsis;
    // End of variables declaration//GEN-END:variables
}
