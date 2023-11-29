/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_forms;

import Pack_classes.RegistroDePelicula;
import static Pack_forms.frmRegistroDePelicula.TotalApagar;
import java.awt.event.ItemEvent;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Registro_de_pelicula_Trabajador extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    public void ColumnasTablas(){
        modelo.addColumn("Pelicula");
        modelo.addColumn("Sala");
        modelo.addColumn("Horario");
        modelo.addColumn("Entrada Niño");
        modelo.addColumn("Entrada Adulto");
        modelo.addColumn("Entrada AdultoMayor");
        modelo.addColumn("total");
        tblRegistroPeliculaTrabajador.setModel(modelo);
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
         fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\Registro_de_Peli_trabajador.txt", true);
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
    public Registro_de_pelicula_Trabajador() {
        initComponents();
        setLocationRelativeTo(null);
         Cantidad();
        ColumnasTablas();
    }

  public static String Pelicula = "";
    public static String Sala = "";
    public static String Horario = "";
    public static String Niño = "";
    public static String Adulto = "";
    public static String AdultoMayor = "";
    public static String CantidNiño = "";
    public static String CantidAdulto = "";
    public static String CantidAdultoMayor = "";
    public static Double TotalApagar =0.0;
    
    
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboPelicula = new javax.swing.JComboBox<>();
        cboSala = new javax.swing.JComboBox<>();
        cboHorario = new javax.swing.JComboBox<>();
        cboDia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboNiños = new javax.swing.JComboBox<>();
        cboAdultos = new javax.swing.JComboBox<>();
        cboAdultoMayor = new javax.swing.JComboBox<>();
        btnButaca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroPeliculaTrabajador = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pelicula:");

        jLabel2.setText("Sala:");

        jLabel3.setText("Horario:");

        jLabel4.setText("Dia:");

        cboPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "GUASON", "FROZEN II", "PROYECTO GEMINIS" }));
        cboPelicula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPeliculaItemStateChanged(evt);
            }
        });

        cboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:30 am", "12:30 pm", "2:45 pm", "4:15 am", "6:30 am", "8:45 am", "10:15 am" }));

        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes y Miercoles", "Martes", "Jueves a Domingo y Feriados" }));

        jLabel5.setText("Niños:");

        jLabel6.setText("Adultos:");

        jLabel7.setText("Adulto Mayor:");

        btnButaca.setText("Butaca");
        btnButaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnButacaActionPerformed(evt);
            }
        });

        tblRegistroPeliculaTrabajador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistroPeliculaTrabajador);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboPelicula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboAdultos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cboAdultoMayor, 0, 76, Short.MAX_VALUE)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnButaca)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(129, 129, 129)
                .addComponent(btnSiguiente)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(cboNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboAdultoMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnSiguiente)
                    .addComponent(jButton1))
                .addGap(38, 38, 38))
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

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        RegistroDePelicula obj = new RegistroDePelicula();
            obj.setSala(cboSala.getSelectedItem().toString());
            obj.setDia(cboDia.getSelectedItem().toString());
            obj.setPelicula(cboPelicula.getSelectedItem().toString());
            obj.setHorario(cboHorario.getSelectedItem().toString());
            obj.setNiño(cboNiños.getSelectedItem().toString());
            obj.setAdulto(cboAdultos.getSelectedItem().toString());
            obj.setAdultoMayor(cboAdultoMayor.getSelectedItem().toString());
            obj.setCantidadNiño(Integer.parseInt(cboNiños.getSelectedItem().toString()));
            obj.setCantidadAdulto(Integer.parseInt(cboAdultos.getSelectedItem().toString()));
            obj.setCantidadAdultoMayor(Integer.parseInt(cboAdultoMayor.getSelectedItem().toString()));
                
            
            Object[] fila = new Object[7];//vector de tipo object, 5 es el tamaño de las columnas
            fila[0]=obj.getPelicula();
            fila[1]=obj.getSala();
            fila[2]=obj.getHorario();
            fila[3]=obj.getNiño();
            fila[4]=obj.getAdulto();
            fila[5]=obj.getAdultoMayor();
            fila[6]=obj.TotalApagar();
        
            
       Pelicula = cboPelicula.getSelectedItem().toString();
       Sala = cboSala.getSelectedItem().toString();
       Horario = cboHorario.getSelectedItem().toString();
       Niño = cboNiños.getSelectedItem().toString();
       Adulto = cboAdultos.getSelectedItem().toString();
       AdultoMayor = cboAdultoMayor.getSelectedItem().toString();
       CantidNiño= cboNiños.getSelectedItem().toString();
       CantidAdultoMayor=cboAdultoMayor.getSelectedItem().toString();
       TotalApagar = obj.TotalApagar();
      
        frmBillTrabajador bill = new frmBillTrabajador();
        bill.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       if(cboPelicula.getSelectedItem().toString().length()==0 | cboSala.getSelectedItem().toString().length()==0 | cboHorario.getSelectedItem().toString().length()==0
                | cboNiños.getSelectedItem().toString().length()==0 | cboAdultos.getSelectedItem().toString().length()==0 | cboAdultoMayor.getSelectedItem().toString().length()==0){
            JOptionPane.showMessageDialog(null, "Falta digitar el codigo");
        }
        else {
             EnviarFichero();
             
             RegistroDePelicula obj = new RegistroDePelicula();
            obj.setSala(cboSala.getSelectedItem().toString());
            obj.setPelicula(cboPelicula.getSelectedItem().toString());
            obj.setHorario(cboHorario.getSelectedItem().toString());
            obj.setNiño(cboNiños.getSelectedItem().toString());
            obj.setAdulto(cboAdultos.getSelectedItem().toString());
            obj.setAdultoMayor(cboAdultoMayor.getSelectedItem().toString());
            obj.setCantidadNiño(Integer.parseInt(cboNiños.getSelectedItem().toString()));
            obj.setCantidadAdulto(Integer.parseInt(cboAdultos.getSelectedItem().toString()));
            obj.setCantidadAdultoMayor(Integer.parseInt(cboAdultoMayor.getSelectedItem().toString()));
            
            
            Object[] fila = new Object[7];//vector de tipo object, 5 es el tamaño de las columnas
            fila[0]=obj.getPelicula();
            fila[1]=obj.getSala();
            fila[2]=obj.getHorario();
            fila[3]=obj.getNiño();
            fila[4]=obj.getAdulto();
            fila[5]=obj.getAdultoMayor();
//            fila[6]=obj.TotalApagar();
            
        
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
    }//GEN-LAST:event_btnButacaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        INICIO_SESION_TRABAJADORES close = new INICIO_SESION_TRABAJADORES();
        close.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_de_pelicula_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_de_pelicula_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_de_pelicula_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_de_pelicula_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_de_pelicula_Trabajador().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnButaca;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cboAdultoMayor;
    private javax.swing.JComboBox<String> cboAdultos;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cboNiños;
    private javax.swing.JComboBox<String> cboPelicula;
    private javax.swing.JComboBox<String> cboSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistroPeliculaTrabajador;
    // End of variables declaration//GEN-END:variables
}
