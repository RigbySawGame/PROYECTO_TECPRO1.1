/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_forms;

import Pack_classes.AB_PRODUCTOS;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UPN
 */

public class REGISTRO_PRODUCTOS extends javax.swing.JFrame {

    AB_PRODUCTOS obj = new AB_PRODUCTOS();
    
    DefaultTableModel modelo = new DefaultTableModel();
    private void agregar_Columnas(){
        modelo.addColumn("Nombre");
        modelo.addColumn("detalle");
        modelo.addColumn("precio");
        
        tblTrabajadores.setModel(modelo);
    }
    private void Limpieza(){
        txtNombre.setText(null);
        txtDetalles.setText(null);
        txtPrecio.setText(null);           
    }
    
    private void EnviarFichero(){
        /*atrapar posibles errores*/
        try{
            FileWriter fw;
            PrintWriter pw;
            
            //crear el archivo

            fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\productos_reg.txt", true);

            //escribir el archivo
            pw = new PrintWriter(fw);
            //enviar datos al archivo
           // AB_PRODUCTOS obj = new AB_PRODUCTOS();            
            obj.setProdNombre(txtNombre.getText());
            obj.setProDetalles(txtDetalles.getText());
            obj.setProPrecio(Double.parseDouble(txtPrecio.getText()));
            
            pw.println(
                    obj.getProdNombre() + ";" + 
                    obj.getProDetalles() + ";" +
                    obj.getProPrecio()
                    
            );                            
            //liberar buffer
            pw.close();
            //envia mensaje de exito
            JOptionPane.showMessageDialog(null, "Producto Registrado");             
            mostrar_Registro_De_Cajas_Texto_En_Tabla();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error Fichero:\n" +
                    ex.getMessage() );
        }
        
        
    }
    private void mostrar_Registro_De_Cajas_Texto_En_Tabla(){

        obj.setProdNombre(txtNombre.getText());
        obj.setProDetalles(txtDetalles.getText());
        obj.setProPrecio(Double.parseDouble(txtPrecio.getText()));   
        
        Object [] fila = new Object[3];
        fila[0] = obj.getProdNombre();
        fila[1] = obj.getProDetalles();
        fila[2] = obj.getProPrecio();
        
        modelo.addRow(fila);
        
    }
    private void mostrar_Registro_De_Fichero_En_Tabla(){
        
        try{
            File archivo = new File("D:\\PROYECTO_TECPRO\\src\\Data\\productos_reg.txt");
            
            if(archivo.exists()){
                
                FileReader reader = new FileReader(archivo);
                BufferedReader br = new BufferedReader(reader);
                
                String linea;
                
                while((linea = br.readLine()) != null){
                
                StringTokenizer token = new StringTokenizer(linea, ";");
               
                String nombre = token.nextToken().trim();
                String detalle = token.nextToken().trim();
                double precio=Double.parseDouble(token.nextToken().trim());
                
                Object[] obj = new Object[]{
                    
                    nombre, detalle, precio
                };
                        
                modelo.addRow(obj);

            }
                
            br.close();
            }
            else
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo: " + archivo.getName());
        }
        catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
    private void mostrar_Registros_De_Tabla_En_Fichero(){
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try{
         
            fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\productos_reg.txt", true);
            pw = new PrintWriter(fw);
        
            for(int i=0; i<tblTrabajadores.getRowCount(); i++){
            
            pw.println(String.valueOf(tblTrabajadores.getValueAt(i, 0)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 1)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 2)));        
            
            }
        
            pw.close();
        
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());    
        }
        
    }
    
    private void eliminar_Fichero(){
        
        File archivo = new File("D:\\PROYECTO_TECPRO\\src\\Data\\productos_reg.txt");        
        archivo.delete();
    }
    
    private void crear_Fichero(){
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try{
         
            fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\productos_reg.txt", true);
            pw = new PrintWriter(fw);
        
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());    
        }
    }
    private void eliminar_Fila_Tabla(){
        
        int seleccion = tblTrabajadores.getSelectedRow();     
        modelo.removeRow(seleccion);  
    }
    
    
    public REGISTRO_PRODUCTOS() {
        initComponents();
        
        setLocationRelativeTo(null);
        agregar_Columnas();
        mostrar_Registro_De_Fichero_En_Tabla();
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
        txtNombre = new javax.swing.JTextField();
        btnGrabarUsuario = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE PRODUCTOS");

        jLabel1.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

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

        jLabel4.setText("Detalles:");

        txtDetalles.setColumns(20);
        txtDetalles.setRows(5);
        jScrollPane1.setViewportView(txtDetalles);

        jLabel2.setText("Precio:");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTrabajadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabarUsuario)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addGap(88, 88, 88))
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
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabarUsuario)
                    .addComponent(btnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarUsuarioActionPerformed

        EnviarFichero();
        Limpieza();
    }//GEN-LAST:event_btnGrabarUsuarioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        INICIO_SESION_ADMIN_SUB cerrar = new INICIO_SESION_ADMIN_SUB();
        cerrar.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtNombre.setText(null);
        txtDetalles.setText(null);
        txtPrecio.setText(null);  
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminar_Fichero();

        crear_Fichero();

        eliminar_Fila_Tabla();

        mostrar_Registros_De_Tabla_En_Fichero();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

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
            java.util.logging.Logger.getLogger(REGISTRO_PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO_PRODUCTOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabarUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTrabajadores;
    private javax.swing.JTextArea txtDetalles;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
