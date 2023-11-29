
package Pack_forms;

import java.awt.Color;
import javax.swing.JOptionPane;
import Pack_forms.frmRegistroDePelicula;

public class frmBillTrabajador extends javax.swing.JFrame {


    public frmBillTrabajador() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        this.getContentPane().setBackground(new Color(166, 49, 49));
        setLocationRelativeTo(null);//es para que la ventana nos aparezca en el centro
//        RegistroDePelicula to = new RegistroDePelicula();
        Registro_de_pelicula_Trabajador Rep = new Registro_de_pelicula_Trabajador();
        txtBoleta.setText("Pelicula: "+ Rep.Pelicula+
            "\nSala: "+Rep.Sala+
            "\nHorario: "+Rep.Horario+
            "\nEntrada de Niño: "+Rep.Niño+
            "\nEntrada de Adulto: "+Rep.Adulto+
            "\nEntrada de Adulto Mayor: "+Rep.AdultoMayor+
           "\n Total a pagar: "+Rep.TotalApagar
                );
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtBoleta = new javax.swing.JTextArea();
        btnAgree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrada");

        txtBoleta.setColumns(20);
        txtBoleta.setRows(5);
        jScrollPane1.setViewportView(txtBoleta);

        btnAgree.setText("Aceptar");
        btnAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgree)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreeActionPerformed
        int opc=JOptionPane.showConfirmDialog(null, "¿Cerrar la Boleta(Si) Volver al Registro de la Pelicula(No)?");
       if(opc==0){
       
               Registro_de_pelicula_Trabajador inicio = new Registro_de_pelicula_Trabajador();
               inicio.setVisible(true);
               this.dispose();
       }
       
    }//GEN-LAST:event_btnAgreeActionPerformed

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
            java.util.logging.Logger.getLogger(frmBillTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBillTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBillTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBillTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBillTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBoleta;
    // End of variables declaration//GEN-END:variables
}
