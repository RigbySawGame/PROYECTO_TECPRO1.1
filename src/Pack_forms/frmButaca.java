
package Pack_forms;

import Pack_classes.Butacas;


public class frmButaca extends javax.swing.JFrame {

    public static String NumeroButaca = "";
    
    public frmButaca() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chka1 = new javax.swing.JCheckBox();
        chka2 = new javax.swing.JCheckBox();
        chka3 = new javax.swing.JCheckBox();
        chka4 = new javax.swing.JCheckBox();
        chka5 = new javax.swing.JCheckBox();
        chka6 = new javax.swing.JCheckBox();
        chka7 = new javax.swing.JCheckBox();
        chka8 = new javax.swing.JCheckBox();
        chka9 = new javax.swing.JCheckBox();
        chkb3 = new javax.swing.JCheckBox();
        chkb4 = new javax.swing.JCheckBox();
        chkb5 = new javax.swing.JCheckBox();
        chkb6 = new javax.swing.JCheckBox();
        chkb7 = new javax.swing.JCheckBox();
        chkb8 = new javax.swing.JCheckBox();
        chkb9 = new javax.swing.JCheckBox();
        chkb1 = new javax.swing.JCheckBox();
        chkb2 = new javax.swing.JCheckBox();
        chkc3 = new javax.swing.JCheckBox();
        chkc4 = new javax.swing.JCheckBox();
        chkc5 = new javax.swing.JCheckBox();
        chkc6 = new javax.swing.JCheckBox();
        chkc7 = new javax.swing.JCheckBox();
        chkc8 = new javax.swing.JCheckBox();
        chkc9 = new javax.swing.JCheckBox();
        chkc1 = new javax.swing.JCheckBox();
        chkc2 = new javax.swing.JCheckBox();
        btnSeparar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtButaca = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chka1.setText("A1");

        chka2.setText("A2");

        chka3.setText("A3");

        chka4.setText("A4");

        chka5.setText("A5");

        chka6.setText("A6");

        chka7.setText("A7");

        chka8.setText("A8");

        chka9.setText("A9");

        chkb3.setText("B3");

        chkb4.setText("B4");

        chkb5.setText("B5");

        chkb6.setText("B6");

        chkb7.setText("B7");

        chkb8.setText("B8");

        chkb9.setText("B9");

        chkb1.setText("B1");

        chkb2.setText("B2");

        chkc3.setText("C3");

        chkc4.setText("C4");

        chkc5.setText("C5");

        chkc6.setText("C6");

        chkc7.setText("C7");

        chkc8.setText("C8");

        chkc9.setText("C9");

        chkc1.setText("C1");

        chkc2.setText("C2");

        btnSeparar.setText("Separar");
        btnSeparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepararActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("             PANTALLA");

        txtButaca.setColumns(20);
        txtButaca.setRows(5);
        jScrollPane1.setViewportView(txtButaca);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnSeparar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(chkb1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(chkb2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(chkc1)
                                            .addGap(18, 18, 18)
                                            .addComponent(chkc2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chka1)
                                        .addGap(18, 18, 18)
                                        .addComponent(chka2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(chkc3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(chkb3)
                                            .addGap(2, 2, 2)))
                                    .addComponent(chka3))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(chkc4)
                                            .addComponent(chkb4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkc5)
                                            .addComponent(chkb5)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chka4)
                                        .addGap(18, 18, 18)
                                        .addComponent(chka5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkc6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(chkb6))
                                    .addComponent(chka6))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(chkc7)
                                            .addGap(18, 18, 18)
                                            .addComponent(chkc8))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(chkb7)
                                            .addGap(22, 22, 22)
                                            .addComponent(chkb8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chka7)
                                        .addGap(18, 18, 18)
                                        .addComponent(chka8))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(chkc9)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(chkb9)
                                    .addGap(2, 2, 2)))
                            .addComponent(chka9))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chka1)
                            .addComponent(chka2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkb1)
                            .addComponent(chkb2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkc1)
                            .addComponent(chkc2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chka3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkb3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkc3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chka6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkb6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkc6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chka4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chka5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkb4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkb5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkc4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkc5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chka7)
                                .addComponent(chka8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chkb7)
                                .addComponent(chkb8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chkc7)
                                .addComponent(chkc8)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(chka9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chkb9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chkc9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeparar)
                            .addComponent(btnSiguiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bloq1(){
        if(chka1.isSelected()==true){
            chka1.setEnabled(false);
        }else
            return ;
    }
    public void bloq2(){
        if(chka2.isSelected()==true){
            chka2.setEnabled(false);
        }else
            return ;
    }
    public void bloq3(){
        if(chka3.isSelected()==true){
            chka3.setEnabled(false);
        }else
            return ;
    }
    public void bloq4(){
        if(chka4.isSelected()==true){
            chka4.setEnabled(false);
        }else
            return ;
    }
    public void bloq5(){
        if(chka5.isSelected()==true){
            chka5.setEnabled(false);
        }else
            return ;
    }
    public void bloq6(){
        if(chka6.isSelected()==true){
            chka6.setEnabled(false);
        }else
            return ;
    }
    public void bloq7(){
        if(chka7.isSelected()==true){
            chka7.setEnabled(false);
        }else
            return ;
    }
    public void bloq8(){
        if(chka8.isSelected()==true){
            chka8.setEnabled(false);
        }else
            return ;
    }
    public void bloq9(){
        if(chka9.isSelected()==true){
            chka9.setEnabled(false);
        }else
            return ;
    }
    private void btnSepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepararActionPerformed
        
        Butacas bu = new Butacas();
        bu.setA1(chka1.isSelected());
        bu.setA2(chka2.isSelected());
        bu.setA3(chka3.isSelected());
        bu.setA4(chka4.isSelected());
        bu.setA5(chka5.isSelected());
        bu.setA6(chka6.isSelected());
        bu.setA7(chka7.isSelected());
        bu.setA8(chka8.isSelected());
        bu.setA9(chka9.isSelected());

        bu.setB1(chkb1.isSelected());
        bu.setB2(chkb2.isSelected());
        bu.setB3(chkb3.isSelected());
        bu.setB4(chkb4.isSelected());
        bu.setB5(chkb5.isSelected());
        bu.setB6(chkb6.isSelected());
        bu.setB7(chkb7.isSelected());
        bu.setB8(chkb8.isSelected());
        bu.setB9(chkb9.isSelected());

        bu.setC1(chkc1.isSelected());
        bu.setC2(chkc2.isSelected());
        bu.setC3(chkc3.isSelected());
        bu.setC4(chkc4.isSelected());
        bu.setC5(chkc5.isSelected());
        bu.setC6(chkc6.isSelected());
        bu.setC7(chkc7.isSelected());
        bu.setC8(chkc8.isSelected());
        bu.setC9(chkc9.isSelected());
        
        
        txtButaca.append( bu.TotalDeButacas());
        NumeroButaca = bu.TotalDeButacas();
        bloq1();bloq2();bloq3();bloq4();bloq5();bloq6();bloq7();bloq8();bloq9();
    }//GEN-LAST:event_btnSepararActionPerformed
    
//    public static String Butaca = "";
    
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        frmRegistroDePelicula reg = new frmRegistroDePelicula();
//        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        chka1.setSelected(false);
        chka2.setSelected(false);
        chka3.setSelected(false);
        chka4.setSelected(false);
        chka5.setSelected(false);
        chka6.setSelected(false);
        chka7.setSelected(false);
        chka8.setSelected(false);
        chka9.setSelected(false);
        
        chkb1.setSelected(false);
        chkb2.setSelected(false);
        chkb3.setSelected(false);
        chkb4.setSelected(false);
        chkb5.setSelected(false);
        chkb6.setSelected(false);
        chkb7.setSelected(false);
        chkb8.setSelected(false);
        chkb9.setSelected(false);
        
        chkc1.setSelected(false);
        chkc2.setSelected(false);
        chkc3.setSelected(false);
        chkc4.setSelected(false);
        chkc5.setSelected(false);
        chkc6.setSelected(false);
        chkc7.setSelected(false);
        chkc8.setSelected(false);
        chkc9.setSelected(false);
        
        txtButaca.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmButaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSeparar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox chka1;
    private javax.swing.JCheckBox chka2;
    private javax.swing.JCheckBox chka3;
    private javax.swing.JCheckBox chka4;
    private javax.swing.JCheckBox chka5;
    private javax.swing.JCheckBox chka6;
    private javax.swing.JCheckBox chka7;
    private javax.swing.JCheckBox chka8;
    private javax.swing.JCheckBox chka9;
    private javax.swing.JCheckBox chkb1;
    private javax.swing.JCheckBox chkb2;
    private javax.swing.JCheckBox chkb3;
    private javax.swing.JCheckBox chkb4;
    private javax.swing.JCheckBox chkb5;
    private javax.swing.JCheckBox chkb6;
    private javax.swing.JCheckBox chkb7;
    private javax.swing.JCheckBox chkb8;
    private javax.swing.JCheckBox chkb9;
    private javax.swing.JCheckBox chkc1;
    private javax.swing.JCheckBox chkc2;
    private javax.swing.JCheckBox chkc3;
    private javax.swing.JCheckBox chkc4;
    private javax.swing.JCheckBox chkc5;
    private javax.swing.JCheckBox chkc6;
    private javax.swing.JCheckBox chkc7;
    private javax.swing.JCheckBox chkc8;
    private javax.swing.JCheckBox chkc9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea txtButaca;
    // End of variables declaration//GEN-END:variables
}
