
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_forms;

import Pack_classes.Butacas;
import java.awt.event.ItemEvent;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Pack_classes.RegistroDePelicula;

/**
 *
 * @author rodri
 */
public class frmRegistroDePelicula extends javax.swing.JFrame {
    public static String Pelicula = "";
    public static String Sala = "";
    public static String Horario = "";
    public static String Niño = "";
    public static String Adulto = "";
    public static String AdultoMayor = "";
    public static String CantidNiño = "";
    public static String CantidAdulto = "";
    public static String CantidAdultoMayor = "";
    public static double TotalApagar ;
    
    DefaultTableModel modelo = new DefaultTableModel();
    public void ColumnasTablas(){
        modelo.addColumn("Pelicula");
        modelo.addColumn("Sala");
        modelo.addColumn("Horario");
        modelo.addColumn("Entrada Niño");
        modelo.addColumn("Entrada Adulto");
        modelo.addColumn("Entrada AdultoMayor");
        modelo.addColumn("total");
        tblRegistroPelicula.setModel(modelo);
    }
    public void Cantidad(){
        
    for(int i=0;i<100;i++){
        cboNiños.addItem(String.valueOf(i));
        cboAdultos.addItem(String.valueOf(i));
        cboAdultoMayor.addItem(String.valueOf(i));
    }
}
    public void EnviarFichero(){
        try {
            FileWriter fw;
            PrintWriter pw;
         fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\Registro_de_Peli.txt", true);
           //Escribir el archivo
           pw = new PrintWriter(fw);
           //Enviar datos al archivo
           RegistroDePelicula rp= new RegistroDePelicula();
           rp.setSala(cboSala.getSelectedItem().toString());
           rp.setPelicula(cboPelicula.getSelectedItem().toString());
           rp.setHorario(cboHorario.getSelectedItem().toString());
           rp.setNiño(cboNiños.getSelectedItem().toString());
           rp.setAdulto(cboAdultos.getSelectedItem().toString());
           rp.setAdultoMayor(cboAdultoMayor.getSelectedItem().toString());
           
           
//           rp.setCodigo(Integer.parseInt(txtCodigo.getText()));
//           rp.setNombre(txtNombre.getText());
//           rp.setApellido(txtApellido.getText());
//           rp.setEstCivil(cmbEstcivil.getSelectedItem().toString());
//           rp.setSexo(cmbSexo.getSelectedItem().toString());
           
           pw.println(rp.getPelicula()+ "||"+
                   rp.getSala()+ "||"+
                   rp.getHorario()+ "||"+
                   rp.getNiño()+ "||"+
                   rp.getAdulto()+"||"+
                   rp.getAdultoMayor()+"||");
           
           //liberar buffer
           pw.close();
           //enciar mensaje de exito
            JOptionPane.showMessageDialog(null, "Pelicula Registrada");
            
       }catch(Exception ex){//atrapa los errores
           JOptionPane.showMessageDialog(null, "Error Fichero: \n "+
                   ex.getMessage());
       }
    }
    public frmRegistroDePelicula() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        Cantidad();
        ColumnasTablas();
        
        
    }

    
    
    public String[]datos(String datos){
        String []informacion = new String [4];
        if(datos.equalsIgnoreCase("Guason")){
            informacion[0]="2D";
            informacion[1]="DBOX 2D";
//            informacion[2]="3D";
//            informacion[3]="3D DBOX";
        }
        if(datos.equalsIgnoreCase("FROZEN II")){
            informacion[0]="2D";
            informacion[1]="DBOX 2D";
            informacion[2]="3D";
            informacion[3]="DBOX 3D";    
        }
        if(datos.equalsIgnoreCase("PROYECTO GEMINIS")){
            informacion[0]="2D";
            informacion[1]="DBOX 2D";
            informacion[2]="2D XD";
            informacion[3]="DBOX 2D XD";  
        }
        
        return informacion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboSala = new javax.swing.JComboBox<String>();
        cboNiños = new javax.swing.JComboBox<String>();
        cboAdultos = new javax.swing.JComboBox<String>();
        cboAdultoMayor = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroPelicula = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboHorario = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        cboPelicula = new javax.swing.JComboBox<String>();
        btnSiguienteDeRegistro = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        btnButaca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Adulto Mayor:");

        jLabel9.setText("Niños:");

        jLabel4.setText("Sala:");

        tblRegistroPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "title 1", "Title 2", "Title 3", "Title 4", "title 5", "title 6", "title 7"
            }
        ));
        jScrollPane1.setViewportView(tblRegistroPelicula);

        jLabel6.setText("Horario:");

        jLabel7.setText("Adultos:");

        cboHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:30 am", "12:30 pm", "2:45 pm", "4:15 am", "6:30 am", "8:45 am", "10:15 am" }));

        jLabel1.setText("Pelicula:");

        cboPelicula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "GUASON", "FROZEN II", "PROYECTO GEMINIS" }));
        cboPelicula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPeliculaItemStateChanged(evt);
            }
        });

        btnSiguienteDeRegistro.setText("Siguiente");
        btnSiguienteDeRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteDeRegistroActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Dia:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes y Miercoles", "Martes", "Jueves a Domingo y Feriados" }));

        btnButaca.setText("Butaca");
        btnButaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnButacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguienteDeRegistro)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(7, 7, 7))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboNiños, 0, 169, Short.MAX_VALUE)
                                            .addComponent(cboAdultos, 0, 1, Short.MAX_VALUE))
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnButaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cboAdultoMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(cboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(cboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cboAdultoMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)))
                        .addGap(3, 3, 3)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguienteDeRegistro)
                    .addComponent(btnRegistrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboPeliculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPeliculaItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.cboPelicula.getSelectedIndex()>0){
                this.cboSala.setModel(new DefaultComboBoxModel(this.datos(this.cboPelicula.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cboPeliculaItemStateChanged

    private void btnSiguienteDeRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteDeRegistroActionPerformed

        RegistroDePelicula to = new RegistroDePelicula();
//       double aux=0;
//       to.TotalApagar()=aux;
       Pelicula = cboPelicula.getSelectedItem().toString();
       Sala = cboSala.getSelectedItem().toString();
       Horario = cboHorario.getSelectedItem().toString();
       Niño = cboNiños.getSelectedItem().toString();
       Adulto = cboAdultos.getSelectedItem().toString();
       AdultoMayor = cboAdultoMayor.getSelectedItem().toString();
       CantidNiño= cboNiños.getSelectedItem().toString();
       CantidAdultoMayor=cboAdultoMayor.getSelectedItem().toString();
      
      
        frmBill bill = new frmBill();
        bill.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSiguienteDeRegistroActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
//       double i;
        if(cboPelicula.getSelectedItem().toString().length()==0 | cboSala.getSelectedItem().toString().length()==0 | cboHorario.getSelectedItem().toString().length()==0
                | cboNiños.getSelectedItem().toString().length()==0 | cboAdultos.getSelectedItem().toString().length()==0 | cboAdultoMayor.getSelectedItem().toString().length()==0){
            JOptionPane.showMessageDialog(null, "Falta digitar el codigo");
        }
        else {
             EnviarFichero();
             
            RegistroDePelicula obj = new RegistroDePelicula();
            obj.setSala(cboSala.getSelectedItem().toString());
            obj.setDia(jComboBox1.getSelectedItem().toString());
            obj.setPelicula(cboPelicula.getSelectedItem().toString());
            obj.setHorario(cboHorario.getSelectedItem().toString());
            obj.setNiño(cboNiños.getSelectedItem().toString());
            obj.setAdulto(cboAdultos.getSelectedItem().toString());
            obj.setAdultoMayor(cboAdultoMayor.getSelectedItem().toString());
            obj.setCantidadNiño(Integer.parseInt(cboNiños.getSelectedItem().toString()));
            obj.setCantidadAdulto(Integer.parseInt(cboAdultos.getSelectedItem().toString()));
            obj.setCantidadAdultoMayor(Integer.parseInt(cboAdultoMayor.getSelectedItem().toString()));
            
//            txtHol.append("Asiento: "+buta.TotalDeButacas());
            
            Object[] fila = new Object[7];//vector de tipo object, 5 es el tamaño de las columnas
            fila[0]=obj.getPelicula();
            fila[1]=obj.getSala();
            fila[2]=obj.getHorario();
            fila[3]=obj.getNiño();
            fila[4]=obj.getAdulto();
            fila[5]=obj.getAdultoMayor();
            fila[6]=obj.TotalApagar();
            TotalApagar=obj.TotalApagar();
            
        
        modelo.addRow(fila);
        
        cboSala.setSelectedItem("");
        cboPelicula.setSelectedItem("");
        cboHorario.setSelectedItem("");
        cboNiños.setSelectedItem("");
        cboAdultos.setSelectedItem("");
        cboAdultoMayor.setSelectedItem("");
        cboSala.requestFocus();
//        TotalApagar=""+obj.TotalApagar();
//        frmBill bill = new frmBill();
//        bill.setVisible(true);
//        this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnButacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnButacaActionPerformed
        frmButaca but = new frmButaca();
        but.bloq1();
        but.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_btnButacaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroDePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroDePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroDePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroDePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroDePelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnButaca;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSiguienteDeRegistro;
    private javax.swing.JComboBox<String> cboAdultoMayor;
    private javax.swing.JComboBox<String> cboAdultos;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cboNiños;
    private javax.swing.JComboBox<String> cboPelicula;
    private javax.swing.JComboBox<String> cboSala;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistroPelicula;
    // End of variables declaration//GEN-END:variables
}
